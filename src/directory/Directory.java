package directory;

public class Directory {
    public static final Country[] directory = new Country[3];

    static {
        directory[0] = new Country("Франция",
                67_000_000 ,
                "французский",
                "Евразия");
        directory[1] = new Country("Аргентина",
                47_000_000 ,
                "испанский",
                "Южная Америка");
        directory[2] = new Country("Италия",
                58_000_000 ,
                "итальянский",
                "Евразия");
    }

}
