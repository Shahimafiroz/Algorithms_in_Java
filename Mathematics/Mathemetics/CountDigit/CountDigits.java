package CountDigit;/*package whatever //do not write package name here */

import java.util.*;

class GFG {


    static int countDigits(int x)
    {
        int res = 0;

        while(x > 0)
        {
            x = x / 10;

            res++;
        }

        return res;
    }

    public static void main (String[] args) {

        System.out.println("Enter The number");
        Scanner myscan = new Scanner(System.in);
         int x = myscan.nextInt();

        int number = x;

        System.out.println(countDigits(number));

    }
}