package Operators;

import java.util.Scanner;

public class Rightshift {
    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);
        System.out.println("enter Number 1 : ");
        int x = myscan.nextInt();
        System.out.println("Enter Number 2 : ");
        int y = myscan.nextInt();
        int XRightShift2 = x >> 4;
        int YRightShift1 = y >> 1;
        int YRightShift2 = y >> 4;
        int XRightShift1 = x >> 1;
        System.out.println(" Right shifting Number 1 by 1 : " + XRightShift1);
        System.out.println(" Right shifting Number 1 by 4 : " + XRightShift2);
        System.out.println(" Right shifting Number 2 by 1 : " + YRightShift1);
        System.out.println(" Right shifting Number 2 by 4 : " + YRightShift2);

    }
}