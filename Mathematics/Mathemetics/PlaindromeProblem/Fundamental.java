package PlaindromeProblem;
import java.util.Scanner;

public class Fundamental {
    public static void main(String[] args) {
        // Example usage:
        Fundamental solution = new Fundamental();
        System.out.println("Enter integer : ");
        Scanner myscan = new Scanner(System.in);
        int x = myscan.nextInt();
        boolean result = solution.IsPalindrome(x);
        System.out.println("Is it a palindrome:  " + result);
    }

    public boolean IsPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        // Declarations
        int temp = x;
        int rev = 0 ;
        // Loop for reversing and comparing
        while(temp != 0){
            int ld = temp % 10;
            rev = rev * 10 + ld;
            temp = temp / 10;
        }
        return (rev == x);
    }
}
