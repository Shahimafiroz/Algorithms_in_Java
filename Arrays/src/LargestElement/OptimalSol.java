package LargestElement;

import java.util.Scanner;

public class OptimalSol {
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
        int[] largestElementOfTheGivenArray = LargestElement(Input_array);
        System.out.println("Largest element in the entered is : " + largestElementOfTheGivenArray[0] +" at the index :"+largestElementOfTheGivenArray[1]);

    }
    public static int[] LargestElement( int [] arr){
        int [] res = new int[2];
         res[0] = 0;
              for (int i = 0 ; i <arr.length ;i++){
                  if(arr[i] > res[0] ){
                      res[0]= arr[i] ;
                      res[1] = 1+i;
                  }
              }

        return res;
    }

    



}
