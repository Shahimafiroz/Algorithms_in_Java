import  java.util.Scanner;

public class Main {

   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
      System.out.println("Enter side 1 : ");
      double x = scan.nextDouble();
      System.out.println("Enter side 2 : ");
      double y = scan.nextDouble();
      double z = Math.sqrt((x*x) + (y*y));
      System.out.println("The Hypoteneous is " + z);

   }

}

// useful methods of the math class
//Math.max();
//Math.abs();
// Math.round(); rounds to nearest whole number ;
//Math.ceil () ; round - up
// Math.floor() ; round - down
// Math.sqrt() ; square root
//