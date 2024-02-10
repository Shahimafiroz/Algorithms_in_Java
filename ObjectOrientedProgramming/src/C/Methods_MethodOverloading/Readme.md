
# Methods in Java

In object-oriented programming (OOP), a method is closely related to a class. 
A class is a blueprint or a template that defines the structure and behaviour of objects. 
An object, in turn, is an instance of a class. A method is a function or a set of 
instructions defined within a class that specifies the behaviour of objects instantiated from that class.

### Method Declaration

In general, method declarations have 6 components:

1. Modifier: It defines the access type of the method i.e. from where it can be accessed in your application. 
In Java, there 4 types of access specifiers.

* public: It is accessible in all classes in your application.
* protected: It is accessible within the class in which it is defined and in its subclass/es
* private: It is accessible only within the class in which it is defined.
* default: It is declared/defined without using any modifier. It is accessible within the same class and package within which its class is defined.
* 
2. The return type: The data type of the value returned by the method or void if does not return a value. It is Mandatory in syntax.

3. Method Name: the rules for field names apply to method names as well, but the convention is a little different. It is Mandatory in syntax.

4. Parameter list: Comma-separated list of the input parameters is defined, preceded by their data type, within the enclosed parenthesis. If there are no parameters, you must use empty parentheses ().  It is Optional in syntax.

5. Exception list: The exceptions you expect by the method can throw, you can specify these exception(s). It is Optional in syntax.

6. Method body: it is enclosed between braces. The code you need to be executed to perform your intended operations.  It is Optional in syntax.


***********************************************************************************************************

# Method overloading in Java

In Java, Method Overloading allows different methods to have the same name, but different signatures where
the signature can differ by the number of input parameters or type of input parameters, or a mixture of both.

METHOD SIGNATURE = METHOD NAME + PARAMETERS/inputs

Method overloading in Java is also known as Compile-time Polymorphism, Static Polymorphism, or Early binding.
In Method overloading compared to the parent argument, the child argument will get the highest priority.

***********************************************************************************************************

### Different Ways of Method Overloading in Java

1. Changing the Number of Parameters.
3. Changing Data Types of the Arguments.
5. Changing the Order of the Parameters of Methods


### Need for Method Overloading

Using method overloading, it is possible to access methods performing related functions with slightly different arguments and types.
Objects of a class can also be initialized in different ways using the constructors.


****************************************************************************

#  Printf

Sometimes in programming, it is essential to print the output in a 
given specified format. Most users are familiar with the printf function in C.
Let us discuss how we can Formatting Output with printf() in Java in this article.

printf() = 	an optional method to control, format, and display text to the console window
			
two arguments = format string + (object/variable/value)
           
###  "% [flags] [precision] [width] [conversion-character]"


dont remember all of them just to know

### 1.conversion-characters

conversion-characters are one of the following:

* b: Boolean value.
* B: Boolean value, uppercase.
* c: Unicode character.
* C: Unicode character, force uppercase.
* d: Decimal integer.
* f: Floating-point number.
* h: Hashcode.
* n: Newline character, platform specific.
* s: String.
* S: String, force uppercase.
* t: Time/date formatting.

The t time/date character is followed by one of the following characters to extract parts of a datetime value:

* T: Time in hh:mm:ss format.
* H: Hour.
* M: Minute.
* S: Second.
* L: Millisecond.
* N: Nanosecond.
* p: A.M./P.M.
* z: Time zone offset.
* A: Full day of the week.
* d: Two digit day of the month.
* B: Full month name.
* m: Two-digit month.
* Y: Four-digit year.
* y: Last two digits of year.

### 2.Width
Minimum number of characters to be written as output

### 3.Precision
Sets number of digits of precision when outputting floating-point values
* .1 - one digit
* .2 - two digit
* .3 - three digit

### 4.Flags

Adds an effect to output based on the flag added to format specifier
* "-" : left-justify
* "+" : output a plus ( + ) or minus ( - ) sign for a numeric value
* "0" : numeric values are zero-padded
*  "," : comma grouping separator if numbers > 1000
