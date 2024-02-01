/*
Complexity
Time Complexity: O(Log(N)), Where N is given number.
Auxiliary Space: O(1), We are not using any extra space.
 */

package FirstSetBit;

import java.util.Scanner;

public class RightShiftandAnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int x = sc.nextInt();

        System.out.println(" Final answer : "+firstsetbit(x));


    }

    static int firstsetbit (int n){

        int res = 1;
        while(n!=0){
            if ((n&1)==0){
                res ++;
                System.out.println("not set "+res);
            }else{
                System.out.println("SET at : "+res);
                return res;
            }
           n = n >> 1; // Right shift by 1 bit
        }
        // If no set bit found
        System.out.println("no set bit found");
        return 0;

    }

}
