package com.mariacesarotti.embraer_api.dto;

import java.util.List;

public class CalculationRequest {

    private Integer n;
    private List<Integer> E;
    private List<Integer> S;

    public CalculationRequest() {
    }

    public Integer getN() {
        return n;
    }

    public void setN(Integer n) {
        this.n = n;
    }

    public List<Integer> getE() {
        return E;
    }

    public void setE(List<Integer> E) {
        this.E = E;
    }

    public List<Integer> getS() {
        return S;
    }

    public void setS(List<Integer> S) {
        this.S = S;
    }
}
