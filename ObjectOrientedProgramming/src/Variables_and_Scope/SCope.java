package Variables_and_Scope;

import java.util.Random;

public class SCope {
    Random random;
    int number ;

    SCope(){
        random = new Random();
        roll(random,number);


    }

    void roll(Random random , int number){
        number = random.nextInt(6)+1;
        System.out.println(number);
    }

}
