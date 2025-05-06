package OOP.lesson7.inheritance.lesson9.Task2;

public class Country {
    private String country;
    private long population;
    private String language;
    private String continent;

    public Country(String country, int population, String language, String continent) {
        this.country = country;
        this.population = population;
        this.language = language;
        this.continent = continent;
    }

    public String getCountry() {
        return country;
    }

    public String getLanguage() {
        return language;
    }

    public long getPopulation() {
        return population;
    }

    public String getContinent() {
        return continent;
    }
}
