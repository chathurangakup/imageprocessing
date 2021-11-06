package com.lathusha.imageprocessing;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.File;

public class Data {
    @SerializedName("culture")
    @Expose
    private String culture;
    @SerializedName("diseaseName")
    @Expose
    private String diseaseName;
    @SerializedName("method")
    @Expose
    private String method;
    @SerializedName("pesticide")
    @Expose
    private String pesticide;

    public Data(String culture, String diseaseName, String method, String pesticide) {
        this.culture = culture;
        this.diseaseName = diseaseName;
        this.method = method;
        this.pesticide = pesticide;
    }

    public String getCulture() {
        return culture;
    }

    public void setCulture(String culture) {
        this.culture = culture;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getPesticide() {
        return pesticide;
    }

    public void setPesticide(String pesticide) {
        this.pesticide = pesticide;
    }
}
