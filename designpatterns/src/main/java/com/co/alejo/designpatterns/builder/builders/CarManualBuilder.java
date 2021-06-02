package com.co.alejo.designpatterns.builder.builders;

import com.co.alejo.designpatterns.builder.cars.CarType;
import com.co.alejo.designpatterns.builder.cars.Manual;
import com.co.alejo.designpatterns.builder.components.Engine;
import com.co.alejo.designpatterns.builder.components.Transmission;
import com.co.alejo.designpatterns.builder.components.TripComputer;

public class CarManualBuilder implements Builder{
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;

    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    public Manual getResult() {
        return new Manual(type, seats, engine, transmission, tripComputer);
    }
}
