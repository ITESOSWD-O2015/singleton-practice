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
        TableOrder order;
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
        waiterA.addDrink(4, drink);

        //order = Table1.getInstance();
        drink = new Drink();
        drink.setName("Coke");
        //drink.setWaiter("Waiter B");
        drink.setPrice(10);
        waiterB.addDrink(1, drink);

        //order = Table4.getInstance();
        drink = new Drink();
        drink.setName("Coke");
        //drink.setWaiter("Waiter B");
        drink.setPrice(10);
        waiterB.addDrink(4, drink);

        //order = Table4.getInstance();
        dish = new Dish();
        dish.setName("Enchilada");
        dish.setPrice(8);
        //dish.setWaiter("Waiter C");
        waiterC.addDish(4, dish);

        dish = new Dish();
        dish.setName("Enchilada");
        dish.setPrice(8);
        //dish.setWaiter("Waiter C");
        waiterC.addDish(4, dish);

        //order = Table4.getInstance();
        dish = new Dish();
        dish.setName("Chicken Pozole");
        dish.setPrice(45);
        //dish.setWaiter("Waiter B");
        waiterB.addDish(4, dish);

        //order = Table2.getInstance();
        dish = new Dish();
        dish.setName("Tostada de Pata");
        dish.setPrice(28);
        //dish.setWaiter("Waiter D");
        waiterD.addDish(2, dish);

        //order = Table4.getInstance();
        dish = new Dish();
        dish.setName("Quesadilla Chicharron");
        dish.setPrice(18);
        //dish.setWaiter("Waiter A");
        waiterA.addDish(4, dish);

        //order = Table4.getInstance();
        dish = new Dish();
        dish.setName("Tostada de Pata");
        dish.setPrice(28);
        //dish.setWaiter("Waiter D");
        waiterD.addDish(4, dish);

        //order = Table1.getInstance();
        waiterA.siTeEncargoLaCuentaPorfa(1);

        //order = Table4.getInstance();
        waiterB.siTeEncargoLaCuentaPorfa(4);

        //order = Table4.getInstance();
        dish= new Dish();
        dish.setName("Quesadilla Rajas");
        dish.setPrice(18);
        //dish.setWaiter("Waiter E");
        waiterD.addDish(4, dish);

        waiterD.siTeEncargoLaCuentaPorfa(4);
    }


}
