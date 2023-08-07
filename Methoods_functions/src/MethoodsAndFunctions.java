import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        sum();
        int ot = sumdrum();
        System.out.println(ot);
        String name = name();
        System.out.println("Hello!! " +name+ " how are u " + name+" ?");
          System.out.println(  suuuum(700 , 800));

    }
    //function when  input has to be provided

   public static int suuuum  (int a , int b ){
        int c = a+b;
        return  c;
    }
//function when there is no return type
    public static void sum(){
        Scanner  scan = new Scanner(System.in);
        System.out.println("Enter Number 1 : ");
        int num1 = scan.nextInt();
        System.out.println("Enter Number 2 : ");
        int num2 = scan.nextInt();
        int num3 = num1 + num2;
        System.out.println(" Sum : " + num3);
    }



//    function when ther is int and string return type respectively
    public static int sumdrum(){
        Scanner scan = new Scanner(System.in);
        System.out.println("num 1: ");
        int a = scan.nextInt();
        System.out.println("num 2 : ");
        int b= scan.nextInt();
        int c = a+b;
        return c;
    }

    public static String name (){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Name : ");
        String name = scan.nextLine();
        return name;
    }








}

