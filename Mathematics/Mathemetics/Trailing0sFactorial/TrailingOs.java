package Trailing0sFactorial;

import java.util.Scanner;

public class TrailingOs {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner myscan = new Scanner(System.in);
        int y = myscan.nextInt();
        System.out.println("Trailing 0s in the Factorial of "+y+" is : "+Trail(y));

    }

    public static int Trail(int n){
        int res = 0 ;
        for (int i =5 ;i <= n ; i= i*5){

            res = res+ (n/i);
        }
        return res;
    }
}
