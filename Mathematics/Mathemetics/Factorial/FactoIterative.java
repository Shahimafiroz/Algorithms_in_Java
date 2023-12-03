package Factorial;
import java.util.Scanner;

public class FactoIterative {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner myscan = new Scanner(System.in);
        int y = myscan.nextInt();
        System.out.println("The Factorial of "+y+" is : "+FactorialIs(y));


    }

    public static int FactorialIs(int x){
        int res = 1;
        for (int i = 2 ; i <= x;i++ ){
            res = res*i;
        }

     return (res);
    }
}
