import java.util.Scanner;

public class Strrringss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name");
        String textone = sc.nextLine();
        System.out.println("Enter Last name");
        String textTwo = sc.nextLine();
        //concatenation
        String fullname = textone+" "+textTwo;
        System.out.println(" hello "+fullname+" .");
    }
}
