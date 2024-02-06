package Fundamental_Problems;

import java.util.Scanner;

public class PrintNumFrom1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the count  : ");
        int a = sc.nextInt();
        Print1toN(a);

    }

    static void Print1toN(int n){
        if(n==0){

        }else{
            Print1toN(n-1);
            System.out.println(n);

        }
    }
}
