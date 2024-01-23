import java.util.Scanner;

public class KthBitSetOrNot {
    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = myscan.nextInt();
        System.out.println("Enter the Bit you want to check if set or not :");
        int k = myscan.nextInt();
        boolean isSetOrNot = SetOrNot(n , k);
        if (isSetOrNot == true){
            System.out.println(" The inquired Bit is set ");
        }else{
            System.out.println("The inquired Bit is Not set");
        }


    }

        public static boolean SetOrNot(int n , int k){
           int shifted = n >> (k-1) ;
            if ((shifted&1)==0){
                return false; // not set ; bit = 0 ; "& with 1  = "--> even || in case of last digit
            }else{
                return true; // set = bit =1 -> odd || in case of last digit
            }
        }


}
