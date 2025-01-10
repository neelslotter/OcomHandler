package com.aizatron.oracle.monitor;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


@Generated("jsonschema2pojo")
public class AvailablePcaps {

    @SerializedName("available")
    @Expose
    private List<Available> available = null;
    @SerializedName("success")
    @Expose
    private Boolean success;

    public List<Available> getAvailable() {
        return available;
    }

    public void setAvailable(List<Available> available) {
        this.available = available;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

}
