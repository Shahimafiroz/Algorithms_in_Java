
/*
Sometimes in programming, it is essential to print the output in a given specified format.
 Most users are familiar with the printf function in C. Let us discuss
 Formatting Output with printf() in Java in this article.

    printf() = 	an optional method to control, format, and display text to the console window
					two arguments = format string + (object/variable/value)
				***** VVIP	% [flags] [precision] [width] [conversion-character]




 */

package C.Methods_MethodOverloading;

public class Printf_explained {
    public static void main(String[] args) {
        /*conversion charecter

         * b: Boolean value.
         * B: Boolean value, uppercase.
         * c: Unicode character.
         * C: Unicode character, force uppercase.
         * d: Decimal integer.
         * f: Floating-point number.
         * h: Hashcode.
         * n: Newline character, platform specific.
         * s: String.
         * S: String, force uppercase.
         * t: Time/date formatting.
         */

        boolean mybool = true;
        int myint = 4;
        float myflow = 23.45443f;
        double mydubi = 123.344553219879;
        char mych = '@';
        String myst = "khanshahima";
        //////////////////extars ////////////
        String gmail ="gmail";
        String com = "com";
        char dot = '.';
//
//        System.out.printf(" %b " , mybool);
//        System.out.printf(" %d " , myint);
////        System.out.printf("%d" , myflow);  -----> this will give error
//        System.out.printf(" %f " , myflow);
////        System.out.printf("%d" , mydubi); --------> this also gives error
//        System.out.printf(" %f " , mydubi);
//        System.out.printf(" %c " , mych);
//        System.out.printf(" %s%n " , myst);
//        System.out.printf("%s%d%c%s%c%s%n"     ,myst,myint,mych,gmail,dot,com );
//
//
//
//        /*
//       [ width] - minimum number of characters to be written as output
//           example :-
//         */
//        System.out.printf("Hello%30s%n" , myst);

        /*
        [Precision] -sets number of digits of precision when outputting floating-point values
        .1 - one digit
        .2 - two digit
        .3 - three digit
         */
//        System.out.printf("%.20f" ,  mydubi);

        /*
        [Flags]-
         */

        System.out.printf("You have this much money %,f",mydubi);






    }
}
