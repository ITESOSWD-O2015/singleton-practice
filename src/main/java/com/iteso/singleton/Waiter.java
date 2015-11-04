package com.iteso.singleton;

/**
 * Created by WolfBloodDude on 03/11/15.
 */
public abstract class Waiter extends Thread {
    public abstract void addDrink(int tableNumber, Drink drink);
    public abstract void addDish(int tableNumber, Dish dish);
    public abstract void siTeEncargoLaCuentaPorfa(int tableNumber);
}
