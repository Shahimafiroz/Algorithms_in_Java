package Objectpassing_as_Argguments_into_a_class;

public class SuperGarage {
    SuperGarage(Car... cars ){
     for (Car car : cars){
         System.out.println("The  "+car.name+" is parked in Super Garage");
     }
    }
}
