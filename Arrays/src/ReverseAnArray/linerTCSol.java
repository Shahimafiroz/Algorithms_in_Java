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

//        System.out.println(Reverse(Input_array)); ---> wrong

        int[] reversedArray = Reverse(Input_array);
        System.out.println("Reversed array:");
        for (int num : reversedArray) {
            System.out.print(num + " ");
        }
    }


    public static int[] Reverse (int [] arr)
    {   int temp;
        int j = arr.length-1;
        for (int i = 0 ; i < arr.length/2 ; i++){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j = j -1 ;
            System.out.println("a[i] = : " +arr[i]+".");
            System.out.println("a[j] = : " +arr[j]+".");
        }



        return arr;
    }



}
