package com.iteso.singleton;

import com.iteso.singleton.tables.Table1;
import com.iteso.singleton.tables.Table2;
import com.iteso.singleton.tables.Table3;
import com.iteso.singleton.tables.Table4;

/**
 * Created by Carlos on 03/11/2015.
 */
public abstract class Waiter {
    TableOrder setorder(int table) {
        TableOrder order;
        switch (table)
        {
            case 1:
                order = Table1.getInstance();
                break;
            case 2:
                order = Table2.getInstance();
                break;
            case 3:
                order = Table3.getInstance();
                break;
            default:
                order = Table4.getInstance();
                break;
        }
        return order;
    }
    public String name;
    public abstract void addDrink(Drink drink, int table);
    public abstract void addDish(Dish dish, int table);
    public void printCheck(int table){
        TableOrder order = setorder(table);
        order.printCheck();
        order.printCheck();
    }
}
