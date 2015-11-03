package com.iteso.singleton;

import com.iteso.singleton.tables.Table1;
import com.iteso.singleton.tables.Table2;
import com.iteso.singleton.tables.Table4;
import com.iteso.singleton.waiters.*;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 10/6/13
 * Time: 7:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class TakeOrders {
    public static void main (String[] args){
        TableOrder order;
        Drink drink;
        Dish dish;

        waiter waiterA = new waiterA();
        waiter waiterB = new waiterB();
        waiter waiterC = new waiterC();
        waiter waiterD = new waiterD();

       //Waiter A, Table 4
        drink = new Drink();
        drink.setName("Coke");
        drink.setWaiter("Waiter A");
        drink.setPrice(10);
        waiterA.addDrink(4, drink);
        dish = new Dish();
        dish.setName("Enchilada");
        dish.setPrice(8);
        dish.setWaiter("Waiter C");
        waiterA.addDish(4, dish);

        //Waiter B, Table 3
        drink = new Drink();
        drink.setName("Sprite");
        drink.setWaiter("Waiter B");
        drink.setPrice(10);
        waiterB.addDrink(3, drink);
        dish = new Dish();
        dish.setName("Quesadillas de Huitlacoche");
        dish.setPrice(22);
        dish.setWaiter("Waiter C");
        waiterB.addDish(3, dish);

        //Waiter C, Table 2
        drink = new Drink();
        drink.setName("Coke");
        drink.setWaiter("Waiter B");
        drink.setPrice(10);
        waiterC.addDrink(2, drink);
        dish = new Dish();
        dish.setName("Pizza");
        dish.setPrice(30);
        dish.setWaiter("Waiter C");
        waiterC.addDish(2, dish);

        //Waiter D, Table 1
        dish = new Dish();
        dish.setName("Enchilada");
        dish.setPrice(8);
        dish.setWaiter("Waiter C");
        waiterD.addDish(1, dish);
        dish = new Dish();
        dish.setName("Chimichanga");
        dish.setPrice(8);
        dish.setWaiter("Waiter C");
        waiterD.addDish(1, dish);


    }


}
