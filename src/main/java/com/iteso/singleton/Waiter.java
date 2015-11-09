package com.iteso.singleton;

/**
 * Created by ShaSkills on 08/11/2015.
 */
public abstract class Waiter extends Thread {

    public abstract TableOrder getTable(int table);
    public abstract boolean addDrink(int tableNum, Drink drink);
    public abstract boolean addDish(int tableNum, Dish dish);
    public abstract boolean cuenta(int tableNum);
}
