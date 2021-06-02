# Builder

Let you construct complex objects step by step. The pattern allows you to produce different types and representations of an object using the same construction code.

## Goal

Builder is a creational design pattern that lets you construct complex objects step by step. The pattern allows you to produce different types and representations of an object using the same construction code.

<p align="center">
<img height="350" src="https://github.com/alejoalvarez/Images/blob/trunk/DesignPatterns/builder1.png">
</p>

## Problem
Imagine a complex object that requires laborious, step-by-step initialization of many fields and nested objects. Such initialization code is usually buried inside a monstrous constructor with lots of parameters. Or even worse: scattered all over the client code.

<p align="center">
<img height="350" src="https://github.com/alejoalvarez/Images/blob/trunk/DesignPatterns/builder2.png">
</p>

```You might make the program too complex by creating a subclass for every possible configuration of an object.```

For example, let’s think about how to create a House object. To build a simple house, you need to construct four walls and a floor, install a door, fit a pair of windows, and build a roof. But what if you want a bigger, brighter house, with a backyard and other goodies (like a heating system, plumbing, and electrical wiring)?

The simplest solution is to extend the base House class and create a set of subclasses to cover all combinations of the parameters. But eventually you’ll end up with a considerable number of subclasses. Any new parameter, such as the porch style, will require growing this hierarchy even more.

There’s another approach that doesn’t involve breeding subclasses. You can create a giant constructor right in the base House class with all possible parameters that control the house object. While this approach indeed eliminates the need for subclasses, it creates another problem.

<p align="center">
<img height="350" src="https://github.com/alejoalvarez/Images/blob/trunk/DesignPatterns/builder3.png">
</p>

```The constructor with lots of parameters has its downside: not all the parameters are needed at all times.```

In most cases most of the parameters will be unused, making the constructor calls pretty ugly. For instance, only a fraction of houses have swimming pools, so the parameters related to swimming pools will be useless nine times out of ten.
