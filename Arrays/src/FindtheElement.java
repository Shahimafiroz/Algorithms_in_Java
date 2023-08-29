import java.util.Scanner;

public class FindtheElement {
    public static void main(String[] args) {
        int [][] vall = new int[4][5];
        System.out.println("Enter the number of rows and columns");
        Scanner scanFairy = new Scanner(System.in);
        int rows = scanFairy.nextInt();
        int cols = scanFairy.nextInt();


        System.out.println("Enter the elements : ");


        // input
        for (int i = 0 ; i < rows ; i++){
            for(int j =0 ; j<cols ; j++){
                vall[i][j] =scanFairy.nextInt();
            }
        }
        System.out.println("Enter the element to be found");
        int ex = scanFairy.nextInt();
        //output
        for (int i = 0 ; i < rows ; i++){
            for(int j =0 ; j<cols ; j++){
//                System.out.print(vall[i][j]+"  ");
                if ( vall[i][j]== ex){
                    System.out.println("The element  "+ ex +" was found at ( "+i+","+j+")");
                }
            }
            System.out.println();
        }
    }
}
