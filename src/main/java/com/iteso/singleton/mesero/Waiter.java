package com.iteso.singleton.mesero;

import com.iteso.singleton.Dish;
import com.iteso.singleton.Drink;
import com.iteso.singleton.TableOrder;
import com.iteso.singleton.tables.Table1;
import com.iteso.singleton.tables.Table2;
import com.iteso.singleton.tables.Table3;
import com.iteso.singleton.tables.Table4;

/**
 * Created by Nizath on 11/3/2015.
 */
public abstract class Waiter {
    //public abstract void addDrink();
    private int meseroTiming;
    private boolean salida=false;
    private String nombre;
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
  public boolean addDrink(int TableOrder,Drink bebida){

      new Thread() {
          @Override
          public void run() {
                switch(TableOrder){
                    case  1:
                        try {
                            Thread.sleep(meseroTiming);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("Soy mesero "+getNombre()+" estoy atendiendo la mesa 1");
                        Table1.getInstance().addDrink(bebida);
                        salida=true;
                    break;
                    case  2:
                        try {
                            Thread.sleep(meseroTiming);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        Table2.getInstance().addDrink(bebida);
                        System.out.println("Soy mesero " + getNombre() + " estoy atendiendo la mesa 2");
                        salida=true;
                        break;
                    case  3:
                        try {
                            Thread.sleep(meseroTiming);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        Table3.getInstance().addDrink(bebida);
                        System.out.println("Soy mesero " + getNombre() + " estoy atendiendo la mesa 3");
                        salida=true;
                        break;
                    case  4:
                        try {
                            Thread.sleep(meseroTiming);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        Table4.getInstance().addDrink(bebida);
                        System.out.println("Soy mesero " + getNombre() + " estoy atendiendo la mesa 4");
                        salida=true;
                        break;
                }
          }
      }.start();
    return salida;
  }

    public boolean addDish(int TableOrder,Dish comida){

        new Thread() {
            @Override
            public void run() {
                switch(TableOrder){
                    case  1:
                        try {
                            Thread.sleep(meseroTiming);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        Table1.getInstance().addDish(comida);
                        System.out.println("Soy mesero " + getNombre() + " estoy atendiendo la mesa 1");
                        salida=true;
                        break;
                    case  2:
                        try {
                            Thread.sleep(meseroTiming);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        Table2.getInstance().addDish(comida);
                        System.out.println("Soy mesero " + getNombre() + " estoy atendiendo la mesa 2");
                        salida=true;
                        break;
                    case  3:
                        try {
                            Thread.sleep(meseroTiming);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        Table3.getInstance().addDish(comida);
                        System.out.println("Soy mesero " + getNombre() + " estoy atendiendo la mesa 3");
                        salida=true;
                        break;
                    case  4:
                        try {
                            Thread.sleep(meseroTiming);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        Table4.getInstance().addDish(comida);
                        System.out.println("Soy mesero " + getNombre() + " estoy atendiendo la mesa 4");
                        salida=true;
                        break;
                }
            }
        }.start();
        return salida;
    }
    public void setMeseroTiming(int tiempo){
        meseroTiming=tiempo;
    }
    public void getCheck(int mesa){
        new Thread() {
            @Override
            public void run() {
                switch(mesa){
                    case  1:
                        try {
                            Thread.sleep(meseroTiming);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        Table1.getInstance().printCheck();
                        salida=true;
                        break;
                    case  2:
                        try {
                            Thread.sleep(meseroTiming);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        Table2.getInstance().printCheck();
                        salida=true;
                        break;
                    case  3:
                        try {
                            Thread.sleep(meseroTiming);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        Table3.getInstance().printCheck();
                        salida=true;
                        break;
                    case  4:
                        try {
                            Thread.sleep(meseroTiming);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        Table4.getInstance().printCheck();
                        salida=true;
                        break;
                }
            }
        }.start();
    }
}
