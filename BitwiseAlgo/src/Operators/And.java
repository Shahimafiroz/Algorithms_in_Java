package Operators;
import java.util.Scanner;


public class And {
    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);
        System.out.println("enter Number 1 : ");
        int x = myscan.nextInt();
        System.out.println("Enter Number 2 : ");
        int y = myscan.nextInt();
        int and = x & y ;
        System.out.println("The And of the following numbers is : " + and);



    }
}
