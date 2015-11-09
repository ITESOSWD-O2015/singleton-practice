package com.iteso.singleton.waiter;

import com.iteso.singleton.Dish;
import com.iteso.singleton.Drink;
import com.iteso.singleton.TableOrder;
import com.iteso.singleton.Waiter;
import com.iteso.singleton.tables.Table1;
import com.iteso.singleton.tables.Table2;
import com.iteso.singleton.tables.Table3;

/**
 * Created by ShaSkills on 08/11/2015.
 */
public class Waiter3 extends Waiter {

    TableOrder table;
    int Tiempo = 5000;

    @Override
    public TableOrder getTable(int tableNum) {

        switch (tableNum){
            case 1: return Table1.getInstance();
            case 2: return Table2.getInstance();
            case 3: return Table3.getInstance();
            case 4: return Table3.getInstance();
        }

        return null;
    }

    @Override
    public boolean addDrink(int tableNum, Drink drink) {

        table = getTable(tableNum);

        try{
            sleep(Tiempo);
        }catch(InterruptedException e){
            e.toString();
        }
        System.out.println("El mesero 3 llevo la bebida " + drink.getName() + "a la mesa numero"+ tableNum );
        table.addDrink(drink);
        return true;
    }

    @Override
    public boolean addDish(int tableNum, Dish dish) {

        table = getTable(tableNum);

        try{
            sleep(Tiempo);
        }catch (InterruptedException e){
            e.toString();
        }

        System.out.println("El mesero 3 llevo el platillo " + dish.getName() + "a la mesa numero"+ tableNum );
        table.addDish(dish);
        return true;
    }

    @Override
    public boolean cuenta(int tableNum) {

        System.out.println("El mesero 3 lleva la cuenta");
        getTable(tableNum);
        table.printCheck();
        table.clearDrinks();
        table.clearDishes();

        return true;
    }
}

