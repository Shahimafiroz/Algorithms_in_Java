package F.StaticKeyWordInJava;

public class Friends {

    String name ;
   static int noOfFriends;

    Friends( String name){
        this.name = name;
        noOfFriends++;
    }

     void displayFriends(){
        System.out.println(name + " has " +noOfFriends+ " friends");
    }

}
