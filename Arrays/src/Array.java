
//Arrays are used to store multiple values  in a single variable
//the elements in an array have to be of the same data type(consistency)
//java supports dynamic arrays
// there is no way to print the entire array using a method in java u need to use loops



public class Array {
    public static void main(String[] args) {
       String[] cars = {"scorpio" ,"Rolls roacye" , "Shit " , "ford"};
       // you can also just declare the array and then add elements in the future (dynamic array)
       cars[0] = "Mustang";
        System.out.println(cars[3]);

        for(int i = 0 ; i < cars.length ; i++){
            System.out.println(cars[i]);
        }
    }
}