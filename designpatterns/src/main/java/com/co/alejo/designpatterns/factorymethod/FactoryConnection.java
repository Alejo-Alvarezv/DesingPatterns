package com.co.alejo.designpatterns.factorymethod;

import com.co.alejo.designpatterns.factorymethod.implementation.ConnectionMySQL;
import com.co.alejo.designpatterns.factorymethod.implementation.ConnectionOracle;
import com.co.alejo.designpatterns.factorymethod.implementation.ConnectionPostgreSQL;
import com.co.alejo.designpatterns.factorymethod.implementation.EmptyConnection;

public class FactoryConnection {

    public IConnection getConnection(String databaseEngine){
        if (databaseEngine == null){
            return new EmptyConnection();
        }else if(databaseEngine.equalsIgnoreCase("MYSQL")){
            return new ConnectionMySQL();
        } else if (databaseEngine.equalsIgnoreCase("POSTGRESQL")){
            return new ConnectionPostgreSQL();
        } else {
            return new ConnectionOracle();
        }
    }
}
