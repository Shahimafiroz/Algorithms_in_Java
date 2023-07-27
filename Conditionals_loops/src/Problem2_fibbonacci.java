import java.util.Scanner;

public class Problem2_fibbonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scan.nextInt();
        int  x=0;
        int y=1;
        int temp ;
        int bruh = num;

       while (num>=0){
           temp = x;
           x = x+y;
           y= temp;
           num--;
           System.out.println(y);


       }
        System.out.println(" The sum of fibonacci sequence till "+ bruh +"  is "+y);
    }
}
