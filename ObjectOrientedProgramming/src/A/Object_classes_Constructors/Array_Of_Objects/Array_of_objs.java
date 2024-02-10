package A.Object_classes_Constructors.Array_Of_Objects;

import java.util.Scanner;

public class Array_of_objs {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of birds :");
        int count = sc.nextInt();
        sc.nextLine();
        Bird [] Birds = new Bird[count];
        /// this escpe sequence is to continue execution and user input
        for (int i = 0; i < Birds.length; i++) {
            System.out.print("Enter the name of bird " + (i + 1) + ": ");
            String name = sc.nextLine();
            Birds[i] = new Bird(name);
        }

        // Print the names of birds stored in the array
        for (Bird bird : Birds) {
            System.out.println(bird.name);
        }




    }
}
