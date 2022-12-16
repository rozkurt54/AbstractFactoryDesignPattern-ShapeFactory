package org.example.AbstractFactoryDesignPatternExample.shape.concretes;

import org.example.AbstractFactoryDesignPatternExample.shape.abstracts.Shape;

public class ShapeFactory extends Factory {

  @Override
  public Shape createShape(String shapeType) {

    if( shapeType.isEmpty()) {
      return null;
    }
    switch (shapeType) {
      case "RECTANGLE":
        return new Rectangle();
      case "SQUARE":
        return new Square();
      default:
        throw new IllegalArgumentException("shape type is wrong");
    }
  }
  protected ShapeFactory() {
  }
}
