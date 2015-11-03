package com.iteso.singleton;

/**
 * Created by jose luis on 03/11/2015.
 */
public class WaiterThread extends TableOrder {

private static WaiterThread instance;

    private void addDrink (){

    }

    private void addDish (){

    }

    public void printCheck

    public static synchronized WaiterThread getInstance(){
        if(instance == null){
            instance = new WaiterThread();

        }return instance;
    }

}
