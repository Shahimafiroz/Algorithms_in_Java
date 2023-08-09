public class Swap {
    public static void main(String[] args) {
        int a= 20;
        int b = 30;
        System.out.println("a: "+ a+ " b: "+ b +" .");
        //swap numbers code
//        int temp =a  ;
//        a = b ;
//        b=temp;
//        System.out.println("a: " + a + " b: " + b + " .");
        swp(a , b );
        System.out.println("a: " + a + " b: " + b + " .");

    }

    public static void swp (int a , int b){

        int temp =a  ;
        a = b ;
        b=temp;


    }



}
