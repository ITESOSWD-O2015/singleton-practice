package com.iteso.singleton;

import com.iteso.singleton.waiters.waiter_A;
import com.iteso.singleton.waiters.waiter_B;
import com.iteso.singleton.waiters.waiter_C;
import com.iteso.singleton.waiters.waiter_D;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 10/6/13
 * Time: 7:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class TakeOrders {
    public static void main (String[] args){

        /* WAITERS */

        waiter waiterA = new waiter_A();
        waiter waiterB = new waiter_B();
        waiter waiterC = new waiter_C();
        waiter waiterD = new waiter_D();

        /* DRINKS SOLD AT THE RESTAURANT AND THEIR PRICE */

        Drink horchata   = new Drink();
        horchata.setName("horchata"); //setName("horchata");
        horchata.setPrice(10);

        Drink jamaica    = new Drink();
        jamaica.setName("jamaica");
        jamaica.setPrice(15);

        Drink limonada   = new Drink();
        limonada.setName("limonada");
        limonada.setPrice(8);

        Drink tonicol    = new Drink();
        tonicol.setName("tonicol");
        tonicol.setPrice(6);

        /* DISHES SOLD AT THE RESTAURANT AND THEIR PRICE*/

        Dish menudo     = new Dish();
        menudo.setName("menudo");
        menudo.setPrice(55);

        Dish pozole     = new Dish();
        pozole.setName("pozole");
        pozole.setPrice(40);

        Dish gordita    = new Dish();
        gordita.setName("gordita");
        gordita.setPrice(20);

        Dish taco       = new Dish();
        taco.setName("taco");
        taco.setPrice(10);

        /* ORDERS */

        waiterA.addDrink(limonada, 1);
        waiterA.addDish(pozole, 1);
        waiterB.addDish(taco, 1);
        waiterC.addDish(gordita, 1);
        waiterC.addDish(taco, 1);


        waiterA.addDrink(jamaica, 2);
        waiterB.addDrink(tonicol, 2);
        waiterC.addDrink(tonicol, 2);
        waiterD.addDish(taco, 2);

        waiterB.addDrink(horchata, 3);
        waiterC.addDrink(horchata, 3);
        waiterD.addDrink(jamaica, 3);

        waiterA.addDish(menudo, 4);
        waiterB.addDish(gordita, 4);
        waiterD.addDrink(horchata, 4);
        waiterD.addDish(gordita, 4);

         /* GIVE THEM THE CHECK! */

        System.out.println();
        waiterA.GiveMeTheCheck(1);

        System.out.println();
        waiterB.GiveMeTheCheck(2);

        System.out.println();
        waiterC.GiveMeTheCheck(3);

        System.out.println();
        waiterD.GiveMeTheCheck(4);



    }


}
