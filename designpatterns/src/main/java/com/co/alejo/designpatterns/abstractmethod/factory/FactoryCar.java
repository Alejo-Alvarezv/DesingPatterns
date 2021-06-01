package com.co.alejo.designpatterns.abstractmethod.factory;

import com.co.alejo.designpatterns.abstractmethod.chair.Chair;
import com.co.alejo.designpatterns.abstractmethod.chair.ChairCar;
import com.co.alejo.designpatterns.abstractmethod.engine.Engine;
import com.co.alejo.designpatterns.abstractmethod.engine.EngineCar;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class FactoryCar implements Factory {

    @Override
    public Engine createEngine() {
        return new EngineCar();
    }

    @Override
    public Chair createChair() {
        return new ChairCar();
    }
}
