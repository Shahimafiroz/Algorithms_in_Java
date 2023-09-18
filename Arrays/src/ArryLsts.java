
// Array List :- A resizable array (dynamic array)
//elements can be added and removed after the compilation phase
//stores only reference data types
// for array we use .length methood but for array lists we use .size mwthod
import java.util.ArrayList;
public class ArryLsts {
    public static void main(String[] args) {
        ArrayList<String> foood = new ArrayList<>();

        foood.add("Pizza");
        foood.add("Pasta");
        foood.add("burger");
        foood.add("mac");
        foood.add("Ramen");

        // some useful methods of array

        foood.set(4 , "Sushi");
        foood.set(3 , "candy");
        foood.remove(3);


        for(int i = 0 ; i<foood.size(); i++){ // for Array we use .length method but for ArrayLists we use .size method
            System.out.println(foood.get(i));
        }

        foood.clear(); // clears out array lists



    }
}
