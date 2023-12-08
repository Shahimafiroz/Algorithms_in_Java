package CheckforPrime;

import java.util.Scanner;

public class NaiveSol {
    public static void main(String[] args) {
        System.out.println("Enter number  : ");
        Scanner myscan = new Scanner(System.in);
        int x = myscan.nextInt();
        boolean res = Prime(x); //methood1
/*        boolean res = Primes(x); //method2  The loop should iterate up to the square root of a, not up to a.
       This is because, for any number n, if it has a factor greater than its square root,
       it must also have a factor smaller than its square root.*/
        System.out.println("Is "+x+" a prime Number ???? , " + res);
    }

    public static boolean Prime(int a ){
        if (a <= 1) {
            return false;
        }
        for (int i = 2 ; i < a ;  i++){
            if(a%i == 0){
                return false;
            }

        }
        return true;
    }

//    public static boolean Primes(int a) {
//        if (a <= 1) {
//            return false;
//        }
//        for (int i = 2; i <= Math.sqrt(a); i++) {
//            if (a % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
}
