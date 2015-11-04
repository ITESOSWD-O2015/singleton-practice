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
 * Created by WolfBloodDude on 03/11/15.
 */
public class WaiterA extends Waiter {
    private String name;
    TableOrder table;

    public void selectTable(int tableNumber) {
        switch (tableNumber) {
            case 1: table = Table1.getInstance(); break;
            case 2: table = Table2.getInstance(); break;
            case 3: table = Table3.getInstance(); break;
            case 4: table = Table4.getInstance(); break;
        }
    }

    @Override
    public void addDrink(int tableNumber, Drink drink) {
        selectTable(tableNumber);
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("I, WaiterA, am adding " + drink.getName() + " to table " + tableNumber);

        table.addDrink(drink);
    }

    @Override
    public void addDish(int tableNumber, Dish dish) {
        selectTable(tableNumber);
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("I, WaiterA, am adding " + dish.getName() + " to table " + tableNumber);

        table.addDish(dish);
    }

    @Override
    public void siTeEncargoLaCuentaPorfa(int tableNumber) {
        selectTable(tableNumber);
        table.printCheck();
        table.clearDishes();
        table.clearDrinks();
    }
}
