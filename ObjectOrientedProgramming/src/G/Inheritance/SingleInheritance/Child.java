package G.Inheritance.SingleInheritance;

public class Child extends Firoz {
    String name;


    Child(String name){
      this.name = name;
    }

    void displayQuality(){
        System.out.println(name+ " is very");
    }

}
