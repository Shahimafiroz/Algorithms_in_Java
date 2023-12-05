package GreatestCommonDivisor;

import java.util.Scanner;

public class OptimisedEuclideanAlgo {
    public static void main(String[] args) {
        System.out.println("Enter 1st number  : ");
        Scanner myscan = new Scanner(System.in);
        int x = myscan.nextInt();
        System.out.println("Enter 2nd number  : ");
        int y = myscan.nextInt();
        System.out.println("The HCF of "+x+" , "+y+" is : "+Hcf(x , y ));
    }

    public static int Hcf(int a , int b){
        if (b==0){
            return a;
        }else{
           return Hcf(b,a%b);
        }
    }
}
