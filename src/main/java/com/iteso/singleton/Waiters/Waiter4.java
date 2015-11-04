package com.iteso.singleton.Waiters;

import com.iteso.singleton.Dish;
import com.iteso.singleton.Drink;
import com.iteso.singleton.TableOrder;
import com.iteso.singleton.WaiterThread;
import com.iteso.singleton.tables.Table1;
import com.iteso.singleton.tables.Table2;
import com.iteso.singleton.tables.Table3;
import com.iteso.singleton.tables.Table4;

/**
 * Created by jose luis on 03/11/2015.
 */
public class Waiter4 extends WaiterThread {

    TableOrder table;

    public TableOrder selectTable(int TableID) {
        switch (TableID) {
            case 1:
                return Table1.getInstance();
            case 2:
                return Table2.getInstance();
            case 3:
                return Table3.getInstance();
            case 4:
                return Table4.getInstance();

        } return null;
    }

    public void addDrink(int TableID, Drink drink) {

        selectTable(TableID);
        try{
            sleep(3000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Waiter 3 at your service " );
        table.addDrink(drink);
    }

    public void addDish(int TableID, Dish dish) {
        selectTable(TableID);
        try{
            sleep(5000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Waiter 4 at your service " );
        table.addDish(dish);

    }
    public void CheckOrder(int TableID) {
        selectTable(TableID);
        table.printCheck();
        table.clearDishes();
        table.clearDrinks();
    }
}
