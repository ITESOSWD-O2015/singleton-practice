package com.iteso.singleton;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by Aldo on 03/11/2015.
 */
public class DishTest {

    private Dish dish;

    @Before
    public void setUp(){
        dish = new Dish();
    }

    @Test
    public void testPrice(){
        dish.setPrice(10);
        assertEquals(10, dish.getPrice(), 0);
    }

    @Test
    public void testDescription(){
        dish.setDescription("pepsi");
        assertEquals("pepsi", dish.getDescription());
    }

    @Test
    public void testName(){
        dish.setName("refresco");
        assertEquals("refresco", dish.getName());
    }
}
