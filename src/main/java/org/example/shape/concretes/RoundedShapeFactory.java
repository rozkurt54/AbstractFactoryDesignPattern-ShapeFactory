package org.example.AbstractFactoryDesignPatternExample.shape.concretes;

import org.example.AbstractFactoryDesignPatternExample.shape.abstracts.Shape;
import org.example.FactoryDesignPatternExample.Logger.abtracts.Logger;
import org.example.FactoryDesignPatternExample.Logger.concretes.LoggerFactory;

public class RoundedShapeFactory extends Factory {

  private Logger logger;

  @Override
  public Shape createShape(String shapeType) {

    if( shapeType.isEmpty()) {
      return null;
    }
    switch (shapeType) {
      case "RECTANGLE":
        logger.log("Rounded rectangle requested");
        return new RoundedRectangle();
      case "SQUARE":
        logger.log("Rounded square requested");
        return new RoundedSquare();
      default:
        logger.log("Wrong shape type requested");
        throw new IllegalArgumentException("shape type is wrong");
    }

  }
  public RoundedShapeFactory() {

    LoggerFactory factory = new LoggerFactory();
    Logger mailLogger = factory.createLogger("MAIL");
    this.logger = mailLogger;


  }
}
