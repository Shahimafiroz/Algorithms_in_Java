package LargestElement;

import java.util.Scanner;

public class SecondLargestElemen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array  : ");
        int size =  sc.nextInt();
        int[] Input_array = new int [ size ];
        System.out.println("Enter the element of the array ");
        for (int i = 0 ; i < size ; i ++){
            Input_array[i] = sc.nextInt();
        }

//        for (int i = 0 ; i < size ; i++){
//            System.out.println(Input_array[i]);
//        }
        int[] SecondlargestElementOfTheGivenArray = SecondLargestElement(Input_array);
        System.out.println("2nd Largest element in the entered is : " + SecondlargestElementOfTheGivenArray[1] +" at the index :"+SecondlargestElementOfTheGivenArray[2]);

    }

    public static int[] SecondLargestElement( int [] arr){
        int [] res = new int[3];
        res[0] = 0;
        for (int i = 0 ; i <arr.length ;i++){
            if(arr[i] > res[0] ){
                res[1] = res[0]; //2nd largest element
                res[0]= arr[i] ; // largest element
                res[2] = 1+i;  // index of largest element
            }
        }

        return res;
    }


}
