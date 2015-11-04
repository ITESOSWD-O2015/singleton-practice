package com.iteso.singleton.waiters;

import com.iteso.singleton.Dish;
import com.iteso.singleton.Drink;
import com.iteso.singleton.TableOrder;
import com.iteso.singleton.waiter;

/**
 * Created by Paloma on 03/11/2015.
 */
public class waiter_C extends waiter {
    private TableOrder tableOrder;

    @Override
    public void addDrink(Drink drink, int table_num){
        try{
            waiter_A.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        tableOrder =  getTableInstance(table_num);
        tableOrder.addDrink(drink);
        System.out.println("Bebida " + drink.getName() +" agregada a la cuenta de la mesa " + tableOrder.tableName +" por el mesero C");
    }

    @Override
    public void addDish(Dish dish, int table_num) {
        try{
            waiter_A.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        tableOrder =  getTableInstance(table_num);
        tableOrder.addDish(dish);
        System.out.println("Platillo " + dish.getName() +" agregada a la cuenta por de la mesa " + tableOrder.tableName +" el mesero C");
    }

    public boolean GiveMeTheCheck(int table_num){
        System.out.println("Cuenta traida por el mesero C:");
        tableOrder = getTableInstance(table_num);
        tableOrder.printCheck();
        tableOrder.clearDishes();
        tableOrder.clearDrinks();
        return true;
    }
}
