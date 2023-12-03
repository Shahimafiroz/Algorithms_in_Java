package Factorial;

import java.util.Scanner;

public class FactoReccursive {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner myscan = new Scanner(System.in);
        int y = myscan.nextInt();
        System.out.println("The Factorial of "+y+" is : "+FactorialIs(y));

    }
    public static int FactorialIs(int n ){
        if(n== 0){
            return 1 ;
        }else{
            return (n * FactorialIs(n-1));
        }
    }
}
