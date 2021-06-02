package com.co.alejo.designpatterns.builder.director;

import com.co.alejo.designpatterns.builder.builders.Builder;
import com.co.alejo.designpatterns.builder.components.Engine;
import com.co.alejo.designpatterns.builder.components.Transmission;
import com.co.alejo.designpatterns.builder.components.TripComputer;

import static com.co.alejo.designpatterns.builder.cars.CarType.*;

/**
 * Director defines the order of building steps. It works with a builder object
 * through common Builder interface. Therefore it may not know what product is
 * being built.
 */
public class Director {

    public void constructSportsCar(Builder builder) {
        builder.setCarType(SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
    }

    public void constructCityCar(Builder builder) {
        builder.setCarType(CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
    }

    public void constructSUV(Builder builder) {
        builder.setCarType(SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
    }
}
