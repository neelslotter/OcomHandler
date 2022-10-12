package com.aizatron.oracle.monitor;


import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Call {

    @SerializedName("mgcp_call_ids")
    @Expose
    private Object mgcpCallIds;
    @SerializedName("code")
    @Expose
    private Object code;
    @SerializedName("mgcp_mgc_ip")
    @Expose
    private Object mgcpMgcIp;
    @SerializedName("dst_codecs")
    @Expose
    private String dstCodecs;
    @SerializedName("dtmf")
    @Expose
    private Integer dtmf;
    @SerializedName("call_id")
    @Expose
    private String callId;
    @SerializedName("q850_state_msg")
    @Expose
    private Object q850StateMsg;
    @SerializedName("egress_devs")
    @Expose
    private String egressDevs;
    @SerializedName("media_types")
    @Expose
    private Object mediaTypes;
    @SerializedName("transfer")
    @Expose
    private Integer transfer;
    @SerializedName("end_ts")
    @Expose
    private Object endTs;
    @SerializedName("dst_ua")
    @Expose
    private String dstUa;
    @SerializedName("state_details")
    @Expose
    private String stateDetails;
    @SerializedName("megaco_mgc_ip")
    @Expose
    private Object megacoMgcIp;
    @SerializedName("pid")
    @Expose
    private Integer pid;
    @SerializedName("MOSlqe_avg")
    @Expose
    private Object mOSlqeAvg;
    @SerializedName("call_time")
    @Expose
    private Object callTime;
    @SerializedName("realms")
    @Expose
    private String realms;
    @SerializedName("opc")
    @Expose
    private Object opc;
    @SerializedName("state_cls")
    @Expose
    private String stateCls;
    @SerializedName("dst_initial_codecs")
    @Expose
    private String dstInitialCodecs;
    @SerializedName("megaco_context_id")
    @Expose
    private Object megacoContextId;
    @SerializedName("diversion_type")
    @Expose
    private Object diversionType;
    @SerializedName("mgcp_txids")
    @Expose
    private Object mgcpTxids;
    @SerializedName("rtcp_streams")
    @Expose
    private Object rtcpStreams;
    @SerializedName("id32")
    @Expose
    private Integer id32;
    @SerializedName("setup_start_ts")
    @Expose
    private String setupStartTs;
    @SerializedName("rpid")
    @Expose
    private String rpid;
    @SerializedName("fraud_action")
    @Expose
    private Object fraudAction;
    @SerializedName("dpc")
    @Expose
    private Object dpc;
    @SerializedName("traversing_devs")
    @Expose
    private String traversingDevs;
    @SerializedName("dst_ip")
    @Expose
    private Object dstIp;
    @SerializedName("gateway_devs")
    @Expose
    private String gatewayDevs;
    @SerializedName("src_ua")
    @Expose
    private String srcUa;
    @SerializedName("state_msg")
    @Expose
    private String stateMsg;
    @SerializedName("q850_code")
    @Expose
    private Object q850Code;
    @SerializedName("megaco_mg_ip")
    @Expose
    private Object megacoMgIp;
    @SerializedName("src_codecs")
    @Expose
    private String srcCodecs;
    @SerializedName("term_devs")
    @Expose
    private String termDevs;
    @SerializedName("reason_hdr")
    @Expose
    private Object reasonHdr;
    @SerializedName("megaco_id")
    @Expose
    private Object megacoId;
    @SerializedName("realms_recordings")
    @Expose
    private Boolean realmsRecordings;
    @SerializedName("mgcp_verbs")
    @Expose
    private Object mgcpVerbs;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("strictly_increasing")
    @Expose
    private String strictlyIncreasing;
    @SerializedName("src_user")
    @Expose
    private String srcUser;
    @SerializedName("rtcp_delay_max")
    @Expose
    private Object rtcpDelayMax;
    @SerializedName("rtcp_delay_avg")
    @Expose
    private Object rtcpDelayAvg;
    @SerializedName("src_user_pref_tag")
    @Expose
    private Object srcUserPrefTag;
    @SerializedName("overload")
    @Expose
    private Integer overload;
    @SerializedName("merged_into_call_id")
    @Expose
    private Object mergedIntoCallId;
    @SerializedName("src_ip")
    @Expose
    private String srcIp;
    @SerializedName("MOSlqe_min")
    @Expose
    private Object mOSlqeMin;
    @SerializedName("megaco_termination_id")
    @Expose
    private Object megacoTerminationId;
    @SerializedName("pai")
    @Expose
    private String pai;
    @SerializedName("prefix_nums")
    @Expose
    private Object prefixNums;
    @SerializedName("mgcp_id")
    @Expose
    private Object mgcpId;
    @SerializedName("ingress_devs")
    @Expose
    private String ingressDevs;
    @SerializedName("setup_time")
    @Expose
    private Integer setupTime;
    @SerializedName("nlegs")
    @Expose
    private Integer nlegs;
    @SerializedName("diversion")
    @Expose
    private Object diversion;
    @SerializedName("megaco_txids")
    @Expose
    private Object megacoTxids;
    @SerializedName("src_initial_codecs")
    @Expose
    private String srcInitialCodecs;
    @SerializedName("q850_state_details")
    @Expose
    private Object q850StateDetails;
    @SerializedName("mgcp_mg_ip")
    @Expose
    private Object mgcpMgIp;
    @SerializedName("init_devs")
    @Expose
    private String initDevs;
    @SerializedName("dst_user")
    @Expose
    private String dstUser;
    @SerializedName("dst_user_pref_tag")
    @Expose
    private Object dstUserPrefTag;
    @SerializedName("setup_delay")
    @Expose
    private Object setupDelay;
    @SerializedName("mgcp_connection_ids")
    @Expose
    private Object mgcpConnectionIds;
    @SerializedName("mgcp_capabilities")
    @Expose
    private Object mgcpCapabilities;
    @SerializedName("setup_delay_type")
    @Expose
    private Object setupDelayType;
    @SerializedName("megaco_cmds")
    @Expose
    private Object megacoCmds;

    public Object getMgcpCallIds() {
        return mgcpCallIds;
    }

    public void setMgcpCallIds(Object mgcpCallIds) {
        this.mgcpCallIds = mgcpCallIds;
    }

    public Object getCode() {
        return code;
    }

    public void setCode(Object code) {
        this.code = code;
    }

    public Object getMgcpMgcIp() {
        return mgcpMgcIp;
    }

    public void setMgcpMgcIp(Object mgcpMgcIp) {
        this.mgcpMgcIp = mgcpMgcIp;
    }

    public String getDstCodecs() {
        return dstCodecs;
    }

    public void setDstCodecs(String dstCodecs) {
        this.dstCodecs = dstCodecs;
    }

    public Integer getDtmf() {
        return dtmf;
    }

    public void setDtmf(Integer dtmf) {
        this.dtmf = dtmf;
    }

    public String getCallId() {
        return callId;
    }

    public void setCallId(String callId) {
        this.callId = callId;
    }

    public Object getQ850StateMsg() {
        return q850StateMsg;
    }

    public void setQ850StateMsg(Object q850StateMsg) {
        this.q850StateMsg = q850StateMsg;
    }

    public String getEgressDevs() {
        return egressDevs;
    }

    public void setEgressDevs(String egressDevs) {
        this.egressDevs = egressDevs;
    }

    public Object getMediaTypes() {
        return mediaTypes;
    }

    public void setMediaTypes(Object mediaTypes) {
        this.mediaTypes = mediaTypes;
    }

    public Integer getTransfer() {
        return transfer;
    }

    public void setTransfer(Integer transfer) {
        this.transfer = transfer;
    }

    public Object getEndTs() {
        return endTs;
    }

    public void setEndTs(Object endTs) {
        this.endTs = endTs;
    }

    public String getDstUa() {
        return dstUa;
    }

    public void setDstUa(String dstUa) {
        this.dstUa = dstUa;
    }

    public String getStateDetails() {
        return stateDetails;
    }

    public void setStateDetails(String stateDetails) {
        this.stateDetails = stateDetails;
    }

    public Object getMegacoMgcIp() {
        return megacoMgcIp;
    }

    public void setMegacoMgcIp(Object megacoMgcIp) {
        this.megacoMgcIp = megacoMgcIp;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Object getMOSlqeAvg() {
        return mOSlqeAvg;
    }

    public void setMOSlqeAvg(Object mOSlqeAvg) {
        this.mOSlqeAvg = mOSlqeAvg;
    }

    public Object getCallTime() {
        return callTime;
    }

    public void setCallTime(Object callTime) {
        this.callTime = callTime;
    }

    public String getRealms() {
        return realms;
    }

    public void setRealms(String realms) {
        this.realms = realms;
    }

    public Object getOpc() {
        return opc;
    }

    public void setOpc(Object opc) {
        this.opc = opc;
    }

    public String getStateCls() {
        return stateCls;
    }

    public void setStateCls(String stateCls) {
        this.stateCls = stateCls;
    }

    public String getDstInitialCodecs() {
        return dstInitialCodecs;
    }

    public void setDstInitialCodecs(String dstInitialCodecs) {
        this.dstInitialCodecs = dstInitialCodecs;
    }

    public Object getMegacoContextId() {
        return megacoContextId;
    }

    public void setMegacoContextId(Object megacoContextId) {
        this.megacoContextId = megacoContextId;
    }

    public Object getDiversionType() {
        return diversionType;
    }

    public void setDiversionType(Object diversionType) {
        this.diversionType = diversionType;
    }

    public Object getMgcpTxids() {
        return mgcpTxids;
    }

    public void setMgcpTxids(Object mgcpTxids) {
        this.mgcpTxids = mgcpTxids;
    }

    public Object getRtcpStreams() {
        return rtcpStreams;
    }

    public void setRtcpStreams(Object rtcpStreams) {
        this.rtcpStreams = rtcpStreams;
    }

    public Integer getId32() {
        return id32;
    }

    public void setId32(Integer id32) {
        this.id32 = id32;
    }

    public String getSetupStartTs() {
        return setupStartTs;
    }

    public void setSetupStartTs(String setupStartTs) {
        this.setupStartTs = setupStartTs;
    }

    public String getRpid() {
        return rpid;
    }

    public void setRpid(String rpid) {
        this.rpid = rpid;
    }

    public Object getFraudAction() {
        return fraudAction;
    }

    public void setFraudAction(Object fraudAction) {
        this.fraudAction = fraudAction;
    }

    public Object getDpc() {
        return dpc;
    }

    public void setDpc(Object dpc) {
        this.dpc = dpc;
    }

    public String getTraversingDevs() {
        return traversingDevs;
    }

    public void setTraversingDevs(String traversingDevs) {
        this.traversingDevs = traversingDevs;
    }

    public Object getDstIp() {
        return dstIp;
    }

    public void setDstIp(Object dstIp) {
        this.dstIp = dstIp;
    }

    public String getGatewayDevs() {
        return gatewayDevs;
    }

    public void setGatewayDevs(String gatewayDevs) {
        this.gatewayDevs = gatewayDevs;
    }

    public String getSrcUa() {
        return srcUa;
    }

    public void setSrcUa(String srcUa) {
        this.srcUa = srcUa;
    }

    public String getStateMsg() {
        return stateMsg;
    }

    public void setStateMsg(String stateMsg) {
        this.stateMsg = stateMsg;
    }

    public Object getQ850Code() {
        return q850Code;
    }

    public void setQ850Code(Object q850Code) {
        this.q850Code = q850Code;
    }

    public Object getMegacoMgIp() {
        return megacoMgIp;
    }

    public void setMegacoMgIp(Object megacoMgIp) {
        this.megacoMgIp = megacoMgIp;
    }

    public String getSrcCodecs() {
        return srcCodecs;
    }

    public void setSrcCodecs(String srcCodecs) {
        this.srcCodecs = srcCodecs;
    }

    public String getTermDevs() {
        return termDevs;
    }

    public void setTermDevs(String termDevs) {
        this.termDevs = termDevs;
    }

    public Object getReasonHdr() {
        return reasonHdr;
    }

    public void setReasonHdr(Object reasonHdr) {
        this.reasonHdr = reasonHdr;
    }

    public Object getMegacoId() {
        return megacoId;
    }

    public void setMegacoId(Object megacoId) {
        this.megacoId = megacoId;
    }

    public Boolean getRealmsRecordings() {
        return realmsRecordings;
    }

    public void setRealmsRecordings(Boolean realmsRecordings) {
        this.realmsRecordings = realmsRecordings;
    }

    public Object getMgcpVerbs() {
        return mgcpVerbs;
    }

    public void setMgcpVerbs(Object mgcpVerbs) {
        this.mgcpVerbs = mgcpVerbs;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStrictlyIncreasing() {
        return strictlyIncreasing;
    }

    public void setStrictlyIncreasing(String strictlyIncreasing) {
        this.strictlyIncreasing = strictlyIncreasing;
    }

    public String getSrcUser() {
        return srcUser;
    }

    public void setSrcUser(String srcUser) {
        this.srcUser = srcUser;
    }

    public Object getRtcpDelayMax() {
        return rtcpDelayMax;
    }

    public void setRtcpDelayMax(Object rtcpDelayMax) {
        this.rtcpDelayMax = rtcpDelayMax;
    }

    public Object getRtcpDelayAvg() {
        return rtcpDelayAvg;
    }

    public void setRtcpDelayAvg(Object rtcpDelayAvg) {
        this.rtcpDelayAvg = rtcpDelayAvg;
    }

    public Object getSrcUserPrefTag() {
        return srcUserPrefTag;
    }

    public void setSrcUserPrefTag(Object srcUserPrefTag) {
        this.srcUserPrefTag = srcUserPrefTag;
    }

    public Integer getOverload() {
        return overload;
    }

    public void setOverload(Integer overload) {
        this.overload = overload;
    }

    public Object getMergedIntoCallId() {
        return mergedIntoCallId;
    }

    public void setMergedIntoCallId(Object mergedIntoCallId) {
        this.mergedIntoCallId = mergedIntoCallId;
    }

    public String getSrcIp() {
        return srcIp;
    }

    public void setSrcIp(String srcIp) {
        this.srcIp = srcIp;
    }

    public Object getMOSlqeMin() {
        return mOSlqeMin;
    }

    public void setMOSlqeMin(Object mOSlqeMin) {
        this.mOSlqeMin = mOSlqeMin;
    }

    public Object getMegacoTerminationId() {
        return megacoTerminationId;
    }

    public void setMegacoTerminationId(Object megacoTerminationId) {
        this.megacoTerminationId = megacoTerminationId;
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    public Object getPrefixNums() {
        return prefixNums;
    }

    public void setPrefixNums(Object prefixNums) {
        this.prefixNums = prefixNums;
    }

    public Object getMgcpId() {
        return mgcpId;
    }

    public void setMgcpId(Object mgcpId) {
        this.mgcpId = mgcpId;
    }

    public String getIngressDevs() {
        return ingressDevs;
    }

    public void setIngressDevs(String ingressDevs) {
        this.ingressDevs = ingressDevs;
    }

    public Integer getSetupTime() {
        return setupTime;
    }

    public void setSetupTime(Integer setupTime) {
        this.setupTime = setupTime;
    }

    public Integer getNlegs() {
        return nlegs;
    }

    public void setNlegs(Integer nlegs) {
        this.nlegs = nlegs;
    }

    public Object getDiversion() {
        return diversion;
    }

    public void setDiversion(Object diversion) {
        this.diversion = diversion;
    }

    public Object getMegacoTxids() {
        return megacoTxids;
    }

    public void setMegacoTxids(Object megacoTxids) {
        this.megacoTxids = megacoTxids;
    }

    public String getSrcInitialCodecs() {
        return srcInitialCodecs;
    }

    public void setSrcInitialCodecs(String srcInitialCodecs) {
        this.srcInitialCodecs = srcInitialCodecs;
    }

    public Object getQ850StateDetails() {
        return q850StateDetails;
    }

    public void setQ850StateDetails(Object q850StateDetails) {
        this.q850StateDetails = q850StateDetails;
    }

    public Object getMgcpMgIp() {
        return mgcpMgIp;
    }

    public void setMgcpMgIp(Object mgcpMgIp) {
        this.mgcpMgIp = mgcpMgIp;
    }

    public String getInitDevs() {
        return initDevs;
    }

    public void setInitDevs(String initDevs) {
        this.initDevs = initDevs;
    }

    public String getDstUser() {
        return dstUser;
    }

    public void setDstUser(String dstUser) {
        this.dstUser = dstUser;
    }

    public Object getDstUserPrefTag() {
        return dstUserPrefTag;
    }

    public void setDstUserPrefTag(Object dstUserPrefTag) {
        this.dstUserPrefTag = dstUserPrefTag;
    }

    public Object getSetupDelay() {
        return setupDelay;
    }

    public void setSetupDelay(Object setupDelay) {
        this.setupDelay = setupDelay;
    }

    public Object getMgcpConnectionIds() {
        return mgcpConnectionIds;
    }

    public void setMgcpConnectionIds(Object mgcpConnectionIds) {
        this.mgcpConnectionIds = mgcpConnectionIds;
    }

    public Object getMgcpCapabilities() {
        return mgcpCapabilities;
    }

    public void setMgcpCapabilities(Object mgcpCapabilities) {
        this.mgcpCapabilities = mgcpCapabilities;
    }

    public Object getSetupDelayType() {
        return setupDelayType;
    }

    public void setSetupDelayType(Object setupDelayType) {
        this.setupDelayType = setupDelayType;
    }

    public Object getMegacoCmds() {
        return megacoCmds;
    }

    public void setMegacoCmds(Object megacoCmds) {
        this.megacoCmds = megacoCmds;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Call.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("mgcpCallIds");
        sb.append('=');
        sb.append(((this.mgcpCallIds == null)?"<null>":this.mgcpCallIds));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("mgcpMgcIp");
        sb.append('=');
        sb.append(((this.mgcpMgcIp == null)?"<null>":this.mgcpMgcIp));
        sb.append(',');
        sb.append("dstCodecs");
        sb.append('=');
        sb.append(((this.dstCodecs == null)?"<null>":this.dstCodecs));
        sb.append(',');
        sb.append("dtmf");
        sb.append('=');
        sb.append(((this.dtmf == null)?"<null>":this.dtmf));
        sb.append(',');
        sb.append("callId");
        sb.append('=');
        sb.append(((this.callId == null)?"<null>":this.callId));
        sb.append(',');
        sb.append("q850StateMsg");
        sb.append('=');
        sb.append(((this.q850StateMsg == null)?"<null>":this.q850StateMsg));
        sb.append(',');
        sb.append("egressDevs");
        sb.append('=');
        sb.append(((this.egressDevs == null)?"<null>":this.egressDevs));
        sb.append(',');
        sb.append("mediaTypes");
        sb.append('=');
        sb.append(((this.mediaTypes == null)?"<null>":this.mediaTypes));
        sb.append(',');
        sb.append("transfer");
        sb.append('=');
        sb.append(((this.transfer == null)?"<null>":this.transfer));
        sb.append(',');
        sb.append("endTs");
        sb.append('=');
        sb.append(((this.endTs == null)?"<null>":this.endTs));
        sb.append(',');
        sb.append("dstUa");
        sb.append('=');
        sb.append(((this.dstUa == null)?"<null>":this.dstUa));
        sb.append(',');
        sb.append("stateDetails");
        sb.append('=');
        sb.append(((this.stateDetails == null)?"<null>":this.stateDetails));
        sb.append(',');
        sb.append("megacoMgcIp");
        sb.append('=');
        sb.append(((this.megacoMgcIp == null)?"<null>":this.megacoMgcIp));
        sb.append(',');
        sb.append("pid");
        sb.append('=');
        sb.append(((this.pid == null)?"<null>":this.pid));
        sb.append(',');
        sb.append("mOSlqeAvg");
        sb.append('=');
        sb.append(((this.mOSlqeAvg == null)?"<null>":this.mOSlqeAvg));
        sb.append(',');
        sb.append("callTime");
        sb.append('=');
        sb.append(((this.callTime == null)?"<null>":this.callTime));
        sb.append(',');
        sb.append("realms");
        sb.append('=');
        sb.append(((this.realms == null)?"<null>":this.realms));
        sb.append(',');
        sb.append("opc");
        sb.append('=');
        sb.append(((this.opc == null)?"<null>":this.opc));
        sb.append(',');
        sb.append("stateCls");
        sb.append('=');
        sb.append(((this.stateCls == null)?"<null>":this.stateCls));
        sb.append(',');
        sb.append("dstInitialCodecs");
        sb.append('=');
        sb.append(((this.dstInitialCodecs == null)?"<null>":this.dstInitialCodecs));
        sb.append(',');
        sb.append("megacoContextId");
        sb.append('=');
        sb.append(((this.megacoContextId == null)?"<null>":this.megacoContextId));
        sb.append(',');
        sb.append("diversionType");
        sb.append('=');
        sb.append(((this.diversionType == null)?"<null>":this.diversionType));
        sb.append(',');
        sb.append("mgcpTxids");
        sb.append('=');
        sb.append(((this.mgcpTxids == null)?"<null>":this.mgcpTxids));
        sb.append(',');
        sb.append("rtcpStreams");
        sb.append('=');
        sb.append(((this.rtcpStreams == null)?"<null>":this.rtcpStreams));
        sb.append(',');
        sb.append("id32");
        sb.append('=');
        sb.append(((this.id32 == null)?"<null>":this.id32));
        sb.append(',');
        sb.append("setupStartTs");
        sb.append('=');
        sb.append(((this.setupStartTs == null)?"<null>":this.setupStartTs));
        sb.append(',');
        sb.append("rpid");
        sb.append('=');
        sb.append(((this.rpid == null)?"<null>":this.rpid));
        sb.append(',');
        sb.append("fraudAction");
        sb.append('=');
        sb.append(((this.fraudAction == null)?"<null>":this.fraudAction));
        sb.append(',');
        sb.append("dpc");
        sb.append('=');
        sb.append(((this.dpc == null)?"<null>":this.dpc));
        sb.append(',');
        sb.append("traversingDevs");
        sb.append('=');
        sb.append(((this.traversingDevs == null)?"<null>":this.traversingDevs));
        sb.append(',');
        sb.append("dstIp");
        sb.append('=');
        sb.append(((this.dstIp == null)?"<null>":this.dstIp));
        sb.append(',');
        sb.append("gatewayDevs");
        sb.append('=');
        sb.append(((this.gatewayDevs == null)?"<null>":this.gatewayDevs));
        sb.append(',');
        sb.append("srcUa");
        sb.append('=');
        sb.append(((this.srcUa == null)?"<null>":this.srcUa));
        sb.append(',');
        sb.append("stateMsg");
        sb.append('=');
        sb.append(((this.stateMsg == null)?"<null>":this.stateMsg));
        sb.append(',');
        sb.append("q850Code");
        sb.append('=');
        sb.append(((this.q850Code == null)?"<null>":this.q850Code));
        sb.append(',');
        sb.append("megacoMgIp");
        sb.append('=');
        sb.append(((this.megacoMgIp == null)?"<null>":this.megacoMgIp));
        sb.append(',');
        sb.append("srcCodecs");
        sb.append('=');
        sb.append(((this.srcCodecs == null)?"<null>":this.srcCodecs));
        sb.append(',');
        sb.append("termDevs");
        sb.append('=');
        sb.append(((this.termDevs == null)?"<null>":this.termDevs));
        sb.append(',');
        sb.append("reasonHdr");
        sb.append('=');
        sb.append(((this.reasonHdr == null)?"<null>":this.reasonHdr));
        sb.append(',');
        sb.append("megacoId");
        sb.append('=');
        sb.append(((this.megacoId == null)?"<null>":this.megacoId));
        sb.append(',');
        sb.append("realmsRecordings");
        sb.append('=');
        sb.append(((this.realmsRecordings == null)?"<null>":this.realmsRecordings));
        sb.append(',');
        sb.append("mgcpVerbs");
        sb.append('=');
        sb.append(((this.mgcpVerbs == null)?"<null>":this.mgcpVerbs));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("strictlyIncreasing");
        sb.append('=');
        sb.append(((this.strictlyIncreasing == null)?"<null>":this.strictlyIncreasing));
        sb.append(',');
        sb.append("srcUser");
        sb.append('=');
        sb.append(((this.srcUser == null)?"<null>":this.srcUser));
        sb.append(',');
        sb.append("rtcpDelayMax");
        sb.append('=');
        sb.append(((this.rtcpDelayMax == null)?"<null>":this.rtcpDelayMax));
        sb.append(',');
        sb.append("rtcpDelayAvg");
        sb.append('=');
        sb.append(((this.rtcpDelayAvg == null)?"<null>":this.rtcpDelayAvg));
        sb.append(',');
        sb.append("srcUserPrefTag");
        sb.append('=');
        sb.append(((this.srcUserPrefTag == null)?"<null>":this.srcUserPrefTag));
        sb.append(',');
        sb.append("overload");
        sb.append('=');
        sb.append(((this.overload == null)?"<null>":this.overload));
        sb.append(',');
        sb.append("mergedIntoCallId");
        sb.append('=');
        sb.append(((this.mergedIntoCallId == null)?"<null>":this.mergedIntoCallId));
        sb.append(',');
        sb.append("srcIp");
        sb.append('=');
        sb.append(((this.srcIp == null)?"<null>":this.srcIp));
        sb.append(',');
        sb.append("mOSlqeMin");
        sb.append('=');
        sb.append(((this.mOSlqeMin == null)?"<null>":this.mOSlqeMin));
        sb.append(',');
        sb.append("megacoTerminationId");
        sb.append('=');
        sb.append(((this.megacoTerminationId == null)?"<null>":this.megacoTerminationId));
        sb.append(',');
        sb.append("pai");
        sb.append('=');
        sb.append(((this.pai == null)?"<null>":this.pai));
        sb.append(',');
        sb.append("prefixNums");
        sb.append('=');
        sb.append(((this.prefixNums == null)?"<null>":this.prefixNums));
        sb.append(',');
        sb.append("mgcpId");
        sb.append('=');
        sb.append(((this.mgcpId == null)?"<null>":this.mgcpId));
        sb.append(',');
        sb.append("ingressDevs");
        sb.append('=');
        sb.append(((this.ingressDevs == null)?"<null>":this.ingressDevs));
        sb.append(',');
        sb.append("setupTime");
        sb.append('=');
        sb.append(((this.setupTime == null)?"<null>":this.setupTime));
        sb.append(',');
        sb.append("nlegs");
        sb.append('=');
        sb.append(((this.nlegs == null)?"<null>":this.nlegs));
        sb.append(',');
        sb.append("diversion");
        sb.append('=');
        sb.append(((this.diversion == null)?"<null>":this.diversion));
        sb.append(',');
        sb.append("megacoTxids");
        sb.append('=');
        sb.append(((this.megacoTxids == null)?"<null>":this.megacoTxids));
        sb.append(',');
        sb.append("srcInitialCodecs");
        sb.append('=');
        sb.append(((this.srcInitialCodecs == null)?"<null>":this.srcInitialCodecs));
        sb.append(',');
        sb.append("q850StateDetails");
        sb.append('=');
        sb.append(((this.q850StateDetails == null)?"<null>":this.q850StateDetails));
        sb.append(',');
        sb.append("mgcpMgIp");
        sb.append('=');
        sb.append(((this.mgcpMgIp == null)?"<null>":this.mgcpMgIp));
        sb.append(',');
        sb.append("initDevs");
        sb.append('=');
        sb.append(((this.initDevs == null)?"<null>":this.initDevs));
        sb.append(',');
        sb.append("dstUser");
        sb.append('=');
        sb.append(((this.dstUser == null)?"<null>":this.dstUser));
        sb.append(',');
        sb.append("dstUserPrefTag");
        sb.append('=');
        sb.append(((this.dstUserPrefTag == null)?"<null>":this.dstUserPrefTag));
        sb.append(',');
        sb.append("setupDelay");
        sb.append('=');
        sb.append(((this.setupDelay == null)?"<null>":this.setupDelay));
        sb.append(',');
        sb.append("mgcpConnectionIds");
        sb.append('=');
        sb.append(((this.mgcpConnectionIds == null)?"<null>":this.mgcpConnectionIds));
        sb.append(',');
        sb.append("mgcpCapabilities");
        sb.append('=');
        sb.append(((this.mgcpCapabilities == null)?"<null>":this.mgcpCapabilities));
        sb.append(',');
        sb.append("setupDelayType");
        sb.append('=');
        sb.append(((this.setupDelayType == null)?"<null>":this.setupDelayType));
        sb.append(',');
        sb.append("megacoCmds");
        sb.append('=');
        sb.append(((this.megacoCmds == null)?"<null>":this.megacoCmds));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}