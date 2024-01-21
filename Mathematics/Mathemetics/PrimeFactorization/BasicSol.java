package PrimeFactorization;

import java.util.Scanner;


public class BasicSol {
    public static void main(String[] args) {

        System.out.println("Enter the number to be PRIME FACTORIZED : ");
        Scanner myscan = new Scanner(System.in);
        int input = myscan.nextInt();
        int  output = PriFact(input);
        System.out.println("The Prime Factors of the following number is : "+output);


    }
    public static int PriFact( int n){
        for(int i = 2 ; i < n ; n++){
            if(IsPri(i) == true){
                int x = i ;
                while (n%x==0){
                    x =x * i;
                }
            }
        }
        return n;
    }

    public static boolean IsPri(int a){
        if(a==2 || a==3){
            return true;
        }
        if (a == 1 || a%2 ==0 || a%3==0) {
            return false;
        }
        for (int i = 5; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }





}
