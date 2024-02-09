package Fundamental_Problems;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to print sum of digits");
        int number = sc.nextInt();
        int res = sumOfDigits(number);
        System.out.println(res);

    }
    static  int sumOfDigits(int num ){

        if(num == 0 ){
            return 0;
        }
        int ld = num%10;
        int R = num/10;
        return sumOfDigits(R)+ld;

    }
}
