package de.codeshield.nullpointeranalysis;

public class Main {

  public static void main(String... args) {
    Example1 example1 = new Example1();
    example1.detectMe();

    Example2 example2 = new Example2();
    example2.doSpeedUp();

    Example3 example3 = new Example3();
    example3.crash();

    Example4 example4 = new Example4();
    example4.doKeepDistance(null);

    Example5 example5 = new Example5();
    example5.rotateWheel(20);
  }
}
