package com.ood.final_proj.Data;

/**
 *
 */
public class FriedChicken extends Food
{
    private double cost;

    public FriedChicken()
    {
        FoodName = "FriedChicken";
    }
    @Override
    public double cost()
    {
        cost = 10.99;
        return cost;
    }
}
