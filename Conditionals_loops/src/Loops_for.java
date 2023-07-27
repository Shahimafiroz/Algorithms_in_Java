// for loop = executes a block of code a limited amount of times

import java.util.Scanner;

public class Loops_for {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the count : ");
        int count = scan.nextInt();
//        for (int i=0 ; count >= i; i++){
//            System.out.println(i);
//        }
        for (int i = count ; i >= 0; i-- ){
            System.out.println(i);
        }
//        for (int i = count ; i >= 0; i-=2 ){
//            System.out.println(i);
//        }
         System.out.println("HAPPY NEW YEAR !!!");

    }
}
