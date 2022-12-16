package org.example.AbstractFactoryDesignPatternExample.shape.concretes;

import org.example.AbstractFactoryDesignPatternExample.shape.abstracts.Shape;

public class RoundedRectangle implements Shape {
  @Override
  public void draw() {
    System.out.println(this.getClass().getSimpleName() + ": drawn RoundedRectangle");
  }

  protected RoundedRectangle() {
  }
}
