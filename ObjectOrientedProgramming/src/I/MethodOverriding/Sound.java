
//https://www.geeksforgeeks.org/overriding-in-java/

package I.MethodOverriding;

public class Sound {
    public static void main(String[] args) {

      Animal animal = new Animal();
      Cat cat = new Cat();
      animal.speak();
      cat.speak();

    }


}