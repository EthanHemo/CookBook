package com.hemo.ethan.cookbook;

import java.io.Serializable;

/**
 * Created by Shane on 05/06/2016.
 */
public class Ingredient implements Serializable {
    private String mName;
    private MeasurementType mType;
    private float mAmount;

    public Ingredient() {
    }

    public Ingredient(float Amount, String Name, MeasurementType Type) {
        this.mAmount = Amount;
        this.mName = Name;
        this.mType = Type;
    }

    public float getAmount() {
        return mAmount;
    }

    public void setAmount(float Amount) {
        this.mAmount = Amount;
    }

    public String getName() {
        return mName;
    }

    public void setName(String Name) {
        this.mName = Name;
    }

    public MeasurementType getmType() {
        return mType;
    }

    public void setType(MeasurementType Type) {
        this.mType = Type;
    }
}


