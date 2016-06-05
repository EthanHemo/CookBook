package com.hemo.ethan.cookbook;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Shane on 05/06/2016.
 */
public class Recipe implements Serializable {
    private ArrayList<Ingredient> mIngredients;

    public Recipe() {
        mIngredients = new ArrayList<Ingredient>();
    }

    public Recipe(ArrayList<Ingredient> mIngredients) {
        this.mIngredients = new ArrayList<Ingredient>();
        this.mIngredients.addAll(mIngredients);
    }

    public ArrayList<Ingredient> getmIngredients() {
        return mIngredients;
    }

    public void setmIngredients(ArrayList<Ingredient> mIngredients) {
        this.mIngredients = mIngredients;
    }

    public String Test()
    {
        return mIngredients.get(0).getName();
    }
}
