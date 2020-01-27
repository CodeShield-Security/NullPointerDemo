package de.codeshield.nullpointeranalysis;

public class Car {

  private static final int DISTANCE = 5;
  private int speed;
  private int position;
  private Wheel wheel;

  public Car() {
  }

  public Car(Wheel wheel){
    //this.wheel = wheel;
  }

  public int getSpeed() {
    return speed;
  }


  public void accelerateTo(int currentSpeed) {
    while(speed < currentSpeed){
      speed += 1;
      drive();
    }
  }

  private void drive() {
    this.position += speed;
  }

  public int getPosition() {
    return position;
  }

  public void keepDistanceTo(Car other) {
    if(this.position + DISTANCE > other.position){
      throw new RuntimeException("Car is too close to other car");
    }
  }

  public Wheel getWheel() {
    return this.wheel;
  }
}
