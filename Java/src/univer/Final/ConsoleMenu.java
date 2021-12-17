package univer.Final;

import univer.Final.services.City;
import univer.Final.services.Country;
import univer.Final.services.Service;
import univer.Final.services.View;

import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class ConsoleMenu {
    public static void main(String[] args) throws IOException {
        ConsoleMenu consoleMenu = new ConsoleMenu();
        consoleMenu.start();
    }

    Service service;

    public void start() throws IOException {
        service = new Service();
        boolean isRunning = true;

        while (isRunning) {
            meinMenu();
            String command = new Scanner(System.in).nextLine();
            switch (command) {
                case "1" -> showCountries();
                case "2" -> choiceCountry();
                case "3" -> addCountry();
                case "4" -> deleteCountry();
                case "5" -> changeCountryName();
                case "6" -> search();
                case "7" -> isRunning = false;
                default -> showError("Invalid command");
            }
        }
        service.saveDataBase();
    }

    private void meinMenu() {

        View.print("\033[1;33m");
        View.print("                             Choose your option");
        View.print("-----------------------------------------------------------------------------");
        View.print("1.Show countries        |2.Choose country   |3.Add country  |4.Delete country");
        View.print("5.Change country name   |6.Search           |7.Exit");

        View.print("\033[1;33m");
    }

    private void showError(String message) {
        View.print("\033[1;31m");
        View.print(message);
        View.print("\033[1;33m");
    }

    private void showCountries() {
        var countries = service.getCountries();
        if (countries.isEmpty()) {
            showError("Empty");
            return;
        }
        View.print("Countries:");
        for (var country : countries) {
            View.print("[" + country.getIdentification() + "] " + country.getName());
        }
    }

    private String getName(boolean skip) {
        while (true) {
            View.print("Write name:");
            String name = new Scanner(System.in).nextLine();
            if (name.matches("[a-zA-Z-]+")) {
                return name;
            } else if ("".equals(name) && skip) {
                return name;
            } else {
                showError("Name is not format");

            }
        }
    }

    private String getIdentification() {
        while (true) {
            View.print("Write identification:");
            String identification = new Scanner(System.in).nextLine();
            if (identification.matches("[0-9]+")) {
                return identification;
            } else {
                showError("Incorrect name");

            }
        }
    }

    private void addCountry() {
        if (service.addCountry(new Country(getIdentification(), getName(false)))) {
            View.print("Country added successfully");
        } else {
            View.print("Can`t add country");
        }
    }

    private void deleteCountry() {
        if (service.deleteCountry(getIdentification())) {
            View.print("Country deleted successfully");
        } else {
            View.print("Can`t found the country");
        }
    }

    private void changeCountryName() {
        var country = service.findCountry(getIdentification());
        if (country == null) {
            showError("Country not found");
            return;
        }

        View.print("[" + country.getIdentification() + "] " + country.getName());
        String name = getName(true);
        if (name.equals("")) {
            View.print("Country don't changed");
        } else {
            country.setName(name);
            View.print("Country name changed successfully");
        }
    }

    private void search() {
        String identification = getIdentification();

        if (service.objectHaveUniqueId(identification)) {
            showError("Not found");
            return;
        }

        var country = service.findCountry(identification);
        if (country != null) {
            View.print("Country:\n[" + country.getIdentification() + "] " + country.getName());
        } else {
            var city = service.findCity(identification);
            View.print("City:\n[" + city.getIdentification() + "] " + city.getName());
        }
    }

    private void choiceCountry() {
        showCountries();
        String identification = getIdentification();
        var country = service.findCountry(identification);
        if (country == null) {
            showError("Not Found");
        } else {
            country(country);
        }
    }

    private void country(Country country) {
        boolean isRunning = true;
        while (isRunning) {
            countryMenu();
            String command = new Scanner(System.in).nextLine();
            switch (command) {
                case "1" -> showCities(country);
                case "2" -> addCity(country);
                case "3" -> deleteCity(country);
                case "4" -> changeCityInfo(country);
                case "5" -> showCountryInfo(country);
                case "6" -> isRunning = false;
                default -> showError("Invalid command");
            }
        }
    }

    private void countryMenu() {

        View.print("\033[1;33m");
        View.print("                     Choose your option");
        View.print("----------------------------------------------------------");
        View.print("1.Show Cities       |2.Add City             |3.Delete City");
        View.print("4.Change city info  |5.Show country info    |6.Back");
        View.print("\033[1;33m");
    }

    private void showCities(Country country) {
        if (country.getCities().isEmpty()) {
            showError("Empty");
            return;
        }

        for (var city : country.getCities()) {
            View.print("[" + city.getIdentification() + "] " + city.getName()
                    + " Population: " + city.getPopulation()
                    + " Capital: " + city.isCapital());
        }
    }

    private int getPopulation(boolean skip) {
        while (true) {
            View.print("Write population:");
            String populationString = new Scanner(System.in).nextLine();
            if (populationString.matches("[1-9]+[0-9]*")) {
                return Integer.parseInt(populationString);
            } else if (populationString.equals("") && skip) {
                return 0;
            } else {
                showError("Incorrect population");

            }
        }
    }

    private boolean getIsCapital() {
        while (true) {
            View.print("Write is Capital (y/n):");
            String isCapital = new Scanner(System.in).nextLine();
            if (Objects.equals(isCapital, "y")) {
                return true;
            } else if (Objects.equals(isCapital, "n")) {
                return false;
            } else {
                showError("Incorrect capital format");

            }
        }
    }

    private void addCity(Country country) {
        var identification = getIdentification();
        if (!service.objectHaveUniqueId(identification)) {
            showError("Invalid identification");
            return;
        }

        country.addCity(new City(identification, null, getName(false), getPopulation(false), getIsCapital()));
        View.print("City added successfully");
    }

    private void deleteCity(Country country) {
        var identification = getIdentification();
        if (country.deleteCity(identification)) {
            View.print("City deleted successfully");
        } else {
            View.print("Can`t delete city");
        }
    }

    private void changeCityInfo(Country country) {
        var city = country.findCity(getIdentification());
        if (city == null) {
            showError("Not found");
            return;
        }
        var name = getName(true);
        if (!name.equals("")) {
            city.setName(name);
        }
        else {
            View.print("Use default value");
        }
        var population = getPopulation(true);
        if(population != 0){
            city.setPopulation(population);
        }
        else{
            View.print("Use default value");
        }
        city.setCapital(getIsCapital());
    }

    private void showCountryInfo(Country country){
        View.print("[" + country.getIdentification() + "] " + country.getName());
    }

}
