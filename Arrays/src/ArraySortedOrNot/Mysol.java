
// check if the array is sorted in increading order , non decreasing order ,

package ArraySortedOrNot;

import java.util.Scanner;

public class Mysol {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array  : ");
        int size =  sc.nextInt();
        int[] Input_array = new int [ size ];
        System.out.println("Enter the element of the array ");
        for (int i = 0 ; i < size ; i ++){
            Input_array[i] = sc.nextInt();
        }// end of for

        System.out.println(IsSorted(Input_array));
    }


    static boolean IsSorted(int[]a){
        for (int i = 0 ; i < a.length-1; i++ ){
            if(a[i] > a[i+1]){
                return false ;
            }
        }
        return true;
    }




}
