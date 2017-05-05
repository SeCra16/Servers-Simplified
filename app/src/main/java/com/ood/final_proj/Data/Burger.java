package com.ood.final_proj.Data;

/**
 *
 */
public class Burger extends Food
{

    private double cost;
    public Burger()
    {
        FoodName = "Burger";
    }


    @Override
    public double cost()
    {
        cost = 5.99;
        return cost;
    }
}
