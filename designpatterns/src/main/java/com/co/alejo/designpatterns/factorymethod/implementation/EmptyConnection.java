package com.co.alejo.designpatterns.factorymethod.implementation;

import com.co.alejo.designpatterns.factorymethod.IConnection;

public class EmptyConnection implements IConnection {
    @Override
    public void connect() {
        System.out.println("- THE SUPPLIER IS NOT SPECIFIED - CONNECT");
    }

    @Override
    public void disconnect() {
        System.out.println("- THE SUPPLIER IS NOT SPECIFIED - DISCONNECT");
    }
}
