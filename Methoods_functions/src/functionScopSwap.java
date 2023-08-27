public class functionScopSwap {
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

    //function scope
    public static void swp (int num1 , int num2){

        int temp =num1  ;
        num1 = num2 ;
        num2=temp;


    }



}
