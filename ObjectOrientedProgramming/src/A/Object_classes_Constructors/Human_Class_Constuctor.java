package A.Object_classes_Constructors;

public class Human_Class_Constuctor {
    /// defining the class

   String nam;
   int ag;
   double wt;

   Human_Class_Constuctor(String n , int a , double w)
   {
        this.nam = n;
       this.ag = a;
        this.wt = w;
   }

    void eat(){
        System.out.println(this.nam+" is Eating");
    }

    void drink(){
        System.out.println(this.nam+" is Drinking");

    }
}
