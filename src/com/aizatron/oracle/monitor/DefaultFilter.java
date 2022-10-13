package com.aizatron.oracle.monitor;


/**
 * The program implements Oracle's OCOM REST API filters
 * to be used for searching
 *
 * @author  Neels Lötter
 * @version 0.0.1
 * @since   2022-10-13
 */

public class DefaultFilter {

    private String mAlias;
    private String mOlderTS;
    private String mDate1;
    private String mDate2;
    private String mLimit;
    private String mSrcNumber;
    private String mStatus;


    public String getmStatus() {
        return mStatus;
    }

    public void setmStatus(String mStatus) {
        this.mStatus = mStatus;
    }

    public String getmLimit() {
        return mLimit;
    }

    public void setmLimit(String mLimit) {
        this.mLimit = mLimit;
    }

    public String getmSrcNumber() {
        return mSrcNumber;
    }

    public void setmSrcNumber(String mSrcNumber) {
        this.mSrcNumber = mSrcNumber;
    }

    /**
     *
     * @param aOlderTS
     * @param aAlias
     * @param aDate1
     * @param aDate2
     * @param aLimit
     * @param aSrcNumber
     */
    DefaultFilter(String aOlderTS, String aAlias,
                  String aDate1, String aDate2,
                  String aLimit, String aSrcNumber) {
        this.mOlderTS = aOlderTS;
        this.mAlias = aAlias;
        this.mDate1 = aDate1;
        this.mDate2 = aDate2;
        this.mLimit = aLimit;
        this.mSrcNumber = aSrcNumber;
    }


    public String getmAlias() {
        return mAlias;
    }

    public void setmAlias(String mAlias) {
        this.mAlias = mAlias;
    }

    public String getmOlderTS() {
        return mOlderTS;
    }

    public void setmOlderTS(String mOlderTS) {
        this.mOlderTS = mOlderTS;
    }

    public String getmDate1() {
        return mDate1;
    }

    public void setmDate1(String mDate1) {
        this.mDate1 = mDate1;
    }

    public String getmDate2() {
        return mDate2;
    }

    public void setmDate2(String mDate2) {
        this.mDate2 = mDate2;
    }


    //{"field":"src_user","data":{"type":"enterkeystringfilter","value":"+27537232373"}},
    // {"field":"setup_start_ts","data":{"type":"datetime","comparison":"gt","value":"2022-10-11 00:00:00"}},
    // {"field":"end_ts","data":{"type":"datetime","comparison":"lt","value":"2022-10-11 11:00:00"}}]
    //older_than_ts=1665477899000&limit=19&no_aliases=false&filters=

    @Override
    public String toString() {
        return
                "older_than_ts=" + mOlderTS +
                        "&" +
                        "limit=" + mLimit +
                        "&" +
                        "no_aliases=" + mAlias +
                        "&" +
                        "filters=[" +
                        "{\"field\":\"src_user\",\"data\":{\"type\":\"enterkeystringfilter\",\"value\":\""
                        + mSrcNumber +
                        "\"}}," +
                        "{\"field\":\"setup_start_ts\",\"data\":{\"type\":\"datetime\",\"comparison\":\"gt\",\"value\":\"" +
                        mDate1 +
                        "\"}}," +
                        "{\"field\":\"end_ts\",\"data\":{\"type\":\"datetime\",\"comparison\":\"lt\",\"value\":\"" +
                        mDate2 +
                        "\"}}]";
    }
}
