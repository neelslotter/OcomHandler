package com.aizatron.oracle.monitor;

import io.pkts.PacketHandler;
import io.pkts.Pcap;
import io.pkts.buffer.Buffer;
import io.pkts.packet.IPPacket;
import io.pkts.packet.Packet;
import io.pkts.packet.TransportPacket;
import io.pkts.packet.UDPPacket;
import io.pkts.packet.sip.SipMessage;
import io.pkts.packet.sip.SipPacket;
import io.pkts.protocol.Protocol;
import io.pkts.sdp.RTPInfo;
import io.pkts.sdp.SDP;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * neelslotter@gmail.com
 *
 */
public class PcapHandler {

    private InputStream mInputStream;
    public PcapHandler(InputStream aInputStream){
        this.mInputStream = aInputStream;
    }

    public List<SipMessage> GetPcapData() throws IOException {

        final List<RTPInfo> rtpInfo = new ArrayList<>();
        final List<SipMessage> sipMessages = new ArrayList<>();
        final Pcap pcap = Pcap.openStream(mInputStream);
        SipMessage sipMessage;

        pcap.loop(new PacketHandler() {
            @Override
            public boolean nextPacket(final Packet packet) throws IOException {

                getTransportPacket(packet).ifPresent(transportPacket -> {

                    final int sourcePort = transportPacket.getSourcePort();
                    final int destPort = transportPacket.getDestinationPort();
                    final IPPacket ip = transportPacket.getParentPacket();
                    final String destIp = ip.getDestinationIP();
                    final String sourceIp = ip.getSourceIP();

                    try {
                        final SipMessage msg = SipMessage.frame(packet.getPacket(Protocol.UDP).getPayload());
                        sipMessages.add(SipMessage.frame(packet.getPacket(Protocol.UDP).getPayload()));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });

                // Signal to the pcap loop that you're still "happy" and want to continue
                // parsing the remainder of the pcap.
                return true;
            }
        });

        return sipMessages;
    }

    private static Optional<TransportPacket> getTransportPacket(final Packet packet) throws IOException {
        if (packet.hasProtocol(Protocol.TCP)) {
            return Optional.of((TransportPacket) packet.getPacket(Protocol.TCP));
        }

        if (packet.hasProtocol(Protocol.UDP)) {
            return Optional.of((TransportPacket) packet.getPacket(Protocol.UDP));
        }
        return Optional.empty();
    }
}
