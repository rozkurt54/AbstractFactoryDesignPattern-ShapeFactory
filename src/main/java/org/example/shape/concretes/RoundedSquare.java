package org.example.AbstractFactoryDesignPatternExample.shape.concretes;

import org.example.AbstractFactoryDesignPatternExample.shape.abstracts.Shape;

public class RoundedSquare implements Shape {
  @Override
  public void draw() {
    System.out.println(this.getClass().getSimpleName() + ": drawn RoundedSquare");
  }

  protected RoundedSquare() {
  }
}
