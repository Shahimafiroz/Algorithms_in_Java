/*
Given a number N and a bit number K, check if Kth index bit of N is set or not. A bit is called set if it is 1.
Position of set bit '1' should be indexed starting with 0 from LSB side in binary representation of the number.
Note: Index is starting from 0. You just need to return true or false, driver code will take care of printing "Yes" and "No".

Input:
N = 4
K = 2
Output:
Yes
Explanation:
Binary representation of 4 is 100, in which 2nd index bit from LSB is set. So, return true.

Input:
N = 500
K = 3
Output:
No
Explanation:
Binary representation of 500 is 111110100, in which 3rd index bit from LSB is not set. So, return false.

 */


//



package KthBitSetOrNot;

import java.util.Scanner;

public class LeftShift {
    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);
        System.out.println("This is LEFT SHIFT METHOD OUTPUT");
        System.out.println("Enter the number :");
        int n = myscan.nextInt();
        System.out.println("Enter the Bit you want to check if set or not :");
        int k = myscan.nextInt();
        boolean isSetOrNot = SetOrNot(n , k);
        if (isSetOrNot == true){
            System.out.println(" YES ");
        }else{
            System.out.println("NO");
        }


    }

    public static boolean SetOrNot(int n , int k){
        int x = 1 ;
        for (int i = 0 ; i < k ; i++ ){
            x = x *2;
        }
        if ((n&x)==0){
            return false; // not set ; bit = 0 ; "& with 1  = "--> even || in case of last digit
        }else{
            return true; // set = bit =1 -> odd || in case of last digit
        }
    }
}
