
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter 2 names");
        String name1 = scan.nextLine();
        String name2 = scan.nextLine();
        System.out.println("Hello "+name1+" and "+name2);
        System.out.println("GoodBye "+name1+" and "+name2);

    }
}