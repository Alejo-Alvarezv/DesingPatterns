## Naive Singleton (multithreaded)

The same class behaves incorrectly in a multithreaded environment. Multiple threads can call the creation method simultaneously and get several instances of Singleton class.

Output:
```sh
If you see the same value, then singleton was reused
If you see different values, then 2 singletons were created

RESULT:

Singleton 1
Singleton 2
```