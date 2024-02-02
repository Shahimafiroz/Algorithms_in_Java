## CLASSES

### Java Classes

A class in Java is a set of objects which shares common characteristics/ behavior and common properties/ attributes. 
It is a user-defined blueprint or prototype from which objects are created. For example, Student is a class while a particular student named Ravi is an object.

Properties of Java Classes
Class is not a real-world entity. It is just a template or blueprint or prototype from which objects are created.
Class does not occupy memory.
Class is a group of variables of different data types and a group of methods.
A Class in Java can contain:
Data member
Method
Constructor
Nested Class
Interface

#### Class Declaration in Java

access_modifier   class    <class_name>
{  
   data member;  

   method;  

   constructor;

   nested class;

   interface;
}

#### Components of Java Classes

In general, class declarations can include these components, in order:

Modifiers: A class can be public or has default access (Refer this for details).
Class keyword: class keyword is used to create a class.
Class name: The name should begin with an initial letter (capitalized by convention).
Superclass(if any): The name of the class’s parent (superclass), if any, preceded by the keyword extends. A class can only extend (subclass) one parent.
Interfaces(if any): A comma-separated list of interfaces implemented by the class, if any, preceded by the keyword implements. A class can implement more than one interface.
Body: The class body is surrounded by braces, { }.

### Java Objects

An object in Java is a basic unit of Object-Oriented Programming and represents real-life entities. Objects are the instances of a class that are created to use the attributes and methods of a class.  A typical Java program creates many objects, which as you know, interact by invoking methods. An object consists of :

* State: It is represented by attributes of an object. It also reflects the properties of an object.
* Behavior: It is represented by the methods of an object. It also reflects the response of an object with other objects.
* Identity: It gives a unique name to an object and enables one object to interact with other objects.
Example of an object: dog

#### Ways to Create an Object of a Class

There are four ways to create objects in Java. Strictly speaking, there is only one way(by using a new keyword), and the rest internally use a new keyword.

1. Using new keyword
   It is the most common and general way to create an object in Java. 
2. Using Class.forName(String className) method
   There is a pre-defined class in java.lang package with name Class. The forName(String className) method returns the Class object associated with the class with the given string name. We have to give a fully qualified name for a class. On calling the new Instance() method on this Class object returns a new instance of the class with the given string name.
3. Using clone() method
   clone() method is present in the Object class. It creates and returns a copy of the object.
4. Deserialization
   De-serialization is a technique of reading an object from the saved state in a file. Refer to Serialization/De-Serialization in Java
   (Serialization is a mechanism of converting the state of an object into a byte stream. Deserialization is the reverse process where the byte stream is used to recreate the actual Java object in memory. This mechanism is used to persist the object.)


### Java Constructors

Java constructors or constructors in Java is a terminology used to construct something in our programs. A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes.

What are Constructors in Java?
In Java, a Constructor is a block of codes similar to the method. It is called when an instance of the class is created. At the time of calling the constructor, memory for the object is allocated in the memory. It is a special type of method that is used to initialize the object. Every time an object is created using the new() keyword, at least one constructor is called.

#### How Java Constructors are Different From Java Methods?

Constructors must have the same name as the class within which it is defined it is not necessary for the method in Java.
Constructors do not return any type while method(s) have the return type or void if does not return any value.
Constructors are called only once at the time of Object creation while method(s) can be called any number of times.

Need of Constructors in Java
Think of a Box. If we talk about a box class then it will have some class variables (say length, breadth, and height). But when it comes to creating its object(i.e Box will now exist in the computer’s memory), then can a box be there with no value defined for its dimensions? The answer is No.
So constructors are used to assign values to the class variables at the time of object creation, either explicitly done by the programmer or by Java itself (default constructor).


