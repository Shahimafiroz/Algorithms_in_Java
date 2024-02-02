package Object_classes_Constructors;

public class Objs_of_Car {
    public static void main(String[] args) {

        Car_class mycar1 = new Car_class();
        Car_class mycar2 = new Car_class();

        System.out.println(mycar1.model="Mustang 1969");
        System.out.println(mycar1.company = "Ford");
        System.out.println(mycar1.name ="Mustang");

        mycar1.drive();
        mycar1.stop();


        System.out.println(mycar2.model ="RollsRoyece");
        System.out.println(mycar2.company = "xyz");
        System.out.println(mycar2.name = "RR");

        mycar2.drive();
        mycar2.stop();



    }
}
