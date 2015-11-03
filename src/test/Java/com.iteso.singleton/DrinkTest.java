package com.iteso.singleton;

import org.junit.*;
import static org.junit.Assert.assertEquals;


/**
 * Created by Aldo on 03/11/2015.
 */
public class DrinkTest {

    private Drink drink;

    @Before
    public void setUp(){
        drink = new Drink();
    }

    @Test
    public void testPrice(){
        drink.setPrice(10);
        assertEquals(10, drink.getPrice(), 0);
    }

    @Test
    public void testDescription(){
        drink.setDescription("pepsi");
        assertEquals("pepsi", drink.getDescription());
    }

    @Test
    public void testName(){
        drink.setName("refresco");
        assertEquals("refresco", drink.getName());
    }
}
