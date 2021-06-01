package com.co.alejo.designpatterns.abstractmethod.chair;

/**
 * All products families have the same varieties (Truck/Car).
 *
 * This is another variant of a Chair.
 */
public class ChairTruck implements Chair {

    @Override
    public void putChair() {
        System.out.println("Put chairs to truck");
    }
}
