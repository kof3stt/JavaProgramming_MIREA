// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class SeasonsTest {
    public static void main(String[] args) {
        Seasons favourite = Seasons.SUMMER;
        System.out.println(favourite);
        print(favourite);
        printAll();
        System.out.println(favourite.getDescription());
    }

    public static void print(Seasons season) {
        switch (season) {
            case WINTER -> {
                System.out.println("Я люблю зиму");
            }
            case SPRING -> {
                System.out.println("Я люблю весну");
            }
            case SUMMER -> {
                System.out.println("Я люблю лето");
            }
            case AUTUMN -> {
                System.out.println("Я люблю осень");
            }
        }
    }

    public static void printAll(){
        for (Seasons season: Seasons.values() )
        {
            System.out.println(season+" "+season.getTemperature());
        }
    }
}

