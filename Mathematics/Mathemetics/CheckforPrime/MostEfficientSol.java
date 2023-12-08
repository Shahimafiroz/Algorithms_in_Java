/*
3) More Efficient Approach

Steps:

We will deal with a few numbers such as 1, 2, and 3, and the numbers which are divisible by 2 and 3 in separate cases.
For the remaining numbers, we iterate from 5 to sqrt(n) and check for each iteration whether (that value) or (that value + 2) divides n or not and increment the value by 6 [because any prime can be expressed as 6n+1 or 6n-1].
If we find any number that divides, we return false, else true.
Time complexity: O(sqrt(n))

Auxiliary space: O(1)
 */
package CheckforPrime;
import java.util.Scanner;
public class MostEfficientSol {
    
    public static void main(String[] args) {
            System.out.println("Enter number  : ");
            Scanner myscan = new Scanner(System.in);
            int x = myscan.nextInt();
           boolean res = Pri(x);
           if(res== true){
               System.out.println( x+" Is Prime. ");
           }else{
               System.out.println( x+" Is Not Prime. ");
           }
    }
    public static boolean Pri(int a){
            if(a==2 || a==3){
                return true;
            }
            if (a == 1 || a%2 ==0 || a%3==0) {
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
