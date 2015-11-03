package com.iteso.singleton;

/**
 * Created by Sacrp on 11/3/15.
 */
public abstract class Waiter extends Thread{
    public abstract TableOrder getTable(int table);
    public abstract boolean addDrink(int tableNumber, Drink drink);
    public abstract boolean addDish( int tableNumber, Dish dish);
    public abstract boolean giveCheck(int tableNumber);
}
