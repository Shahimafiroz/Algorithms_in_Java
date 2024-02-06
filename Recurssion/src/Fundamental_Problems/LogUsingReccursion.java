package Fundamental_Problems;

import java.util.Scanner;

public class LogUsingReccursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of the Log : ");
        int a = sc.nextInt();
        System.out.println("Enter the number to be taken as Log : ");
        int b = sc.nextInt();
        LogRep(b,a);
        System.out.println("Log of "+b+" to the base"+a+" is : "+LogRep(b,a));

    }




    static int LogRep(int n, int x) {
        if(n == 1){
            return 0;
        }else{
        return 1+ LogRep(n/x , x);
        }

    }





}

