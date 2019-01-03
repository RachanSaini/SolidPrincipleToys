package com.stackroute;

public class Car extends IntelligentToy implements Toy,Move{



    @Override
    public void move() {
        System.out.println("Car can move");
    }

    @Override
    public void setPrice(int price) {
        System.out.println(price);
    }

    @Override
    public void setColor(String color) {
        System.out.println(color);
    }
}
