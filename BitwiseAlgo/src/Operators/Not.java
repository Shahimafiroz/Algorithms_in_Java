package Operators;

import java.util.Scanner;
// ~ (bitwise NOT) Takes one number and inverts all bits of it. Suppose A = 5, therefore ~A = -6.
public class Not {
    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);
        System.out.println("enter Number 1 : ");
        int x = myscan.nextInt();
        System.out.println("Enter Number 2 : ");
        int y = myscan.nextInt();
        int Xcomp = ~ x ;
        int Ycomp = ~y ;
        System.out.println("The Not of the following numbers is : " + Xcomp +" and " + Ycomp);



    }
}
