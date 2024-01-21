package Operators;


import java.util.Scanner;

public class Or {
    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);
        System.out.println("enter Number 1 : ");
        int x = myscan.nextInt();
        System.out.println("Enter Number 2 : ");
        int y = myscan.nextInt();
        int Or = x | y ;
        System.out.println("The Or of the following numbers is : " + Or);

    }
}
