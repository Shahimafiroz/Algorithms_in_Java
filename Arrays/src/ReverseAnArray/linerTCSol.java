package ReverseAnArray;

import java.util.Scanner;

public class linerTCSol {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array  : ");
        int size =  sc.nextInt();
        int[] Input_array = new int [ size ];
        System.out.println("Enter the element of the array ");
        for (int i = 0 ; i < size ; i ++){
            Input_array[i] = sc.nextInt();
        }// end of for

        System.out.println(Reverse(Input_array));
    }


    public static int[] Reverse (int [] arr)
    {
        


        return arr;
    }



}
