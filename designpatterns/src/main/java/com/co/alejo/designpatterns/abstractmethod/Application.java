package com.co.alejo.designpatterns.abstractmethod;

import com.co.alejo.designpatterns.abstractmethod.chair.Chair;
import com.co.alejo.designpatterns.abstractmethod.engine.Engine;
import com.co.alejo.designpatterns.abstractmethod.factory.Factory;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Application {

    private Engine engine;
    private Chair chair;

    public Application(Factory factory){
        engine = factory.createEngine();
        chair = factory.createChair();
    }

    public void createTransport(){
        engine.putEngine();
        chair.putChair();
    }
}
