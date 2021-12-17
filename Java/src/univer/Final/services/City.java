package univer.Final.services;

public class City {
    private String identification;
    private Country country;
    private String name;
    private int population;
    private boolean isCapital;

    public City(String identification, Country country, String name, int population, boolean isCapital) {
        this.identification = identification;
        this.country = country;
        this.name = name;
        this.population = population;
        this.isCapital = isCapital;
    }

    public String getIdentification() {
        return identification;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public boolean isCapital() {
        return isCapital;
    }

    public void setCapital(boolean capital) {
        isCapital = capital;
    }
}
