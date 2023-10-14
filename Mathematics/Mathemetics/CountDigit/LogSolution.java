package CountDigit;

public class LogSolution {
    static int countDigit(long n)
    {
        return (int)Math.floor(Math.log10(n) + 1);
    }

    /* Driver code */
    public static void main(String[] args)
    {
        long n = 345289467;
        System.out.print("Number of digits : "
                + countDigit(n));
    }
}
