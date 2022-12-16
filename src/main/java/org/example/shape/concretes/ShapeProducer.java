package org.example.AbstractFactoryDesignPatternExample.shape.concretes;

import org.example.FactoryDesignPatternExample.Logger.abtracts.Logger;
import org.example.FactoryDesignPatternExample.Logger.concretes.LoggerFactory;

public class ShapeProducer {

  public static Factory createFactory(boolean isRounded) {
    if(isRounded) {
      LoggerFactory factory = new LoggerFactory();
      Logger logger = factory.createLogger("MAIL");
      logger.log("RoundedShapeFactory created");
      return new RoundedShapeFactory();
    }
    LoggerFactory factory = new LoggerFactory();
    Logger logger = factory.createLogger("FILE");
    logger.log("ShapeFactory created");
    return new ShapeFactory();
  }
}
