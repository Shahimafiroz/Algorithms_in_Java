import java.util.Scanner;

// While loop = executes a code block as long as the condition remains true
/*
   Syntax:-

       while(1==1){
           System.out.println(" HELP !!! Im stuck in a while loop !!");
       }
  Syntax :-

 */

public class Loop_while {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        while (name.isBlank()){
            System.out.print("Enter Your name : ");
            name = scanner.nextLine();
        }
        System.out.println("Hello "+ name );
    }

}
