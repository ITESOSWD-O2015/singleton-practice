package com.iteso.singleton;

import com.iteso.singleton.tables.Table1;
import com.iteso.singleton.tables.Table2;
import com.iteso.singleton.tables.Table4;

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
        Waiter1 w1=new Waiter1();
        Waiter2 w2=new Waiter2();
        Waiter3 w3=new Waiter3();
        Waiter4 w4=new Waiter4();
        drink = new Drink();
        drink.setName("Coke");
        drink.setWaiter(w1.getNombre());
        drink.setPrice(10);
        w1.addDrink(1, drink);

        drink = new Drink();
        drink.setName("Orange Juice");
        drink.setWaiter(w3.getNombre());
        drink.setPrice(6);
        w3.addDrink(1, drink);

        drink = new Drink();
        drink.setName("Peach soda");
        drink.setWaiter(w4.getNombre());
        drink.setPrice(20);
        w4.addDrink(1, drink);

        drink = new Drink();
        drink.setName("Coke");
        drink.setWaiter(w1.getNombre());
        drink.setPrice(12);
        w1.addDrink(1, drink);

        dish = new Dish();
        dish.setName("Tamales");
        drink.setWaiter(w2.getNombre());
        drink.setPrice(15);
        w2.addDish(1, dish);


        w1.getCheck(1);



    }


}
