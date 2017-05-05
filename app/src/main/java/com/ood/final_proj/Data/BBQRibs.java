package com.ood.final_proj.Data;

/**
 *
 */
public class BBQRibs extends Food
{
    private double cost;

    public BBQRibs()
    {
        FoodName = "BBQRibs";
    }
    @Override
    public double cost()
    {
        cost = 19.95;
        return cost;
    }
}
