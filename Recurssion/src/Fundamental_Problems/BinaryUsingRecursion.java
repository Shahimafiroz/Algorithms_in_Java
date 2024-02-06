package Fundamental_Problems;

import java.util.Scanner;

public class BinaryUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        System.out.println(BinaryRep(a));
    }



    static String BinaryRep(int n ){

        if(n==0){
            return "" ;
        }
//        BinaryRep(n/2);
//        System.out.println(n%2);
        String result = BinaryRep(n/2)+n%2;
        return result;

    }

}

/*
to print the entire binary representation as string at sonce we did this

1. We changed the return type of the BinaryRep method to String.
2 .When the base case (n == 0) is reached, we return an empty string.
3 In the recursive step, we recursively call BinaryRep on n / 2 to obtain the binary representation of the quotient,
  and concatenate it with n % 2, which represents the remainder when n is divided by 2. This way, the binary string is built up recursively.
4. Finally, we print the binary representation obtained from the BinaryRep method in the main method.
 */