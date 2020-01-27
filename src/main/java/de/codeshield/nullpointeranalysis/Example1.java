package de.codeshield.nullpointeranalysis;

public class Example1 {

  public void detectMe() {
    Car var = null;
    Car arg = new Car();
    if(Math.random() % 2 == 0){
      var = arg;
    }
    if(var.getSpeed() > 0){
      System.out.println("Car is driving");
    }
  }
}
