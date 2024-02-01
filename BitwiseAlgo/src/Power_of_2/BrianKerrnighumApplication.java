/*
Find whether a given number is a power of 2 using Brian Kernighan’s algorithm:
To solve the problem follow the below idea:

As we know that the number which will be the power of two have only one set bit , therefore when we do bitwise AND with the number which is just less than the number which can be represented as the power of (2) then the result will be 0 .

Example : 4 can be represented as (2^2 ) ,
                (4 & 3)=0  or in binary (100 & 011=0)
 */

package Power_of_2;

import java.util.Scanner;

public class BrianKerrnighumApplication {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter Number");
        int a = sc.nextInt();

        System.out.println("Result : "+power2s(a));


    }

    public static boolean power2s(int n){
        if(n==0){
            return false;
        }
        if((n&n-1) ==0){
            String res ="Yes";
            System.out.println("Yes the number is power of 2");
            return true;

        }
            System.out.println("NO the number is not power of 2");
            return false;

    }

}
