/*
n Java, the StringBuilder class is used to create and manipulate strings efficiently, especially when you
 need to make multiple modifications to a string. Unlike the String class, which represents immutable strings
 (strings that cannot be changed after they are created), StringBuilder allows you to modify the content of a
 string without creating a new object every time.
Here's how you can use the StringBuilder class in Java:

Creating a StringBuilder instance:
1. You can create a StringBuilder instance using its constructor:

StringBuilder sb = new StringBuilder();

 */

public class StringgBuilderr {
    public static void main(String[] args) {

        StringBuilder names = new StringBuilder("Shahima"); // names is a string with a type string builder
        // 1  display the char at index 8
        System.out.println("1 "+names.charAt(5));
        // 2 Set the char at index i = 6 (more accurately ---> replaces)
        names.setCharAt(6,'k'); //only char
        System.out.println("2 "+names);
        // 3 insert a chr at any given index
        names.insert(3 , 'w');
        System.out.println("3 "+names);
        // 4 delete the characters between start to End
        names.delete(3 , 4);
        System.out.println("4 "+names);
        // 5 append means to attach things in the end of the string
        names.append(" khan");
        System.out.println("5 "+names);
        // 6 print length
        names.length();
        System.out.println("6 "+names.length());

    }
}
