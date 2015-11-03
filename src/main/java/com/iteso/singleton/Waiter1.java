package com.iteso.singleton;
import com.iteso.singleton.mesero.Waiter;
/**
 * Created by Nizath on 11/3/2015.
 */
public class Waiter1 extends Waiter {
    public Waiter1(){
        setMeseroTiming(400);
        setNombre("Waiter 1");
    }
}
