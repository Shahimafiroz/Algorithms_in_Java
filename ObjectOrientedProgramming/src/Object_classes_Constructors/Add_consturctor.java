package Object_classes_Constructors;

public class Add_consturctor {

    double a ;
    double b ;

    Add_consturctor(double  aa , double bb){
        this.a = aa;
        this.b = bb;
        add(a , b);
    }

    double add(double x , double y){
        System.out.println("add method using constructor was called , : " +(x+y));
         return x+y;
    }


}
