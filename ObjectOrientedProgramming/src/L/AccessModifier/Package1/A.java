package L.AccessModifier.Package1;
import L.AccessModifier.Package2.*;
public class A {
    public static void main(String[] args) {

        C c = new C();
//        System.out.println(c.defaultmessgae);
        System.out.println(c.publicmessgae); //public  = visible to any package witin the project folder

    }
}
