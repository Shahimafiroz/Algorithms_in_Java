package CheckforPrime;

import java.util.Scanner;
public class EfficientPairSol {
    public static void main(String[] args) {
        System.out.println("Enter number  : ");
        Scanner myscan = new Scanner(System.in);
        int x = myscan.nextInt();
        boolean res = Primes(x);
//method2  The loop should iterate up to the square root of a, not up to a.
// This is because, for any number n, if it has a factor greater than its square root,
// it must also have a factor smaller than its square root.*/
        System.out.println("Is "+x+" a prime Number ???? , " + res);
    }
    public static boolean Primes(int a) {
        if (a <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

}

/*Iterate through all numbers from 2 to square root of n and for every number check if it divides n
[because if a number is expressed as n = xy and any of the x or y is greater than the root of n,
the other must be less than the root value]. If we find any number that divides, we return false.
 Time Complexity: O(sqrt(n))

Auxiliary space: O(1)

 */


