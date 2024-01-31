package Objects_in_java;

public class Objs_of_Car {
    public static void main(String[] args) {

        Car_class mycar1 = new Car_class();
        Car_class mycar2 = new Car_class();

        System.out.println(mycar1.model);
        System.out.println(mycar1.company);
        System.out.println(mycar1.name);

        mycar1.drive();
        mycar1.stop();


        System.out.println(mycar2.model);
        System.out.println(mycar2.company);
        System.out.println(mycar2.name);

        mycar2.drive();
        mycar2.stop();



    }
}
