package com.iteso.singleton.waiters;

import com.iteso.singleton.Dish;
import com.iteso.singleton.Drink;
import com.iteso.singleton.TableOrder;
import com.iteso.singleton.Waiter;
import com.iteso.singleton.tables.Table1;
import com.iteso.singleton.tables.Table2;
import com.iteso.singleton.tables.Table3;
import com.iteso.singleton.tables.Table4;

/**
 * Created by Carlos on 03/11/2015.
 */
public class WaiterB extends Waiter {
    private int slowLevel = 5000;

    TableOrder setOrder(int table){
        TableOrder order;
        switch (table) {
            case 1:
                order= Table1.getInstance();
                break;
            case 2:
                order= Table2.getInstance();
                break;
            case 3:
                order= Table3.getInstance();
                break;
            default:
                order= Table4.getInstance();
                break;
        }
        return order;
    }

    @Override
    public void addDrink(Drink drink, int table) {
        TableOrder order;
        System.out.println("Going to the table...");
        try {
            Thread.sleep(slowLevel);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        System.out.println("Adding a drink...");
        try {
            Thread.sleep(slowLevel/2);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        order = setOrder(table);
        drink.setWaiter("Waiter B");
        System.out.println("Drink added");
    }

    @Override
    public void addDish(Dish dish, int table) {
        TableOrder order;
        System.out.println("Going to the table...");
        try {
            Thread.sleep(slowLevel);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        System.out.println("Adding a dish...");
        try {
            Thread.sleep(slowLevel/2);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        order = setOrder(table);
        dish.setWaiter("Waiter B");
        System.out.println("Dish added");
    }
}
