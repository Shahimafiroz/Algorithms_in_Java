package K.Abstract_keyword;

public class Instantiate {
    public static void main(String[] args) {

        Cold littleCold = new Cold();
        Cold veryCold = new Cold();
        // howevr i cant instantiate Feeling , umcomment and try

       //        Feelings feelings = new Feeling(); // opps no .. this adds an extra layer of security

        littleCold.effects = "no effect";
        veryCold.effects = "Bad effect ";

        littleCold.feels();
        veryCold.feels();

    }
}
