
//A 2D array is an array of arrays
//think of it as having rows and columns
import java.util.Scanner; // scanner class
public class Array2D {
    public static void main(String[] args) {
        int [][] vall = new int[4][5];
        System.out.println("Enter the number of rows and columns");
        Scanner scanFairy = new Scanner(System.in);
        int rows = scanFairy.nextInt();
        int cols = scanFairy.nextInt();
        // input
        System.out.println("Enter the elements : ");
        for (int i = 0 ; i < rows ; i++){
            for(int j =0 ; j<cols ; j++){
                vall[i][j] =scanFairy.nextInt();
            }
        }
        //output
        System.out.println("Here is your 2D array: ");
        for (int i = 0 ; i < rows ; i++){
            for(int j =0 ; j<cols ; j++){
                System.out.print(vall[i][j]+"  ");
            }
            System.out.println();
        }




    }
}










/*
u can give individual input like this :-

        names [0][0] = "Shahima";
        names [0][1] = "Khushi";
        names [0][2] = "sanju";
        names [0][3] = "Aadil";
        names [0][4] = "Aslam";
        names [0][5] = "sheela";
        names [0][6] = "leela";
        names [1][0] = "vikram";
        names [1][1] = "Aditya";
        names [1][2] = "Mohini";
        names [1][3] = "vishal";
        names [2][0] ="reema";
        names [2][1] = "seema";
        names [2][2] = "cheema";
        names [2][3] = "leema";

 u can also give input while declaring the array

 String[][] cars = 	{
								{"Camaro","Corvette","Silverado"},
								{"Mustang","Ranger","F-150"},
								{"Ferrari","Lambo","Tesla"}
							};


 */