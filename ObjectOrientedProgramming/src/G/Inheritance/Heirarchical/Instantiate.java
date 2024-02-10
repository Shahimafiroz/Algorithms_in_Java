package G.Inheritance.Heirarchical;

public class Instantiate {
    public static void main(String[] args) {

        Car car = new Car();
        Bike bike = new Bike();

        car.go();
        bike.go();
        car.stop();
        bike.stop();

        System.out.println(car.speed);
        System.out.println(bike.speed);


    }
}
