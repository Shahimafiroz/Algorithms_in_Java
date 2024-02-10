// Aim to park the cars in garage

package D.Objectpassing_as_Argguments_into_a_class;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW");
        Car car2 = new Car("Bugati");
        Car car3 = new Car("Ducati");
        Car car4 = new Car("Ferrari");



        Garage garage1 = new Garage(car1);
        Garage garage2 = new Garage(car2);
        Garage garage3 = new Garage(car3);
        Garage garage4 = new Garage(car4);

        SuperGarage BigGarage = new SuperGarage(car1,car2,car3,car4);


    }
}
