package com.iteso.singleton;

import com.iteso.singleton.waiter.Waiter1;
import com.iteso.singleton.waiter.Waiter2;
import com.iteso.singleton.waiter.Waiter3;
import com.iteso.singleton.waiter.Waiter4;

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

        Waiter waiter1 = new Waiter1();
        Waiter waiter2 = new Waiter2();
        Waiter waiter3 = new Waiter3();
        Waiter waiter4 = new Waiter4();

        drink = new Drink();
        drink.setDescription("chesco");
        drink.setName("Coke");
        drink.setPrice(10);
        waiter1.addDrink(2,drink);

        drink = new Drink();
        drink.setDescription("chesco");
        drink.setName("Fanta");
        drink.setPrice(10);
        waiter1.addDrink(1,drink);

        drink = new Drink();
        drink.setDescription("Agua");
        drink.setName("mineral de naranja");
        drink.setPrice(20);
        waiter3.addDrink(3, drink);

        drink = new Drink();
        drink.setName("Manzanita");
        drink.setDescription("chesco");
        drink.setPrice(10);
        waiter3.addDrink(4, drink);

        drink = new Drink();
        drink.setName("Jamaica");
        drink.setDescription("Agua");
        drink.setPrice(17);
        waiter4.addDrink(2, drink);

        dish = new Dish();
        dish.setName("Pollo empanizado");
        dish.setDescription("Comida");
        dish.setPrice(30);
        waiter2.addDish(2,dish);

        dish = new Dish();
        dish.setDescription("Comida mexicana");
        dish.setName("Enchilada");
        dish.setPrice(8);
        waiter1.addDish(2, dish);

        dish = new Dish();
        dish.setDescription("Pollo");
        dish.setName("Chicken Pozole");
        dish.setPrice(45);
        waiter4.addDish(1,dish);

        dish = new Dish();
        dish.setDescription("Tostadas");
        dish.setName("Tostada de Pata");
        dish.setPrice(28);
        waiter3.addDish(4,dish);

        dish = new Dish();
        dish.setDescription("Quesadilla");
        dish.setName("Quesadilla Chicharron");
        dish.setPrice(18);
        waiter2.addDish(3,dish);

        dish = new Dish();
        dish.setDescription("Tostada");
        dish.setName("Tostada de Pata");
        dish.setPrice(28);
        waiter1.addDish(3, dish);


        waiter1.cuenta(3);
        waiter2.cuenta(2);


    }


}
