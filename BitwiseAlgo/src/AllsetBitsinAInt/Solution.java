/*
In this tutorial we will learn to count the number of set bits ( 1's ) in the binary representation of any number.
We will also be taking a deep dive into Brian Kerningam's Algorithm and the Lookup Table method for the same.
Write an efficient program to count the number of 1s in the binary representation of an integer.
Examples :

Input : n = 6
Output : 2
Binary representation of 6 is 110 and has 2 set bits

Input : n = 13
Output : 3
Binary representation of 13 is 1101 and has 3 set bit

Time Complexity: O(log n)
Auxiliary Space: O(1)



 */


package AllsetBitsinAInt;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER TO CALCULATE THE SET BITS :");
        int a = myScan.nextInt();

        System.out.println( FirstSetBit(a));
    }

    public static int  FirstSetBit (int n ){
// ************************************** //
        int count = 0;
        // ************************************** //
        while(n > 0){
            count = count+(n&1);
            n = n/2;
        }
        // ************************************** //
     return count ;
        // ************************************** //
    }



}
