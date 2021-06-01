package com.co.alejo.designpatterns.abstractmethod;

import com.co.alejo.designpatterns.abstractmethod.factory.Factory;
import com.co.alejo.designpatterns.abstractmethod.factory.FactoryCar;
import com.co.alejo.designpatterns.abstractmethod.factory.FactoryTruck;

public class MainApplication {

    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */
    private static Application configureApplication() {
        Application app;
        Factory factory;
        String typeTransport = "truck"; // change "truck" for car for test the example
        if (typeTransport.equals("car")) {
            factory = new FactoryCar();
            app = new Application(factory);
        } else {
            factory = new FactoryTruck();
            app = new Application(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.createTransport();
    }
}