package LowestCommonMultiple;
import java.util.Scanner;
public class NaiveApproach {
    public static void main(String[] args) {
        System.out.println("Enter 1st number  : ");
        Scanner myscan = new Scanner(System.in);
        int x = myscan.nextInt();
        System.out.println("Enter 2nd number  : ");
        int y = myscan.nextInt();
        System.out.println("The LCM of "+x+" , "+y+" is : "+Lcm(x , y ));

    }
    public  static  int Lcm(int a, int b){
        int res = Math.max(a , b );
        while(true) {
            if (res % a == 0 && res % b == 0) {
                break;
            } else {
                res ++;
            }
        }
        return res;
    }
}

//The basic approach is to find the maximum of both numbers, then iterate from that number,
// till we find a number that is completely divisible by both numbers.
//Time Complexity: O(a*b - max(a,b))