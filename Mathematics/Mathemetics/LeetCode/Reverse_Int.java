package LeetCode;

import java.util.Scanner;

public class Reverse_Int {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int x = sc.nextInt();
        System.out.println(revInt(x));

    }

    static int revInt(int num) {
        int sign = num<0 ? -1 : 1 ;  // if n is less then 0 then ----> (do this) -1 , (else do this) 1 ;
        int n = Math.abs(num);
        int  res = n%10;
        while(n > 1){
            n = n/10;
            System.out.println(" n "+n);
            res = res*10  + (n%10);
            System.out.println("res "+res);
        }
        if (sign== -1){
            return (-1*res);
        }
        return res;
    }
}


/*
                                                                     SOLUTION 1 :

but the range is [-231, 231 - 1], the
 int sign = num<0 ? -1 : 1 ;  // if n is less then 0 then ----> (do this) -1 , (else do this) 1 ;
        int n = Math.abs(num);
        StringBuilder temp = new StringBuilder();
        temp.append(n);
//        StringBuilder strtemp = temp.reverse();
        int res = Integer.parseInt(temp.reverse().toString());
        if (sign== -1){
            return (-1*res);
        }
        return res;

                                                                      SOLUTION 2

10% and store





 */