/*
Nested loops = loop within a loop

 */


import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {
        // declaring the scanner
        Scanner scan = new Scanner(System.in);
        // declaring the variables
        int rows ;
        int colmns ;
        String symb = "" ;
        // Asking and storing inputs
        System.out.println("Enter the number of rows : ");
        rows = scan.nextInt();
        System.out.println("Enter the number of columns : ");
        colmns = scan.nextInt();
        System.out.println("Enter the Symbol : ");
        symb = scan.next();
        // executing loops
        for (int i = 1 ; i<= rows ; i ++ ){
            System.out.println(); // this is for a new line after each row. if you don't use this then all the elements will be printed in the same line
            for (int j = 1 ; j <= colmns ; j++){
                System.out.print(symb+" "); /*note its not " println();" if u do println then each symbol of a row being
                                            printed using number of columns will be printed in a new line hence no rectangle pattern */
            }
        }





    }
}
