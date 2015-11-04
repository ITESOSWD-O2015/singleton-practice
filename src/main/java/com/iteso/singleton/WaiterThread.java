package com.iteso.singleton;

/**
 * Created by jose luis on 03/11/2015.
 */
public abstract class WaiterThread extends Thread {

        public abstract void addDrink(int TableID, Drink drink);
        public abstract void addDish(int TableID, Dish dish);
        public abstract void CheckOrder(int TableID);

}
