package OverloadedConstructors;

// toString() = special method that all objects inherit,
//    that returns a string that "textually represents" an object.
//    can be used both implicitly and explicitly


public class UsingtoStringtoprintpizza {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("flat", "Mozerella" ,"Tomatoes" , "mariana");
        Pizza pizza2 = new Pizza("Thick", "Fetta" , "garliCream");
        Pizza pizza3 = new Pizza("flat", "Mozerella");
    }



}
