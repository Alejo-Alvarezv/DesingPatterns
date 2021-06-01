package com.co.alejo.designpatterns.factorymethod.implementation;

import com.co.alejo.designpatterns.factorymethod.IConnection;

public class ConnectionOracle implements IConnection {

    private String host;
    private String port;
    private String username;
    private String password;

    public ConnectionOracle(){
        this.host = "localhost";
        this.port = "3306";
        this.username = "root";
        this.password = "1234";
    }

    @Override
    public void connect() {
        // code for connect to oracle, for this example only use print by console
        System.out.println("- Connected to Oracle");
    }

    @Override
    public void disconnect() {
        // code for disconnect from oracle, for this example only use print by console
        System.out.println("- Disconnected from Oracle");
    }

    @Override
    public String toString() {
        return "ConnectionOracle [host=" + host + ", port=" + port + ", username=" + username + ", password="
                + password + "]";
    }
}
