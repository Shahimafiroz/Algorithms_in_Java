package Power_of_2;

import java.util.Scanner;

public class naive_rightshift {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter Number");
        int a = sc.nextInt();

        System.out.println("Result : "+power2s(a));


    }

    public static boolean power2s(int n){

        if (n == 0){
            System.out.println(" Bro its 0");
            return false;
        }
        while(n!=1){

            if((n&1) ==1 ){
                System.out.println(n);
                System.out.println("Not 2s Power");
                return false;
            }else{
                n=n/2;
                System.out.println(n);
            }

        }
        System.out.println("2s Power");
        return true;
    }

}
