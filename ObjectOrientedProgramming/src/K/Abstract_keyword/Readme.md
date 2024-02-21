
# Abstract

* https://www.youtube.com/watch?v=HvPlEJ3LHgE
* https://www.youtube.com/watch?v=Lvnb83qt57g&list=PLZPZq0r_RZOMhCAyywfnYLlrjiVOkdAI1&index=37

* "Abstract is from a Latin word meaning "pulled away, detached," and the basic idea is of something detached from physical, or concrete, reality. It is frequently used of ideas, meaning that they don't have a clear applicability to real life, and of art, meaning that it doesn't pictorially represent reality."
* Abstraction in Java is the process in which we only show essential details/functionality to the user. The non-essential implementation details are not displayed to the user.

## What is Abstraction in Java?

In Java, abstraction is achieved by interfaces and abstract classes. We can achieve 100% abstraction using interfaces.

### Abstraction:

Abstraction is a broader concept that refers to the process of hiding implementation details and showing only the essential features of an object.
It is a fundamental principle in object-oriented programming that allows developers to model complex systems by focusing on what an object does rather than how it does it.
Abstraction can be achieved in Java through abstract classes and interfaces.

We need both abstract class and Interface to do so for 2 reasons  :-

1. Single Inheritance vs. Multiple Implementations:
* In Java, a class can only inherit from one superclass, whether it's abstract or not. This means that when you have an abstract class, a subclass can extend only that one abstract superclass.
* This limitation is due to Java's support for single inheritance, which ensures clarity and avoids ambiguity in the inheritance hierarchy.
* On the other hand, Java allows a class to implement multiple interfaces. An interface provides a contract specifying a set of methods that a class must implement, but it does not provide any implementation. Therefore, implementing multiple interfaces does not introduce ambiguity or conflict.

2. **Static and Final** Attributes in Interfaces:
* In Java interfaces, all attributes (fields) are implicitly static and final. This means that they belong to the interface itself, not to any implementing class, and their values cannot be changed once initialized.
* Because attributes in interfaces are static and final, they are essentially constants shared among all implementing classes. This means that objects of implementing classes cannot have their own individual properties for these attributes.
* If you need a class to have its own individual properties (attributes) that can vary among instances, you need to use abstract classes. Abstract classes can contain instance variables, which are not shared among instances, allowing each object to have its own set of properties.


while abstract classes are useful for providing a base implementation and allowing subclasses to extend behavior, interfaces are essential for defining contracts and enabling multiple implementations. By understanding the differences between them and how they complement each other, you can design flexible and modular Java programs.