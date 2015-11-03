package com.iteso.singleton;

import com.iteso.singleton.mesero.Waiter;

/**
 * Created by Nizath on 11/3/2015.
 */
public class Waiter2 extends Waiter {
    public Waiter2(){
        setMeseroTiming(200);
        setNombre("Waiter 2");
    }
}
