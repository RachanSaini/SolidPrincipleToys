package com.stackroute;

public class Plane extends IntelligentToy implements Toy,Fly,Move{




    @Override
    public void fly() {
        System.out.println("Plane can fly.");
    }
    public void move() {
        System.out.println("Plane can move.");

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
