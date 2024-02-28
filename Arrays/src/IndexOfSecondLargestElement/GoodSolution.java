package IndexOfSecondLargestElement;

import java.util.Scanner;

public class GoodSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array  : ");
        int size = sc.nextInt();
        int[] Input_array = new int[size];
        System.out.println("Enter the element of the array ");
        for (int i = 0; i < size; i++) {
            Input_array[i] = sc.nextInt();
        }
        int lar  = LargestElement(Input_array);
        int secLar = SecondlargestElement(Input_array, lar);
        System.out.println("largest element : "+ lar+ ".");
        System.out.println("Second largest element : "+ secLar+ ".");

    }
        public static int SecondlargestElement ( int[] arr, int largestElement){
            int op = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[1] > op && arr[i] < largestElement) {
                    op = arr[i];
                }else {
                    op = -1;
                }
            }
            return op;
        }
        public static int LargestElement ( int[] arr){
            int res = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > res) {
                    res = arr[i];

                }
            }
            return res;
        }

    }

