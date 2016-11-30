package com.kvn.movingaverage.model;

/**
 * Created by deepn on 11/29/2016.
 */
public class PredictionData {
    private Float Tvalue;
    private Float errorValue;

    public PredictionData(Float tvalue, Float errorValue) {
        Tvalue = tvalue;
        this.errorValue = errorValue;
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
