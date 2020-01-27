package de.codeshield.nullpointeranalysis;

public class Wheel {

  private int rotation;

  public void rotate(int i) {
    this.rotation = i;
  }

  public int getRotation() {
    return rotation;
  }
}
