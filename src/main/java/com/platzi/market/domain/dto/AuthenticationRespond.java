package com.platzi.market.domain.dto;

public class AuthenticationRespond {

    private String jkt;

    public AuthenticationRespond(String jkt) {
        this.jkt = jkt;
    }

    public String getJkt() {
        return jkt;
    }

    public void setJkt(String jkt) {
        this.jkt = jkt;
    }
}
