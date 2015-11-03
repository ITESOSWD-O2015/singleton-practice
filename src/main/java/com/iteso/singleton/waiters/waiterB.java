package com.iteso.singleton.waiters;

import com.iteso.singleton.Dish;
import com.iteso.singleton.Drink;
import com.iteso.singleton.TableOrder;
import com.iteso.singleton.tables.Table1;
import com.iteso.singleton.tables.Table2;
import com.iteso.singleton.tables.Table3;
import com.iteso.singleton.tables.Table4;

/**
 * Created by JoseFranco on 03/11/2015.
 */
public class waiterB extends waiter {
    String name;
    TableOrder table;

    public void setName(){
        this.name = name;
    }

    public void selectTable(int tablen) {
        switch(tablen){
            case 1: table = Table1.getInstance();
                break;
            case 2: table = Table2.getInstance();
                break;
            case 3: table = Table3.getInstance();
                break;
            case 4: table = Table4.getInstance();
                break;
        }
    }

    @Override
    public void addDrink(int tablen, Drink drink) {

        selectTable(tablen);
        try{
            sleep(500);
        }
        catch(InterruptedException e){
            e.printStackTrace();/////////////////////////////
        }
        System.out.println("Waiter B adding" + drink.getName() + " $" + drink.getPrice());
        table.addDrink(drink);
    }

    @Override
    public void addDish(int tablen, Dish dish) {
        selectTable(tablen);
        try{
            sleep(500);
        }
        catch(InterruptedException e){
            e.printStackTrace();/////////////////////////////
        }
        System.out.println("Waiter B adding" + dish.getName() + " $" + dish.getPrice());
        table.addDish(tablen);

    }
}
