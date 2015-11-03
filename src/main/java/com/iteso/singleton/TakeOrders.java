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

        Waiter waiter1 = new Waiter1();
        Waiter waiter2 = new Waiter2();
        Waiter waiter3 = new Waiter3();
        Waiter waiter4 = new Waiter4();

        Drink pepsi   = new Drink();
        Drink coca    = new Drink();
        Drink sprite  = new Drink();
        Drink mirinda = new Drink();

        Dish hamburguesa = new Dish();
        Dish pozole      = new Dish();
        Dish sushi       = new Dish();
        Dish taco        = new Dish();

        pepsi.setDescription("pepsi");
        pepsi.setPrice(10);

        coca.setDescription("coca");
        coca.setPrice(15);

        sprite.setDescription("sprite");
        sprite.setPrice(8);

        mirinda.setDescription("mirinda");
        mirinda.setPrice(6);

        hamburguesa.setDescription("hamburguesa");
        hamburguesa.setPrice(55);

        pozole.setName("pozole");
        pozole.setPrice(40);

        sushi.setDescription("sushi");
        sushi.setPrice(30);

        taco.setDescription("taco");
        taco.setPrice(20);


        /* ORDENES */













    }


}
