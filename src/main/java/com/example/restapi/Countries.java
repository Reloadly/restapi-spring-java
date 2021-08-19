package com.example.restapi;

import java.util.List;

public class Countries {

    private String isoName;
    private String name;
    private String currencyCode;
    private String currencyName;
    private String currencySymbol;
    private String flag;
    private List<String> callingCodes;

    public Countries() {
    }

    public String getIsoName() {
        return isoName;
    }

    public void setIsoName(String isoName) {
        this.isoName = isoName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }

    public String getFlag() {
        return flag;
    }
    public void setFlag(String flag) {
        this.flag = flag;
    }

    public List<String> getCallingCodes() {
        return callingCodes;
    }

    public void setCallingCodes(List<String> callingCodes) {
        this.callingCodes = callingCodes;
    }

    @Override
    public String toString() {
        return "Country{" +
                "isoName='" + isoName + '\'' +
                "name='" + name + '\'' +
                "currencyCode='" + currencyCode + '\'' +
                "currencyName='" + currencyName + '\'' +
                "currencySymbol='" + currencySymbol + '\'' +
                "flag='" + flag + '\'' +
                "callingCodes='" + callingCodes + '\'' +
                '}';
    }
}
