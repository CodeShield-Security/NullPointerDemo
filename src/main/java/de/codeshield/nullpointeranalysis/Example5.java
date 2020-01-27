package de.codeshield.nullpointeranalysis;

public class Example5 {

  public void rotateWheel(int degree) {
    Car car = new Car(new Wheel());
    car.getWheel().rotate(degree);
  }
}
