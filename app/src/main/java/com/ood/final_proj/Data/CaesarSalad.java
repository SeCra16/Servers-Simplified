package com.ood.final_proj.Data;

/**
 *
 */
public class CaesarSalad extends Food
{
    private double cost;
    public CaesarSalad()
    {
        FoodName = "CaesarSalad";
    }
    @Override
    public double cost()
    {
        cost = 4.99;
        return cost;
    }
}
