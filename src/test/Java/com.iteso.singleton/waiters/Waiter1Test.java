package com.iteso.singleton.waiters;

import com.iteso.singleton.Dish;
import com.iteso.singleton.Drink;
import com.iteso.singleton.TableOrder;
import com.iteso.singleton.Waiter;
import com.iteso.singleton.waiters.Waiter1;
import org.junit.*;
import static org.mockito.Mockito.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Created by Aldo on 03/11/2015.
 */
public class Waiter1Test {

    private TableOrder table;
    private Waiter waiter;
    private Drink drink;
    private Dish dish;

    @Before
    public void setUp(){
        table = mock(com.iteso.singleton.TableOrder.class);
        waiter = new Waiter1();
    }

    @Test
    public void testAddDrink(){
        drink = mock(Drink.class);
        Waiter1 mockedWaiter = mock(Waiter1.class);
        when(mockedWaiter.getTable(1)).thenReturn(table);
        assertTrue(waiter.addDrink(1, drink));
    }

    @Test
    public void testAddDish(){
        dish = mock(Dish.class);
        Waiter1 mockedWaiter = mock(Waiter1.class);
        when(mockedWaiter.getTable(1)).thenReturn(table);
        assertTrue(waiter.addDish(1, dish));
    }

    @Test
    public void testGiveCheck(){
        Waiter1 mockedWaiter = mock(Waiter1.class);
        when(mockedWaiter.getTable(1)).thenReturn(table);
        assertTrue(waiter.giveCheck(1));
    }


}
