package org.example.AbstractFactoryDesignPatternExample.shape.concretes;

import org.example.AbstractFactoryDesignPatternExample.shape.abstracts.Shape;

public class Rectangle implements Shape {

  @Override
  public void draw() {
    System.out.println(this.getClass().getSimpleName() + "drawn Rectangle");
  }

  protected Rectangle() {
  }
}
