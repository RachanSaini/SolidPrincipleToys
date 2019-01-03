package com.stackroute;

public class ToyBuilder {
 public static void main(String[] args){

  Plane plane=new Plane();
  plane.fly();
  plane.setColor("blue");
  plane.setPrice(5000);
  plane.move();

  Car car=new Car();
  plane.setColor("red");
  plane.setPrice(1200);
  car.move();

 }


}
