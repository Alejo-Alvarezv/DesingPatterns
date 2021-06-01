package com.co.alejo.designpatterns.factorymethod.implementation;

import com.co.alejo.designpatterns.factorymethod.IConnection;

public class ConnectionMySQL implements IConnection {

    private String host;
    private String port;
    private String username;
    private String password;

    public ConnectionMySQL(){
        this.host = "localhost";
        this.port = "1521";
        this.username = "admin";
        this.password = "54321";
    }

    @Override
    public void connect() {
        // code for connect to MySQL, for this example only use print by console
        System.out.println("- Connected to MySQL");
    }

    @Override
    public void disconnect() {
        // code for disconnect from MySQL, for this example only use print by console
        System.out.println("- Disconnected from MySQL");
    }

    @Override
    public String toString() {
        return "ConnectionMySQL [host=" + host + ", port=" + port + ", username=" + username + ", password="
                + password + "]";
    }
}
