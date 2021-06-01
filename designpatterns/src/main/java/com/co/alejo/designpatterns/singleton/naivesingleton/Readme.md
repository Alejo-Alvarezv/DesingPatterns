## Naive Singleton (single-threaded)

It’s pretty easy to implement a sloppy Singleton. You just need to hide the constructor and implement a static creation method.

Output:
```sh
If you see the same value, then singleton was reused
If you see different values, then 2 singletons were created

RESULT:

The same singleton
The same singleton
```