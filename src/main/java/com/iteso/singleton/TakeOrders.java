package com.iteso.singleton;

import com.iteso.singleton.Waiters.Waiter1;
import com.iteso.singleton.Waiters.Waiter2;
import com.iteso.singleton.Waiters.Waiter3;
import com.iteso.singleton.Waiters.Waiter4;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 10/6/13
 * Time: 7:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class TakeOrders {
    public static void main (String[] args) {

        Drink drink;
        Dish dish;

        WaiterThread waiter1 = new Waiter1();
        WaiterThread waiter2 = new Waiter2();
        WaiterThread waiter3 = new Waiter3();
        WaiterThread waiter4 = new Waiter4();

        drink = new Drink();
        drink.setName("Horchata Water");
        drink.setPrice(22);
        waiter1.addDrink(1, drink);

        drink = new Drink();
        drink.setName("Boing Mango");
        drink.setPrice(15);
        waiter2.addDrink(3, drink);

        drink = new Drink();
        drink.setName("Fanta");
        drink.setPrice(17);
        waiter3.addDrink(1, drink);

        drink = new Drink();
        drink.setName("Jamaica Water");
        drink.setPrice(22);
        waiter4.addDrink(1, drink);

        dish = new Dish();
        dish.setName("Orden Pata de Mula");
        dish.setPrice(80);
        waiter1.addDish(2, dish);

        dish = new Dish();
        dish.setName("Coctel Grande");
        dish.setPrice(80);
        waiter2.addDish(2, dish);

        dish = new Dish();
        dish.setName("Tostada Ceviche");
        dish.setPrice(80);
        waiter3.addDish(2, dish);

        dish = new Dish();
        dish.setName("Orden Aguachile");
        dish.setPrice(80);
        waiter4.addDish(2, dish);


        waiter1.CheckOrder(1);
        waiter2.CheckOrder(2);
        waiter3.CheckOrder(3);
        waiter4.CheckOrder(4);
    }
}
