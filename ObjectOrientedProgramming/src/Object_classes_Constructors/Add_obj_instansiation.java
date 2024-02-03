package Object_classes_Constructors;

import java.util.Scanner;

public class Add_obj_instansiation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 2 numbers: ");
        double num1 = scanner.nextInt();
        double num2 = scanner.nextInt();

        Add_consturctor adding  = new Add_consturctor(num1 , num2);


    }
}
