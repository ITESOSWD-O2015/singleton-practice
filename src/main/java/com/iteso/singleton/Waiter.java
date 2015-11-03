package com.iteso.singleton;

/**
 * Created by Sacrp on 11/3/15.
 */
public abstract class Waiter extends Thread{
    public abstract void addDrink(int tableNumber, Drink drink);
    public abstract void addDish( int tableNumber, Dish dish);
    public abstract void giveCheck(int tableNumber);
}
