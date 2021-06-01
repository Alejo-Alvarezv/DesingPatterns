package com.co.alejo.designpatterns.abstractmethod.engine;

/**
 * Abstract Factory assumes that you have several families of products,
 * structured into separate class hierarchies (Truck/Car). All products of
 * the same family have the common interface.
 *
 * This is the common interface for buttons family.
 */

public interface Engine {
    void putEngine();
}
