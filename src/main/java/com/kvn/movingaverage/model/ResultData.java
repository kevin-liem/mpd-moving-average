package com.kvn.movingaverage.model;

/**
 * Created by deepn on 12/1/2016.
 */
public class ResultData {
    private Integer n;
    private Integer T;
    private Float Tvalue;
    private Float errorValue;

    public Integer getN() {
        return n;
    }

    public void setN(Integer n) {
        this.n = n;
    }

    public Integer getT() {
        return T;
    }

    public void setT(Integer t) {
        T = t;
    }

    public Float getTvalue() {
        return Tvalue;
    }

    public void setTvalue(Float tvalue) {
        Tvalue = tvalue;
    }

    public Float getErrorValue() {
        return errorValue;
    }

    public void setErrorValue(Float errorValue) {
        this.errorValue = errorValue;
    }
}
