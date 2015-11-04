package com.iteso.singleton;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import static org.junit.Assert.*;

/**
 * Created by PolZepeda-PC on 03/11/2015.
 */
public class WaiterTest {
    Drink drink;
    Dish dish;
    Waiter waiter;
    TableOrder tableOrder;
    @Before
    public void setUp(){
        tableOrder = mock(TableOrder.class);
        waiter = new Waiter("Waiter Test", 1000);
    }

    @Test
    public void testAddDrinkTable1(){
        drink = mock(Drink.class);
        when(drink.getName()).thenReturn("Bebida test");
     //TODO
        /*
        I really don't know what to test
        I'm crying a lot
        */
    }

    @Test
    public void testAddDish(){

    }

    @Test
    public void testPrintCheck(){

    }
}