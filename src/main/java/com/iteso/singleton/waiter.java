package com.iteso.singleton;

import com.iteso.singleton.Dish;
import com.iteso.singleton.Drink;
import com.iteso.singleton.TableOrder;
import com.iteso.singleton.tables.Table1;
import com.iteso.singleton.tables.Table2;
import com.iteso.singleton.tables.Table3;
import com.iteso.singleton.tables.Table4;

/**
 * Created by Paloma on 03/11/2015.
 */
public abstract class waiter extends Thread{

    public abstract void addDrink(Drink drink, int table_num);

    public abstract void addDish(Dish dish, int table_num);

    public TableOrder getTableInstance(int table_num){
        if(table_num ==1)
         return Table1.getInstance();
        else if(table_num ==2)
            return Table2.getInstance();
        else if(table_num ==3)
            return Table3.getInstance();
        else
            return Table4.getInstance();
    }

    public abstract boolean GiveMeTheCheck(int table_num);
}
