package com.co.alejo.designpatterns.factorymethod;

public class MainApplication {
    public static void main(String[] args) {
        FactoryConnection factoryConnection = new FactoryConnection();

        IConnection connection1 = factoryConnection.getConnection("ORACLE");
        System.out.println("Factory implementation for ORACLE>>>>>");
        connection1.connect();
        connection1.disconnect();

        IConnection connection2 = factoryConnection.getConnection("MYSQL");
        System.out.println("Factory implementation for MYSQL>>>>>");
        connection2.connect();
        connection2.disconnect();

        IConnection connection3 = factoryConnection.getConnection("POSTGRESQL");
        System.out.println("Factory implementation for POSTGRESQL>>>>>");
        connection3.connect();
        connection3.disconnect();

        IConnection connection4 = factoryConnection.getConnection(null);
        System.out.println("Factory implementation for EMPTY >>>>>");
        connection4.connect();
        connection4.disconnect();

    }
}
