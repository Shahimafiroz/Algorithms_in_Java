/*                                      THE MOST EFFICIENT SOLUTION

Using Lookup table: We can count bits in O(1) time using the lookup table.
Below is the implementation of the above approach:
Time Complexity: O(1)
Auxiliary Space: O(1)
 */






package AllsetBitsinAInt;

import java.util.Scanner;

public class LookUpTable {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER TO CALCULATE THE SET BITS IN A NUMBER :");
        int a = myScan.nextInt();

        System.out.println( FirstSetBit(a));
    }

    public static int  FirstSetBit (int n ){

        int count = 0;

        while(n > 0){
            n = n & (n - 1);
            count++;
        }

        return count ;

    }
}
