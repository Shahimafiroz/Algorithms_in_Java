import java.lang.reflect.Array;
import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        // creating an array
        int[] arr = {1, 2, 3, 4,5, 6, 7};
        change (arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void change (int[] nums) {
           nums[0]=99;
    }



}
