package com.co.alejo.designpatterns.builder.builders;

import com.co.alejo.designpatterns.builder.cars.CarType;
import com.co.alejo.designpatterns.builder.components.Engine;
import com.co.alejo.designpatterns.builder.components.Transmission;
import com.co.alejo.designpatterns.builder.components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {

    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
}
