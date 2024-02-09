package Fundamental_Problems;

import java.util.Scanner;

public class Plaindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to check if plaindrome");
        String Plaindrome = sc.nextLine();
        int start  = 0 ;
        int end = (Plaindrome.length())-1;
        Checkplaindrome( Plaindrome , start , end  );

    }

   static Boolean Checkplaindrome(String x, int start, int end){
       System.out.println(x.charAt(start));
       System.out.println(x.charAt(end));
        if (start >= end){
            System.out.println("Is a plaindrome  ");
            return true;
        }

        if(x.charAt(start) != x.charAt(end)){
            System.out.println("Not a plaindrome ");
            return false;
        }

       return Checkplaindrome(x , start+1 ,end-1);
    }

}
