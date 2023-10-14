package CountDigit;

import java.util.Scanner;

public class Number2stringSolution {

    static void countDigits(long n){
        String num = Long.toString(n);
        System.out.println("The number of Digits = " + num.length());

    } /// function to count digits
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner myScan =  new Scanner(System.in);
        Long n  = myScan.nextLong();
        countDigits(n);
    }
}
