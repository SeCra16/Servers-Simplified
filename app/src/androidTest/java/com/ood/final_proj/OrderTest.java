package com.ood.final_proj;

import android.test.AndroidTestCase;
import com.ood.final_proj.Data.Burger;


public class OrderTest extends AndroidTestCase {
    public void testID() throws Exception {
        Order order = new Order();
        order.setID(1);
        assertEquals(order.getId(), 1);
    }

    public void testDescription() throws Exception {
        Order order = new Order();
        order.setOrderDescription("Pizza");
        assertEquals(order.getOrderDescription(), "Pizza");
    }

    public void testFood() throws Exception {
        Order order = new Order();
        Burger burger = new Burger();
        order.setFood(burger);
        assertEquals(order.getFood(), burger);
    }

    public void testCost() throws Exception {
        Order order = new Order();
        order.setCost(5.99);
        assertEquals(order.getCost(), 5.99);
    }
}