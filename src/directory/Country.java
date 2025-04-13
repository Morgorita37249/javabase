package directory;

public class Country {
    private String name = "";
    private int population = 0;
    private String language = "";
    private String continent = "";

    public Country(String name, int population, String language, String continent){
        this.name = name;
        this.population = population;
        this.language = language;
        this.continent = continent;
    }
    public int getPopulation() {
        return population;
    }

    public String getLanguage() {
        return language;
    }

    public String getName() {
        return name;
    }

    public String getContinent() {
        return continent;
    }
}
