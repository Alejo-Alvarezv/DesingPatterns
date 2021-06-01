package com.co.alejo.designpatterns.abstractmethod.engine;

/**
 * All products families have the same varieties (Truck/Car).
 *
 * This is a MacOS variant of a button.
 */
public class EngineCar implements Engine {
    @Override
    public void putEngine() {
        System.out.println("Put a engine to car");
    }
}
