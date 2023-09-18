
/*
2D ArrayList = a Dynamic list of Dynamic list
You can change the size of these lists during run time
 */

import  java.util.*;

public class ArryLsts2D {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> groceries = new ArrayList();

        ArrayList<String> bakelist = new ArrayList<String>();
         bakelist.add("baking soda");
         bakelist.add("flour");
         bakelist.add("oil");
         bakelist.add("Butter");

        System.out.println(bakelist);

       ArrayList<String> veggies = new ArrayList<String>();
       veggies.add("cabbage");
       veggies.add("onions");
       veggies.add("tomatoes");

        System.out.println(veggies);

       ArrayList<String> drinks = new ArrayList<String>();
        drinks.add("coffee");
        drinks.add("tea");
        drinks.add("mineral water");
        drinks.add("coke");
        drinks.add("soda");

        System.out.println(drinks);

        ArrayList<String> grains = new ArrayList<String>();
         grains.add("wheat");
         grains.add("rice");

        System.out.println(grains);

         groceries.add(grains);
         groceries.add(bakelist);
         groceries.add(drinks);
         groceries.add(veggies);

        System.out.println(groceries);



    }
}
