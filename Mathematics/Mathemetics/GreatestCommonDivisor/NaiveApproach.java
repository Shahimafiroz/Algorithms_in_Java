package GreatestCommonDivisor;

import java.util.Scanner;

public class NaiveApproach {
    public static void main(String[] args) {
        System.out.println("Enter 1st number  : ");
        Scanner myscan = new Scanner(System.in);
        int x = myscan.nextInt();
        System.out.println("Enter 2nd number  : ");
        int y = myscan.nextInt();
        System.out.println("The HCF of "+x+" , "+y+" is : "+Bruteforce(x , y ));

    }

    public static int Bruteforce (int a , int b){
        int res = Math.min(a,b) ;
        while(res>0){
          if(a%res ==0 && b%res ==0){
              break;
          }
          res --;
        }
        return res;
    }
}
