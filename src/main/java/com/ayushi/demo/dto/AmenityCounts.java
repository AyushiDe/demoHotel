
package com.ayushi.demo.dto;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class AmenityCounts {

    @SerializedName("KITCHEN")
    @Expose
    private Integer kitchen;
    @SerializedName("PETALLOW")
    @Expose
    private Integer petallow;
    @SerializedName("RESTRNT")
    @Expose
    private Integer restrnt;
    @SerializedName("FINTRNT")
    @Expose
    private Integer fintrnt;
    @SerializedName("FBRKFST")
    @Expose
    private Integer fbrkfst;
    @SerializedName("HEALTHSVCS")
    @Expose
    private Integer healthsvcs;
    @SerializedName("FITSPA")
    @Expose
    private Integer fitspa;
    @SerializedName("FINTRPUB")
    @Expose
    private Integer fintrpub;
    @SerializedName("NSMKFAC")
    @Expose
    private Integer nsmkfac;
    @SerializedName("HANDFAC")
    @Expose
    private Integer handfac;

    public Integer getKitchen() {
        return kitchen;
    }

    public void setKitchen(Integer kitchen) {
        this.kitchen = kitchen;
    }

    public Integer getPetallow() {
        return petallow;
    }

    public void setPetallow(Integer petallow) {
        this.petallow = petallow;
    }

    public Integer getRestrnt() {
        return restrnt;
    }

    public void setRestrnt(Integer restrnt) {
        this.restrnt = restrnt;
    }

    public Integer getFintrnt() {
        return fintrnt;
    }

    public void setFintrnt(Integer fintrnt) {
        this.fintrnt = fintrnt;
    }

    public Integer getFbrkfst() {
        return fbrkfst;
    }

    public void setFbrkfst(Integer fbrkfst) {
        this.fbrkfst = fbrkfst;
    }

    public Integer getHealthsvcs() {
        return healthsvcs;
    }

    public void setHealthsvcs(Integer healthsvcs) {
        this.healthsvcs = healthsvcs;
    }

    public Integer getFitspa() {
        return fitspa;
    }

    public void setFitspa(Integer fitspa) {
        this.fitspa = fitspa;
    }

    public Integer getFintrpub() {
        return fintrpub;
    }

    public void setFintrpub(Integer fintrpub) {
        this.fintrpub = fintrpub;
    }

    public Integer getNsmkfac() {
        return nsmkfac;
    }

    public void setNsmkfac(Integer nsmkfac) {
        this.nsmkfac = nsmkfac;
    }

    public Integer getHandfac() {
        return handfac;
    }

    public void setHandfac(Integer handfac) {
        this.handfac = handfac;
    }

}
