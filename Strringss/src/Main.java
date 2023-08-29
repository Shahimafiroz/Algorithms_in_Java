// string is a reference data type that can store one or more characters.
// reference data types have access to some useful methods
// Strings are immutable :- once u have created a string in the memory u cannot  change anything in that

public class Main {
    public static void main(String[] args) {

        String naam = "        Shahima        ";

        // some usefull methoods
        String name = naam.trim();
       boolean equalornot = name.equals("Shahima"); // do the strings match
       int len = name.length();  // What is the length of the string
       char alphabetAtindex = name.charAt(6); // what character is present at the give index
       int indexOfchar = name.indexOf("m"); // at what index is a present in the string. remember index starts from 0
        boolean isTheStringEmpty = name.isEmpty(); // checks if the string value is empty
        String Touppercase = name.toUpperCase(); // Capital
        String ToLowercase = name.toLowerCase(); // small
        String TrimmingTheExtraSpace = naam.trim(); // trims the extra space in the begining and the end
        String replaceAParticularChar = name.replace("a","x");

       //outputs
        System.out.println(equalornot);
        System.out.println(len);
        System.out.println(alphabetAtindex);
        System.out.println(indexOfchar);
        System.out.println(isTheStringEmpty);
        System.out.println(Touppercase);
        System.out.println(ToLowercase);
        System.out.println(TrimmingTheExtraSpace);
        System.out.println(replaceAParticularChar);


    }
}