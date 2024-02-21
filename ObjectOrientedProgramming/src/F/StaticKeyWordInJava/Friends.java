package F.StaticKeyWordInJava;

// noOfFriends is an example of static variable --- it is common for all the instances of this class
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
