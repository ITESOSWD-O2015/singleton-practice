package com.iteso.singleton;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 10/6/13
 * Time: 7:49 PM
 * To change this template use File | Settings | File Templates.
 */
public class Dish {
    private float price;
    private String description;
    private String name;
    private String waiter;

    public float getPrice() {
        if ((price >= 0))
            return price;
        else return -1; // (error)
    }

    public void setPrice(float price) {
        if (price >= 0)
            this.price = price;
        else this.price = -1; // error
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}