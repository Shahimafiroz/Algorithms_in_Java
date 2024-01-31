/*
In Java, Method Overloading allows different methods to have the same name, but different signatures where
the signature can differ by the number of input parameters or type of input parameters, or a mixture of both.

METHOD SIGNATURE = METHOD NAME + PARAMETERS/inputs

Method overloading in Java is also known as Compile-time Polymorphism, Static Polymorphism, or Early binding.
In Method overloading compared to the parent argument, the child argument will get the highest priority.

***********************************************************************************************************

Different Ways of Method Overloading in Java
Changing the Number of Parameters.
Changing Data Types of the Arguments.
Changing the Order of the Parameters of Methods

************************************************************************************************************

Need for Method Overloading

Using method overloading, it is possible to access methods performing related functions with slightly different arguments and types.
Objects of a class can also be initialized in different ways using the constructors.


 */


package Methods_MethodOverloading;
import java.util.Scanner;
public class OvrLoddedMtdhs {
    public static void main(String[] args) {



        System.out.println( add(1,2));
        System.out.println( add(1,2 ,3));
        System.out.println( add(0.1f ,2));
        System.out.println(add(2 ,1.1f));
        System.out.println( add(1,2 ,3 ,4));
        System.out.println( add(1,2 ,3, 4,5));




    }
    public static int add (int a , int b){
        System.out.println(" 1 . Overloaded mthd 1 was called");
        return a+b;
    }
   // Changing the Number of Parameters.
    public static int add (int a , int b , int c){
        System.out.println(" 2. Changing the Number of Parameters.");
        return a+b+c;
    }
   //Changing Data Types of the Arguments.
    public static float add (float a , int b){
        System.out.println(" 3. Changing Data Types of the Arguments.");
        return a+b;
    }
   //Changing the Order of the Parameters of Methods
   public static float add (int b , float a){
       System.out.println(" 4. Changing the Order of the Parameters of Methods");
       return a+b;
   }
   // data types should be different to change the order ummmm ..... may be ... i dont know i tried its giving error
//    public static int add (int b ,  int a){
//        System.out.println(" Changing Data Types of the Arguments.");
//        return a+b;
//    }
    public static int add (int a , int b , int c , int d){
        System.out.println(" 5 .Overloaded mthd 2 was called");
        return a+b+c+d;
    }

    public static int add (int a , int b , int c , int d , int e){
        System.out.println(" 6. Overloaded mthd 3 was called");
        return a+b+c+d+e;
    }


}
