import java.util.Scanner;

public class Problem1_AplhabetCaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);
        if( ch >= 'a' && ch <= 'z'){
            System.out.println("lower case");
        }else {
            System.out.println("Upper case");
        }
        System.out.println(ch);
    }
}


/*
input.next().trim() ---> removes extra space from the begnning
charAt(i) -----> give me the character at index "i" of the string
 */