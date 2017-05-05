package com.ood.final_proj.Data;

/**
 *
 */
public class Pizza extends Food
{
    private double cost;

    public Pizza()
    {
        FoodName = "Pizza";
    }

    @Override
    public String getDescription()
    {
        return super.getDescription();
    }

    @Override
    public double cost()
    {
        cost = 10.99;
        return cost;
    }
}
