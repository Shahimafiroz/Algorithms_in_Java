package Operators;

import java.util.Scanner;
// Usecase :- U can use left shift operator if you want to multiply by the power of 2 
public class LeftShift {
    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);
        System.out.println("enter Number 1 : ");
        int x = myscan.nextInt();
        System.out.println("Enter Number 2 : ");
        int y = myscan.nextInt();
        int XleftShift1 =  x << 1 ;
        int XleftShift2 =  x << 2 ;
        int YleftShift1 =  y << 1 ;
        int YleftShift2 =  y << 2 ;
        System.out.println(" Left shifting Number 1 by 1 : " + XleftShift1 );
        System.out.println(" Left shifting Number 1 by 1 : " + XleftShift2 );
        System.out.println(" Left shifting Number 1 by 1 : " + YleftShift1 );
        System.out.println(" Left shifting Number 1 by 1 : " + YleftShift2 );



    }
}
