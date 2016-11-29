package com.kvn.movingaverage.model;

/**
 * Created by deepn on 11/29/2016.
 */
public class PredictionData {
    private Integer Tvalue;
    private Integer errorValue;

    public Integer getTvalue() {
        return Tvalue;
    }

    public void setTvalue(Integer tvalue) {
        Tvalue = tvalue;
    }

    public Integer getErrorValue() {
        return errorValue;
    }

    public void setErrorValue(Integer errorValue) {
        this.errorValue = errorValue;
    }
}
