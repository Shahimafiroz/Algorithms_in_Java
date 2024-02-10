package B.OverloadedConstructors;

public class Pizza_main {
    public static void main(String[] args) {
        //String crust, String cheese , String veggies, String sauce)
        Pizza pizza1 = new Pizza("flat", "Mozerella" ,"Tomatoes" , "mariana");
        Pizza pizza2 = new Pizza("Thick", "Fetta" , "garliCream");
        Pizza pizza3 = new Pizza("flat", "Mozerella");

        System.out.println("Here are the ingeredients to ur pizza : ");
        System.out.println(pizza1.crust);
        System.out.println(pizza1.sauce);
        System.out.println(pizza1.veggies);
        System.out.println(pizza1.sauce);
        System.out.println("Here are the ingeredients to ur pizza : ");
        System.out.println(pizza2.crust);
        System.out.println(pizza2.sauce);
        System.out.println(pizza2.veggies);
        System.out.println(pizza2.sauce);
        System.out.println("Here are the ingeredients to ur pizza : ");
        System.out.println(pizza3.crust);
        System.out.println(pizza3.sauce);
        System.out.println(pizza3.veggies);
        System.out.println(pizza3.sauce);






//
    }
}
