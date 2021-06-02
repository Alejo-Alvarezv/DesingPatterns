# Abstract Factory

Lets you produce families of related objects without specifying the concrete classes

## Goal

Abstract Factory is a creational design pattern that lets you produce families of related objects without specifying their concrete classes.

<p align="center">
<img height="350" src="https://user-images.githubusercontent.com/13514156/120506948-02846180-c38c-11eb-9950-dc5b342c2dcd.png">
</p>

## Problem 

Imagine that you’re creating a furniture shop simulator. Your code consists of classes that represent:

- A family of related products, say: Chair + Sofa + CoffeeTable.

- Several variants of this family. For example, products Chair + Sofa + CoffeeTable are available in these variants: Modern, Victorian, ArtDeco.

<p align="center">
<img height="350" src="https://user-images.githubusercontent.com/13514156/120506992-0dd78d00-c38c-11eb-9d1a-5fe6daf2c896.png">
</p>

You need a way to create individual furniture objects so that they match other objects of the same family. Customers get quite mad when they receive non-matching furniture

Also, you don’t want to change existing code when adding new products or families of products to the program. Furniture vendors update their catalogs very often, and you wouldn’t want to change the core code each time it happens.

## Solution

The first thing the Abstract Factory pattern suggests is to explicitly declare interfaces for each distinct product of the product family (e.g., chair, sofa or coffee table). Then you can make all variants of products follow those interfaces. For example, all chair variants can implement the Chair interface; all coffee table variants can implement the CoffeeTable interface, and so on.

<p align="center">
<img height="350" src="https://user-images.githubusercontent.com/13514156/120507060-1af47c00-c38c-11eb-8a2c-dfd4db27c19a.png">
</p>

```All variants of the same object must be moved to a single class hierarchy.```

The next move is to declare the Abstract Factory—an interface with a list of creation methods for all products that are part of the product family (for example, createChair, createSofa and createCoffeeTable). These methods must return **abstract** product types represented by the interfaces we extracted previously: Chair, Sofa, CoffeeTable and so on.

<p align="center">
<img height="350" src="https://user-images.githubusercontent.com/13514156/120507144-29db2e80-c38c-11eb-8453-1e46ce31bd49.png">
</p>

```Each concrete factory corresponds to a specific product variant.```

Now, how about the product variants? For each variant of a product family, we create a separate factory class based on the AbstractFactory interface. A factory is a class that returns products of a particular kind. For example, the ModernFurnitureFactory can only create ModernChair, ModernSofa and ModernCoffeeTable objects.

The client code has to work with both factories and products via their respective abstract interfaces. This lets you change the type of a factory that you pass to the client code, as well as the product variant that the client code receives, without breaking the actual client code.


```The client shouldn’t care about the concrete class of the factory it works with.```

Say the client wants a factory to produce a chair. The client doesn’t have to be aware of the factory’s class, nor does it matter what kind of chair it gets. Whether it’s a Modern model or a Victorian-style chair, the client must treat all chairs in the same manner, using the abstract Chair interface. With this approach, the only thing that the client knows about the chair is that it implements the sitOn method in some way. Also, whichever variant of the chair is returned, it’ll always match the type of sofa or coffee table produced by the same factory object.

There’s one more thing left to clarify: if the client is only exposed to the abstract interfaces, what creates the actual factory objects? Usually, the application creates a concrete factory object at the initialization stage. Just before that, the app must select the factory type depending on the configuration or the environment settings.

## Structure

<p align="center">
<img height="350" src="https://user-images.githubusercontent.com/13514156/120507203-3790b400-c38c-11eb-8938-21733b5835e0.png">
</p>

1. **Abstract Products** declare interfaces for a set of distinct but related products which make up a product family.
2. **Concrete Products** are various implementations of abstract products, grouped by variants. Each abstract product (chair/sofa) must be implemented in all given variants (Victorian/Modern).
3. The **Abstract Factory** interface declares a set of methods for creating each of the abstract products.
4. **Concrete Factories** implement creation methods of the abstract factory. Each concrete factory corresponds to a specific variant of products and creates only those product variants.
5. Although concrete factories instantiate concrete products, signatures of their creation methods must return corresponding abstract products. This way the client code that uses a factory doesn’t get coupled to the specific variant of the product it gets from a factory. The **Client** can work with any concrete factory/product variant, as long as it communicates with their objects via abstract interfaces.

## Applicability

Use the Abstract Factory when your code needs to work with various families of related products, but you don’t want it to depend on the concrete classes of those products—they might be unknown beforehand or you simply want to allow for future extensibility.

The Abstract Factory provides you with an interface for creating objects from each class of the product family. As long as your code creates objects via this interface, you don’t have to worry about creating the wrong variant of a product which doesn’t match the products already created by your app.

- Consider implementing the Abstract Factory when you have a class with a set of Factory Methods that blur its primary responsibility.

- In a well-designed program each class is responsible only for one thing. When a class deals with multiple product types, it may be worth extracting its factory methods into a stand-alone factory class or a full-blown Abstract Factory implementation.

## :clipboard: How to Implement
1. Map out a matrix of distinct product types versus variants of these products.
2. Declare abstract product interfaces for all product types. Then make all concrete product classes implement these interfaces.
3. Declare the abstract factory interface with a set of creation methods for all abstract products.
4. Implement a set of concrete factory classes, one for each product variant.
5. Create factory initialization code somewhere in the app. It should instantiate one of the concrete factory classes, depending on the application configuration or the current environment. Pass this factory object to all classes that construct products.
6. Scan through the code and find all direct calls to product constructors. Replace them with calls to the appropriate creation method on the factory object.

## Pros and Cons

:white_check_mark: You can be sure that the products you’re getting from a factory are compatible with each other.

:white_check_mark: You avoid tight coupling between concrete products and client code.

:white_check_mark: Single Responsibility Principle. You can extract the product creation code into one place, making the code easier to support.

:white_check_mark: Open/Closed Principle. You can introduce new variants of products without breaking existing client code.

:x: The code may become more complicated than it should be, since a lot of new interfaces and classes are introduced along with the pattern.

## Usage

[Example](https://github.com/alejoalvarez/Design-Patterns/tree/master/designpatterns/src/main/java/com/co/alejo/designpatterns/abstractmethod)

