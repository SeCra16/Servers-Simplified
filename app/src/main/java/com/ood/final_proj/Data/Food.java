package com.ood.final_proj.Data;

/**
 * The parent class for all the menu items
 */
public abstract class Food
{
   protected String FoodName = "Generic Food";

    public String getDescription()
    {
        return FoodName;
    }

    public abstract double cost();
}
