package com.ood.final_proj.Data;

/**
 *
 */
public class HouseSalad extends Food
{
    private double cost;
    public HouseSalad()
    {
        FoodName = "HouseSalad";
    }
    @Override
    public double cost()
    {
        cost = 4.99;

        return cost;
    }
}
