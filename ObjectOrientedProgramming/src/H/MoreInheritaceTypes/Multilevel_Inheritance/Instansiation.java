package H.MoreInheritaceTypes.Multilevel_Inheritance;

public class Instansiation {
    public static void main(String[] args) {
       Daughter shark =  new Daughter();

        System.out.println(shark.name);
        System.out.println(shark.primeQuality);
        System.out.println(shark.Quality);
        shark.Schooling();
        shark.Car();
        shark.Farms();
        shark.HouseS();

    }
}
