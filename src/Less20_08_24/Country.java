package Less20_08_24;

import java.util.Arrays;
import java.util.Scanner;

/** Создайте класс «Страна». Необходимо хранить в полях
 класса: название страны, название континента,
 количество жителей в стране, телефонный код страны, название
 столицы, название городов страны. Реализуйте методы
 класса для ввода данных, вывода данных, реализуйте
 доступ к отдельным полям через методы класса. */

public class Country {

    private String nameCountry;
    private String nameContinent;
    private String phoneCountryCode;
    private String nameCapital;
    private String[] citiesNames;
    private int numberOfResidents;

    public Country() {
    }
    public Country(String nameCountry) {
        this.nameCountry = nameCountry;
    }
    public Country(String nameCountry, String nameContinent) {
        this(nameCountry);
        this.nameContinent = nameContinent;
    }
    public Country(String nameCountry, String nameContinent, String phoneCountryCode, String nameCapital, String[] citiesNames, int numberOfResidents) {
        this(nameCountry, nameContinent);
        this.phoneCountryCode = phoneCountryCode;
        this.nameCapital = nameCapital;
        this.citiesNames = Arrays.copyOf(citiesNames, citiesNames.length);
        this.numberOfResidents = numberOfResidents;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter country name: ");
        String countryName = scanner.nextLine();
        this.setNameCountry(countryName);
        System.out.print("Enter continent name: ");
        String continentName = scanner.nextLine();
        this.setNameContinent(continentName);
        System.out.print("Enter phone country code: ");
        String phoneCountryCode = scanner.nextLine();
        this.setPhoneCountryCode(phoneCountryCode);
        System.out.print("Enter capital name: ");
        String capitalName = scanner.nextLine();
        this.setNameCapital(capitalName);
        System.out.print("How many cities can you remember to list? ");
        int countCities = scanner.nextInt();
        citiesNames = new String[countCities];
        for(int i = 0; i < countCities; i++) {
            citiesNames[i] = scanner.nextLine();
            i++;
        }
        System.out.print("Enter number of residents: ");
        int numberOfResidents = scanner.nextInt();
        this.setNumberOfResidents(numberOfResidents);

        scanner.close();
    }

    public void print() {
        System.out.println(getNameContinent() + ", " + getNameCountry() + '\n' + "Phone city code: " + getPhoneCountryCode() + ". Number of residents: " + getNumberOfResidents() + ". Capital: " + getNameCapital());
        System.out.println("Cities: ");
        for(String city : citiesNames) {
            System.out.println(city);
        }
        System.out.println();
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    public String getNameContinent() {
        return nameContinent;
    }

    public void setNameContinent(String nameContinent) {
        this.nameContinent = nameContinent;
    }

    public String getPhoneCountryCode() {
        return phoneCountryCode;
    }

    public void setPhoneCountryCode(String phoneCountryCode) {
        this.phoneCountryCode = phoneCountryCode;
    }

    public String getNameCapital() {
        return nameCapital;
    }

    public void setNameCapital(String nameCapital) {
        this.nameCapital = nameCapital;
    }

    public String[] getCitiesNames() {
        return citiesNames;
    }

    public void setCitiesNames(String[] citiesNames) {
        this.citiesNames = citiesNames;
    }

    public int getNumberOfResidents() {
        return numberOfResidents;
    }

    public void setNumberOfResidents(int numberOfResidents) {
        this.numberOfResidents = numberOfResidents;
    }
}
