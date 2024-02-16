package I.MethodOverriding;

public class Cat extends Animal{
    String name;

    @Override
    void speak (){
        System.out.println("The cat is meow meow ..");
    }
}
