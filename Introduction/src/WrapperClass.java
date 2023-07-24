 /*

 A. wrapper class =  provides a way to use primitive data types as reference data types
     reference data types contain useful methods
     can be used with collections (ex.ArrayList)

 B. naming convention
primitive      //wrapper
---------      //-------
 boolean       Boolean
 char          Character
 int           Integer
 double        Double

C. java has these features to access the values within a wrapper class
 1.  autoboxing = the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes
                   when we directly assign some values to each of these refrence data types ....what we have done is autoboxing
     ex:-  Boolean a = true;
 2. unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive
    ex:-


D. Note

* Strings are already a refrence data type. Hence the 1st letter while declaring the String is always capital.


  */
public class WrapperClass {
    Boolean a = true;
    Character b = 'c';
    Integer c = 3;
    Double d = 5.87876675786588;
    String e = "psy";
}
