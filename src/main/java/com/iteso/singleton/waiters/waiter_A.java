package com.iteso.singleton.waiters;

import com.iteso.singleton.Dish;
import com.iteso.singleton.Drink;
import com.iteso.singleton.TableOrder;
import com.iteso.singleton.tables.Table1;
import com.iteso.singleton.tables.Table2;

import java.io.IOException;

/**
 * Created by Paloma on 03/11/2015.
 */
public class waiter_A extends waiter {

    @Override
    public void addDrink(Drink drink, int table_num){
        try{
            waiter_A.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        table= getTableInstance(table_num);
        table.addDrink(drink);
        System.out.println("Bebida " + drink.getName() +" añadida a la cuenta");
    }

    @Override
    public void addDish(Dish dish, int table_num) {
        try{
            waiter_A.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        table = getTableInstance(table_num);
        table.addDish(dish);
        System.out.println("Bebida " + dish.getName() +" añadida a la cuenta");
    }



}
