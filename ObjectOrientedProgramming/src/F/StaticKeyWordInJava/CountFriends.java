package F.StaticKeyWordInJava;

import java.util.Scanner;

public class CountFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of your friends");
        Friends f1 = new Friends(sc.next());
        Friends f2 = new Friends(sc.next());
        Friends f3 = new Friends(sc.next());
        Friends f4 = new Friends(sc.next());

//        System.out.println( f1.noOfFriends = 10);  // uncomment this run and see -- u will also see yellow sqiggly line read the warning
//        Friends f1 = new Friends("shahima");
//        Friends f2 = new Friends("khushi");
//        Friends f3 = new Friends("sanjna");
//        Friends f4 = new Friends("ankita");

        System.out.println(Friends.noOfFriends); /// static var should be called with the name of the class its a part of \


        f1.displayFriends();
        f2.displayFriends();
        f3.displayFriends();
        f4.displayFriends();


//        System.out.println(f1.noOfFriends);
//        System.out.println(f2.noOfFriends);
//        System.out.println(f3.noOfFriends);
//        System.out.println(f4.noOfFriends);
    }
}
