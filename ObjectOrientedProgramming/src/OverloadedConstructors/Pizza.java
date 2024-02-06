package OverloadedConstructors;

public class Pizza {
    String crust ;
    String cheese ;
    String veggies;
    String sauce ;
    Pizza(String crust, String cheese , String veggies, String sauce){
        this.crust = crust;
        this.cheese = cheese;
        this.veggies = veggies;
        this.sauce = sauce;

    }
    Pizza(String crust, String cheese , String sauce){
        this.crust = crust;
        this.cheese = cheese;
        this.sauce = sauce;

    }

    Pizza(String crust, String cheese ) {
        this.crust = crust;
        this.cheese = cheese;
    }

    // tostrng method .
    @Override
    public String toString(){
        return "\n\nPizza{" + "\nCrust = "+crust+ "\nCheese = "+cheese+ "\nVeggies = "+veggies+"\nSauce = "+sauce+"}";
    }

}
