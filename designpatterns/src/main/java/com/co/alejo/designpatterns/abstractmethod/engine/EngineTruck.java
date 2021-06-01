package com.co.alejo.designpatterns.abstractmethod.engine;

/**
 * All products families have the same varieties (EngineTruck/EngineCar).
 *
 * This is another variant of a button.
 */

public class EngineTruck implements Engine {

    @Override
    public void putEngine() {
        System.out.println("Put a engine for a truck");
    }
}

