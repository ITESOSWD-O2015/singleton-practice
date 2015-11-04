package com.iteso.singleton;

import com.iteso.singleton.tables.Table1;
import com.iteso.singleton.tables.Table2;
import com.iteso.singleton.tables.Table3;
import com.iteso.singleton.tables.Table4;

/**
 * Created by Carlos on 03/11/2015.
 */
public class Waiter {

    public String name;
    private int slowLevel;

    private TableOrder setOrder(int table){
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

    public Waiter(String name, int slowLevel) {
        this.name = name;
        this.slowLevel = slowLevel;
    }

    public void addDrink(Drink drink, int table){
        TableOrder order;
        System.out.println(name + " is going to the table...");
        try {
            Thread.sleep(slowLevel);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        System.out.println(name + " is adding a drink...");
        try {
            Thread.sleep(slowLevel/2);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        order = setOrder(table);
        drink.setWaiter(name);
        System.out.println(name + " has added the drink: " + drink.getName() + " to the order.");
    }

    public void addDish(Dish dish, int table){
        TableOrder order;
        System.out.println(name + " is going to the table...");
        try {
            Thread.sleep(slowLevel);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        System.out.println(name + " is adding a dish...");
        try {
            Thread.sleep(slowLevel/2);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        order = setOrder(table);
        dish.setWaiter(name);
        System.out.println(name + " has added the dish: " + dish.getName() + " to the order.");
    }

    public void printCheck(int table) {
        TableOrder order = setOrder(table);
        order.printCheck();
        order.printCheck();
    }
}
