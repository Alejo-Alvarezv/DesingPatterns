# Factory method

Factory method is a creational design pattern which solves the problem of creating product objects without specifying their concrete classes.

Factory Method defines a method, which should be used for creating objects instead of direct constructor call (new operator). Subclasses can override this method to change the class of objects that will be created.

Output:

```
Factory implementation for ORACLE>>>>>
- Connected to Oracle
- Disconnected from Oracle
Factory implementation for MYSQL>>>>>
- Connected to MySQL
- Disconnected from MySQL
Factory implementation for POSTGRESQL>>>>>
- Connected to PostgreSQL
- Disconnected from PostgreSQL
Factory implementation for EMPTY >>>>>
- THE SUPPLIER IS NOT SPECIFIED - CONNECT
- THE SUPPLIER IS NOT SPECIFIED - DISCONNECT
```