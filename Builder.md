# Builder

Let you construct complex objects step by step. The pattern allows you to produce different types and representations of an object using the same construction code.

## Goal

Builder is a creational design pattern that lets you construct complex objects step by step. The pattern allows you to produce different types and representations of an object using the same construction code.

<p align="center">
<img height="350" src="https://user-images.githubusercontent.com/13514156/120506294-665a5a80-c38b-11eb-81aa-785fd5de16fb.png">
</p>

## Problem
Imagine a complex object that requires laborious, step-by-step initialization of many fields and nested objects. Such initialization code is usually buried inside a monstrous constructor with lots of parameters. Or even worse: scattered all over the client code.

<p align="center">
<img height="350" src="https://user-images.githubusercontent.com/13514156/120506354-72deb300-c38b-11eb-860d-210b3f6a988b.png">
</p>

```You might make the program too complex by creating a subclass for every possible configuration of an object.```

For example, let’s think about how to create a House object. To build a simple house, you need to construct four walls and a floor, install a door, fit a pair of windows, and build a roof. But what if you want a bigger, brighter house, with a backyard and other goodies (like a heating system, plumbing, and electrical wiring)?

The simplest solution is to extend the base House class and create a set of subclasses to cover all combinations of the parameters. But eventually you’ll end up with a considerable number of subclasses. Any new parameter, such as the porch style, will require growing this hierarchy even more.

There’s another approach that doesn’t involve breeding subclasses. You can create a giant constructor right in the base House class with all possible parameters that control the house object. While this approach indeed eliminates the need for subclasses, it creates another problem.

<p align="center">
<img height="350" src="https://user-images.githubusercontent.com/13514156/120506394-7e31de80-c38b-11eb-88ab-927d9f6fb059.png">
</p>

```The constructor with lots of parameters has its downside: not all the parameters are needed at all times.```

In most cases most of the parameters will be unused, making the constructor calls pretty ugly. For instance, only a fraction of houses have swimming pools, so the parameters related to swimming pools will be useless nine times out of ten.

## Solution

The Builder pattern suggests that you extract the object construction code out of its own class and move it to separate objects called builders.

PENDING
<p align="center">
<img height="350" src="https://user-images.githubusercontent.com/13514156/120506509-9a358000-c38b-11eb-91e9-d54c0a6a5d95.png">
</p>

```The Builder pattern lets you construct complex objects step by step. The Builder doesn’t allow other objects to access the product while it’s being built.```

The pattern organizes object construction into a set of steps (buildWalls, buildDoor, etc.). To create an object, you execute a series of these steps on a builder object. The important part is that you don’t need to call all of the steps. You can call only those steps that are necessary for producing a particular configuration of an object.

Some of the construction steps might require different implementation when you need to build various representations of the product. For example, walls of a cabin may be built of wood, but the castle walls must be built with stone.

In this case, you can create several different builder classes that implement the same set of building steps, but in a different manner. Then you can use these builders in the construction process (i.e., an ordered set of calls to the building steps) to produce different kinds of objects.

<p align="center">
<img height="350" src="https://user-images.githubusercontent.com/13514156/120506511-9ace1680-c38b-11eb-9bad-ba7adb81b14b.png">
</p>

```Different builders execute the same task in various ways.```

For example, imagine a builder that builds everything from wood and glass, a second one that builds everything with stone and iron and a third one that uses gold and diamonds. By calling the same set of steps, you get a regular house from the first builder, a small castle from the second and a palace from the third. However, this would only work if the client code that calls the building steps is able to interact with builders using a common interface.

## Structure

<p align="center">
<img height="550" src="https://user-images.githubusercontent.com/13514156/120506512-9ace1680-c38b-11eb-913b-fae9859f6a7c.png">
</p>

1. The **Builder** interface declares product construction steps that are common to all types of builders.
2. **Concrete Builders** provide different implementations of the construction steps. Concrete builders may produce products that don’t follow the common interface.
3. **Products** are resulting objects. Products constructed by different builders don’t have to belong to the same class hierarchy or interface.
4. The **Director** class defines the order in which to call construction steps, so you can create and reuse specific configurations of products.
5. The **Client** must associate one of the builder objects with the director. Usually, it’s done just once, via parameters of the director’s constructor. Then the director uses that builder object for all further construction. However, there’s an alternative approach for when the client passes the builder object to the production method of the director. In this case, you can use a different builder each time you produce something with the director.

## Applicability

* Use the Builder pattern to get rid of a “telescopic constructor”.

    Say you have a constructor with ten optional parameters. Calling such a beast is very inconvenient; therefore, you overload the constructor and create several shorter versions with fewer parameters. These constructors still refer to the main one, passing some default values into any omitted parameters.

    The Builder pattern lets you build objects step by step, using only those steps that you really need. After implementing the pattern, you don’t have to cram dozens of parameters into your constructors anymore.

* Use the Builder pattern when you want your code to be able to create different representations of some product (for example, stone and wooden houses).

 The Builder pattern can be applied when construction of various representations of the product involves similar steps that differ only in the details.

    The base builder interface defines all possible construction steps, and concrete builders implement these steps to construct particular representations of the product. Meanwhile, the director class guides the order of construction.

* Use the Builder to construct Composite trees or other complex objects.

    The Builder pattern lets you construct products step-by-step. You could defer execution of some steps without breaking the final product. You can even call steps recursively, which comes in handy when you need to build an object tree.

    A builder doesn’t expose the unfinished product while running construction steps. This prevents the client code from fetching an incomplete result.

## :clipboard: How to Implement
1. Make sure that you can clearly define the common construction steps for building all available product representations. Otherwise, you won’t be able to proceed with implementing the pattern.
2. Declare these steps in the base builder interface.
3. Create a concrete builder class for each of the product representations and implement their construction steps.

    Don’t forget about implementing a method for fetching the result of the construction. The reason why this method can’t be declared inside the builder interface is that various builders may construct products that don’t have a common interface. Therefore, you don’t know what would be the return type for such a method. However, if you’re dealing with products from a single hierarchy, the fetching method can be safely added to the base interface.

4. Think about creating a director class. It may encapsulate various ways to construct a product using the same builder object.

5. The client code creates both the builder and the director objects. Before construction starts, the client must pass a builder object to the director. Usually, the client does this only once, via parameters of the director’s constructor. The director uses the builder object in all further construction. There’s an alternative approach, where the builder is passed directly to the construction method of the director.

6. The construction result can be obtained directly from the director only if all products follow the same interface. Otherwise, the client should fetch the result from the builder.

## Pros and Cons
:white_check_mark: You can construct objects step-by-step, defer construction steps or run steps recursively.

:white_check_mark: You can reuse the same construction code when building various representations of products.

:white_check_mark: Single Responsibility Principle. You can isolate complex construction code from the business logic of the product.

:x: The overall complexity of the code increases since the pattern requires creating multiple new classes.


## Usage

[Example](https://github.com/alejoalvarez/Design-Patterns/tree/master/designpatterns/src/main/java/com/co/alejo/designpatterns/builder)