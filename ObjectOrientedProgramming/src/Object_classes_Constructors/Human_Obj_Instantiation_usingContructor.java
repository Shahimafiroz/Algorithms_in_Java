package Object_classes_Constructors;

public class Human_Obj_Instantiation_usingContructor {
    public static void main(String[] args) {
        Human_Class_Constuctor Human1 = new Human_Class_Constuctor("Shahima" , 22 ,80.23);
        Human_Class_Constuctor Human2 = new Human_Class_Constuctor("Khushi" , 21 , 35.3);
        System.out.println(Human2.nam);
        System.out.println(Human1.nam);
        System.out.println(Human2.ag);
        System.out.println(Human1.ag);
        System.out.println(Human2.wt);
        System.out.println(Human1.wt);

        Human2.eat();
        Human1.drink();






    }



}

/*

To create the constructor of a class to instantiate the object we need to give it the same name as the Super class or the clss its trying to instantiate

Constructors must have the same name as the class within which it is defined it is not necessary for the method in Java.
Constructors do not return any type while method(s) have the return type or void if does not return any value.
Constructors are called only once at the time of Object creation while method(s) can be called any number of times.
 */