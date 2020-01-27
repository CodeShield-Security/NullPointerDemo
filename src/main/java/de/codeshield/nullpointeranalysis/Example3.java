package de.codeshield.nullpointeranalysis;

public class Example3 {

  public void crash() {
    Car car = new Car();
    Car other = new Car();
    car.accelerateTo(200);
    other.accelerateTo(300);
    if(isCollide(car,other)){
      isCollide(car, null);
    }
  }

  private boolean isCollide(Car car, Car other) {
    if(car.getPosition() == other.getPosition()){
      return true;
    }
    return false;
  }
}
