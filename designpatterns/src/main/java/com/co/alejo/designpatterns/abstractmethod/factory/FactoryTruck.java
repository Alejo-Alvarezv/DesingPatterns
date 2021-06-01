package com.co.alejo.designpatterns.abstractmethod.factory;


import com.co.alejo.designpatterns.abstractmethod.chair.Chair;
import com.co.alejo.designpatterns.abstractmethod.chair.ChairTruck;
import com.co.alejo.designpatterns.abstractmethod.engine.Engine;
import com.co.alejo.designpatterns.abstractmethod.engine.EngineTruck;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class FactoryTruck implements Factory {

    @Override
    public Engine createEngine() {
        return new EngineTruck();
    }

    @Override
    public Chair createChair() {
        return new ChairTruck();
    }
}
