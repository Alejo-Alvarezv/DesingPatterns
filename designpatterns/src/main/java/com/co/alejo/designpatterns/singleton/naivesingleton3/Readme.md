## Thread-safe Singleton with lazy loading
To fix the problem (naive singleton 2), you have to synchronize threads during first creation of the Singleton object.

Output:
```
If you see the same value, then singleton was reused
If you see different values, then 2 singletons were created

RESULT:

Singleton 1
Singleton 1
```