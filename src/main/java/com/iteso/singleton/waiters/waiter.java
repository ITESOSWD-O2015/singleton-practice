package com.iteso.singleton.waiters;

import com.iteso.singleton.Dish;
import com.iteso.singleton.Drink;
import com.iteso.singleton.TableOrder;

/**
 * Created by JoseFranco on 03/11/2015.
 */
public abstract class waiter extends  Thread{
    public abstract void addDrink(int tablen, Drink drink);
    public abstract void addDish(int tablen, Dish dish);
}
