/*
2) Efficient Approach

An efficient solution is based on the below formula for LCM of two numbers ‘a’ and ‘b’.

a x b = LCM(a, b) * GCD (a, b)

LCM(a, b) = (a x b) / GCD(a, b)
Here, we calculate GCD using, Optimised Euclidean Algorithm.

Then, further, calculate LCM.

Time Complexity: O(log(min(a,b))


 */

package LowestCommonMultiple;

import java.util.Scanner;

public class LCMeuclidean {
    public static void main(String[] args) {
        System.out.println("Enter 1st number  : ");
        Scanner myscan = new Scanner(System.in);
        int x = myscan.nextInt();
        System.out.println("Enter 2nd number  : ");
        int y = myscan.nextInt();
        //lcm
        int Lcm = (x*y)/HCF(x,y);
        //output
        System.out.println("The LCM of "+x+" , "+y+" is : "+Lcm);
    }

    //hcf
    public static int HCF(int a, int b){
        if(b ==0){
            return a;
        }else {
            return HCF(b,a%b);
        }
    }
}

