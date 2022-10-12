package com.aizatron.oracle.monitor;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class CallObject {

    @SerializedName("predicate")
    @Expose
    private String predicate;
    @SerializedName("success")
    @Expose
    private Boolean success;
    @SerializedName("calls")
    @Expose
    private List<Call> calls = null;
    @SerializedName("search_range")
    @Expose
    private Integer searchRange;
    @SerializedName("first_page")
    @Expose
    private Boolean firstPage;
    @SerializedName("last_page")
    @Expose
    private Boolean lastPage;
    @SerializedName("next_value")
    @Expose
    private String nextValue;

    public String getPredicate() {
        return predicate;
    }

    public void setPredicate(String predicate) {
        this.predicate = predicate;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public List<Call> getCalls() {
        return calls;
    }

    public void setCalls(List<Call> calls) {
        this.calls = calls;
    }

    public Integer getSearchRange() {
        return searchRange;
    }

    public void setSearchRange(Integer searchRange) {
        this.searchRange = searchRange;
    }

    public Boolean getFirstPage() {
        return firstPage;
    }

    public void setFirstPage(Boolean firstPage) {
        this.firstPage = firstPage;
    }

    public Boolean getLastPage() {
        return lastPage;
    }

    public void setLastPage(Boolean lastPage) {
        this.lastPage = lastPage;
    }

    public String getNextValue() {
        return nextValue;
    }

    public void setNextValue(String nextValue) {
        this.nextValue = nextValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CallObject.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("predicate");
        sb.append('=');
        sb.append(((this.predicate == null)?"<null>":this.predicate));
        sb.append(',');
        sb.append("success");
        sb.append('=');
        sb.append(((this.success == null)?"<null>":this.success));
        sb.append(',');
        sb.append("calls");
        sb.append('=');
        sb.append(((this.calls == null)?"<null>":this.calls));
        sb.append(',');
        sb.append("searchRange");
        sb.append('=');
        sb.append(((this.searchRange == null)?"<null>":this.searchRange));
        sb.append(',');
        sb.append("firstPage");
        sb.append('=');
        sb.append(((this.firstPage == null)?"<null>":this.firstPage));
        sb.append(',');
        sb.append("lastPage");
        sb.append('=');
        sb.append(((this.lastPage == null)?"<null>":this.lastPage));
        sb.append(',');
        sb.append("nextValue");
        sb.append('=');
        sb.append(((this.nextValue == null)?"<null>":this.nextValue));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}