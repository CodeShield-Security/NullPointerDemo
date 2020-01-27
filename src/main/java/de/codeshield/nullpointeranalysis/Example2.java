package de.codeshield.nullpointeranalysis;

public class Example2 {

  public void doSpeedUp() {
    accelerate(null, 100);
  }

  private void accelerate(Car car, int currentSpeed) {
    if(currentSpeed > 10){
      currentSpeed = currentSpeed*20;
      car.accelerateTo(currentSpeed);
    }
  }
}
