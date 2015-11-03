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
public class Waiter1 extends Waiter {


    TableOrder table;
    public void getTable(int tableNumber){

        switch(tableNumber) {
            case 1: table = Table1.getInstance(); break;
            case 2: table = Table2.getInstance(); break;
            case 3: table = Table3.getInstance(); break;
            case 4: table = Table4.getInstance(); break;
        }
    }

    @Override
    public void addDrink(int tableNumber, Drink drink) {


        System.out.println("Soy el mesero 1 y estoy sirviendo una bebida");
        getTable(tableNumber);
        try{
            sleep(100000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        table.addDrink(drink);
    }

    @Override
    public void addDish(int tableNumber, Dish dish) {
        System.out.println("Soy el mesero 1 y estoy sirviendo un platillo");
        getTable(tableNumber);
        try{
            sleep(100000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        table.addDish(dish);
    }

    @Override
    public void giveCheck(int tableNumber) {

        System.out.println("Soy el mesero 1 y estoy trayendo la cuenta");
        getTable(tableNumber);
        try{
            sleep(10000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        table.printCheck();
        table.clearDishes();
        table.clearDrinks();
    }
}
