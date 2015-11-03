package com.iteso.singleton;

import com.iteso.singleton.tables.Table1;
import com.iteso.singleton.tables.Table2;
import com.iteso.singleton.tables.Table4;
import com.iteso.singleton.waiters.WaiterA;
import com.iteso.singleton.waiters.WaiterB;
import com.iteso.singleton.waiters.WaiterC;
import com.iteso.singleton.waiters.WaiterD;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 10/6/13
 * Time: 7:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class TakeOrders {
    public static void main (String[] args){
        Drink drink;
        Dish dish;
        Waiter waiterA = new WaiterA();
        Waiter waiterB = new WaiterB();
        Waiter waiterC = new WaiterC();
        Waiter waiterD = new WaiterD();

        drink = new Drink();
        drink.setName("Coke");
        drink.setWaiter("Waiter A");
        drink.setPrice(10);
        waiterA.addDrink(drink, 4);

        drink = new Drink();
        drink.setName("Coke");
        drink.setPrice(10);
        waiterB.addDrink(drink, 1);

        drink = new Drink();
        drink.setName("Coke");
        drink.setPrice(10);
        waiterB.addDrink(drink, 4);

        dish = new Dish();
        dish.setName("Enchilada");
        dish.setPrice(8);
        waiterC.addDish(dish, 4);

        dish = new Dish();
        dish.setName("Enchilada");
        dish.setPrice(8);
        waiterC.addDish(dish, 4);

        dish = new Dish();
        dish.setName("Chicken Pozole");
        dish.setPrice(45);
        waiterB.addDish(dish, 4);

        dish = new Dish();
        dish.setName("Tostada de Pata");
        dish.setPrice(28);
        waiterD.addDish(dish, 2);

        dish = new Dish();
        dish.setName("Quesadilla Chicharron");
        dish.setPrice(18);
        waiterA.addDish(dish, 4);

        dish = new Dish();
        dish.setName("Tostada de Pata");
        dish.setPrice(28);
        waiterD.addDish(dish,4);

        waiterA.printCheck(1);

        waiterD.printCheck(4);

        dish= new Dish();
        dish.setName("Quesadilla Rajas");
        dish.setPrice(18);
        waiterC.addDish(dish, 4);

        waiterB.printCheck(4);
    }


}
