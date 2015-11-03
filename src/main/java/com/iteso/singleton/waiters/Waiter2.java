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
 * Created by Sacrp on 11/3/15.
 */
public class Waiter2 extends Waiter {

    TableOrder table;
    public TableOrder getTable(int tableNumber){

        switch(tableNumber) {
            case 1: return Table1.getInstance();
            case 2: return Table2.getInstance();
            case 3: return Table3.getInstance();
            case 4: return Table4.getInstance();
        }
        return null;
    }

    @Override
    public boolean addDrink(int tableNumber, Drink drink) {

        System.out.println("Soy el mesero 2 y estoy sirviendo una bebida");
        table = getTable(tableNumber);
        try{
            sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        table.addDrink(drink);
        return true;
    }

    @Override
    public boolean addDish(int tableNumber, Dish dish) {
        System.out.println("Soy el mesero 2 y estoy sirviendo un platillo");
        table = getTable(tableNumber);
        try{
            sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        table.addDish(dish);
        return true;
    }

    @Override
    public boolean giveCheck(int tableNumber) {

        System.out.println("Soy el mesero 2 y estoy trayendo la cuenta");
        table = getTable(tableNumber);
        try{
            sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        table.printCheck();
        table.clearDishes();
        table.clearDrinks();
        return true;
    }
}
