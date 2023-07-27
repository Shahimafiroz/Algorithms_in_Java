import  java.util.Scanner;
/*In do while loop the block of code is at least executed once and then the condition is checked
syntax:-

   do {
             code block

    } while (condition)

 */

import java.util.Scanner;
public class Loops_doWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        do {
            System.out.print("Enter Your name : ");
            name = scanner.nextLine();
        }while (name.isBlank());
        System.out.println("Hello "+ name );
    }
}
