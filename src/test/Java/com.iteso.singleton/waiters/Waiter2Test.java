package com.iteso.singleton.waiters;

import com.iteso.singleton.Dish;
import com.iteso.singleton.Drink;
import com.iteso.singleton.TableOrder;
import com.iteso.singleton.Waiter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Aldo on 03/11/2015.
 */
public class Waiter2Test {

    private TableOrder table;
    private Waiter waiter;
    private Drink drink;
    private Dish dish;
    private Waiter2 mockedWaiter;

    @Before
    public void setUp(){
        table = mock(TableOrder.class);
        waiter = new Waiter2();
    }

    @Test
    public void testAddDrink(){
        drink = mock(Drink.class);
        mockedWaiter = mock(Waiter2.class);
        when(mockedWaiter.getTable(1)).thenReturn(table);
        assertTrue(waiter.addDrink(1, drink));
    }

    @Test
    public void testAddDish(){
        dish = mock(Dish.class);
        mockedWaiter = mock(Waiter2.class);
        when(mockedWaiter.getTable(1)).thenReturn(table);
        assertTrue(waiter.addDish(1, dish));
    }

    @Test
    public void testGiveCheck(){
        mockedWaiter = mock(Waiter2.class);
        when(mockedWaiter.getTable(1)).thenReturn(table);
        assertTrue(waiter.giveCheck(1));
    }

}
