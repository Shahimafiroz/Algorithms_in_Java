public class BlockScope {
    public static void main(String[] args) {
       int a =10 ;
        {
//          int a= 78; not possible as already initialized outside the block , hence cannot be initialized again
            a = 78; // but u can change ... but this change is  valid outside this block
            int c = 99; // you can initialize a new value in this block but this value cannot be used outside of this block

        }
        System.out.println(a);

//        System.out.println(c); see this gives error because we cannot use c outside of the block



    }
}
