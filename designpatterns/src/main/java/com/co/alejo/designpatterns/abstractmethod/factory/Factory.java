package com.co.alejo.designpatterns.abstractmethod.factory;

import com.co.alejo.designpatterns.abstractmethod.chair.Chair;
import com.co.alejo.designpatterns.abstractmethod.engine.Engine;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface Factory {

    Engine createEngine();
    Chair createChair();
}
