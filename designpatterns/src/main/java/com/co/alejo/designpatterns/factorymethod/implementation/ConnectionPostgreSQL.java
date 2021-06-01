package com.co.alejo.designpatterns.factorymethod.implementation;

import com.co.alejo.designpatterns.factorymethod.IConnection;

public class ConnectionPostgreSQL implements IConnection {

    private String host;
    private String port;
    private String username;
    private String password;

    public ConnectionPostgreSQL(){
        this.host = "localhost";
        this.port = "5433";
        this.username = "admin1";
        this.password = "1111";
    }

    @Override
    public void connect() {
        // code for connect to PostgreSQL, for this example only use print by console
        System.out.println("- Connected to PostgreSQL");
    }

    @Override
    public void disconnect() {
        // code for disconnect from PostgreSQL, for this example only use print by console
        System.out.println("- Disconnected from PostgreSQL");
    }

    @Override
    public String toString() {
        return "ConnectionPostgreSQL [host=" + host + ", port=" + port + ", username=" + username + ", password="
                + password + "]";
    }
}
