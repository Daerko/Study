package univer.Final.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Country {
    private String identification;
    private String name;
    private List<City> cities;

    public Country(String identification, String name) {
        this.identification = identification;
        this.name = name;
        cities = new ArrayList<>();
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    public boolean addCity(City city) {
        if (!cityHaveUniqueId(city.getIdentification())) {
            return false;
        }
        city.setCountry(this);
        cities.add(city);
        return true;
    }

    public boolean cityHaveUniqueId(String identification) {
        for (var city : cities) {
            if (Objects.equals(city.getIdentification(), identification)) {
                return false;
            }
        }
        return true;
    }

    public boolean deleteCity(String identification) {
        return cities.remove(findCity(identification));
    }

    public City findCity(String identification) {
        for (City city : cities) {
            if (Objects.equals(city.getIdentification(), identification)) {
                return city;
            }
        }
        return null;
    }

    public boolean changeCity(String identification, String name, int population, boolean isCapital){
        var oldCity = findCity(identification);
        if(oldCity == null){
            return false;
        }
        oldCity.setName(name);
        oldCity.setPopulation(population);
        oldCity.setCapital(isCapital);
        return true;
    }
}
