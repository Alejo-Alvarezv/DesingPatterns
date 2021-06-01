# DesingPatterns

Design patterns are typical solutions to common problems in software design. Each pattern is like a blueprint that you can customize to solve a particular design problem in your code.

# Patterns are a toolkit of solutions to common
problems in software design. They define a common language that helps your team communicate more efficiently.

# Classification

## Creational design patterns

These patterns provide various object creation mechanisms, which increase flexibility and reuse of existing code.

- **Factory Method**

    - Provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.
    - Creates an instance of several derived classes

- **Abstract Factory**
    
    - Lets you produce families of related objects without specifying the concrete classes
    - Creates an instance of several families of classes

- **Builder**

    - Let you construct complex objects step by step. The pattern allows you to produce different types and representations of an object using the same construction code.
    - Separates object construction from its representation

- **Prototype**

    - Lets you copy exist objects without making your code dependent on their classes.
    - A fully initialized instance to be copied or cloned

- **Singleton** 

    - Lets you ensure that a class has only one instance while providing a global access point to this instance.
    - A class of which only a single instance can exist

        [See more information](https://github.com/alejoalvarez/Design-Patterns/blob/master/Singleton.md)

- **Object Pool**

    Avoid expensive acquisition and release of resources by recycling objects that are no longer in use

## Structural patterns
These patterns explain how to assemble objects and classes into larger structures while keeping these structures flexible and efficient.

- **Adapter**

    - Allows object with incompatible interface to collaborate
    - Match interfaces of different classes

- **Bridge**

    - Separates an object's interface from its implementation
    -   Lets you split a large class or set of closely related classes into two separate hierarchies abstraction and implementation which can be developed independently of each other

- **Composite**

    - Lets you compose objects into tree structures and then work with these structures as if the were individual objects.
    - A tree structure of simple and composite objects

- **Decorator**

    - Add responsibilities to objects dynamically
    - Lets you attach new behaviors to objects by placing these objects inside special wrapper objects that contain the behaviors

- **Facade**

    - Provides a simplified interface to a library, a framework, or any other complex set of classes
    - A single class that represents an entire subsystem

- **Flyweight**

    - A fine-grained instance used for efficient sharing
    - Lets your fit more objects into the available amount of RAM by sharing common parts of state between multiple objects instead of keeping all of the data in each object 

- **Proxy**

    - Lets you provide a substitute or placeholder for another object. A proxy control access to the original object, allowing you to perform something either before or after the request gets through to the original object.
    - An object representing another object

- **Private class data**

    - Restricts accessor/mutator access

- **MVC**

    - PENDING


## Behavioral patterns
These patterns are concerned with algorithms and the assignment of responsibilities between objects.

- **Observer**

    - A way of notifying change to a number of classes
    - Lets you define a subscription mechanism to notify multiple objects about any events that happen to the object they're observing.

- **Chain of responsability**

    - A way of passing a request between a chain of objects
    - Lets you passs request along a chain of handlers. Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain

- **Command**

    - Turns a request into a stand-alone object that contain all information about the request. This transformation lets you pass request as a method argument, delay or queue a request's execution, and support undoable operations
    - Encapsulate a command request as an object

- **Iterator**

    - Sequentially access the elements of a collection
    - Lets you traverse elements of a collection without exposing its underlying representation (list, stack, tree, etc.)

- **Mediator**

    - Lets you reduce chaotic dependencies between objects. The pattern restricts direct communications between the objects and forces them to collaborate only via mediator object
    - Defines simplified communication between classes

- **Memento**

    - Capture and restore an object's internal state
    - Lets you save and restore the previous state of an object without revealing the details of its implementation

- **State**

    - Lets and object alter its behavior when its internal state changes. It appears as if the object changed its class.
    - Alter an object's behavior when its state changes

- **Strategy**

    - Encapsulates an algorithm inside a class
    - Lets you define a family of algorithms, put each of them into a separate class, and make their objects interchangeable.

- **Template method**

    - Define the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure.
    - Defer the exact steps of an algorithm to a subclass

- **Visitor**

    - Defines a new operation to a class without change
    - Lets you separate algorithms form the object on which thet operate.

- **Interpreter**

    - A way to include language elements in a program

- **Null object**

    - Designed to act as a default value of an object

- **Modularity**

    - PENDING

