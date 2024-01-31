/*
Method Declaration
In general, method declarations have 6 components:

1. Modifier: It defines the access type of the method i.e. from where it can be accessed in your application. In Java, there 4 types of access specifiers.

public: It is accessible in all classes in your application.
protected: It is accessible within the class in which it is defined and in its subclass/es
private: It is accessible only within the class in which it is defined.
default: It is declared/defined without using any modifier. It is accessible within the same class and package within which its class is defined.

2. The return type: The data type of the value returned by the method or void if does not return a value. It is Mandatory in syntax.

3. Method Name: the rules for field names apply to method names as well, but the convention is a little different. It is Mandatory in syntax.

4. Parameter list: Comma-separated list of the input parameters is defined, preceded by their data type, within the enclosed parenthesis. If there are no parameters, you must use empty parentheses ().  It is Optional in syntax.

5. Exception list: The exceptions you expect by the method can throw, you can specify these exception(s). It is Optional in syntax.

6. Method body: it is enclosed between braces. The code you need to be executed to perform your intended operations.  It is Optional in syntax.


 */



package Methods_MethodOverloading;


import java.util.Scanner;

public class Mthds {

    public static void main (String [] arrgs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name ");
        String nme = sc.next();
        System.out.println("Enter age : ");
        int age = sc.nextInt();
        // calling the function
        hello(nme ,age);

        System.out.println("If u want to add 2 numbers enter them :");
        int m = sc.nextInt();
        int n = sc.nextInt();
        add(m , n);

        // nme age m n --> these are local variables and r only recognised with in this main mthd



    }
// method that does n0t retuen anything

   // name a x y ---> these have a common scope hence hello and add mths cannot use "x" as input in both

    public  static void hello (String name , int a ){
        int l = name.length();
        System.out.println("Number of letters in ur name are : " +l);
        if ((a & 1) == 0){
            System.out.println("Your age is a EVEN NUMBER");
        }else {
            System.out.println("Your age is a ODD NUMBER");
        }

    }

    // method that returns some vl

    public static int add (int x , int y ){
        return (x+y) ;
    }

    
}

