package A.Object_classes_Constructors.Copy_Constructor;


import java.util.Scanner;

public class CopyConstructor_Obj_instantiation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        // Consume the newline character from the input buffer
        scanner.nextLine();

        // Creating an object using the constructor with parameters
        Copy_Constructor originalObject = new Copy_Constructor(num1, num2, num3);

        // Creating a copy of the original object using the copy constructor
        Copy_Constructor copiedObject = new Copy_Constructor(originalObject);

        // Print the sum of the three numbers
        System.out.println("Sum of the three numbers: " + originalObject.getSum());
        // Print the sum of the three numbers
        System.out.println("Sum of the three numbers: " + copiedObject.getSum());
    }
    }







