package Less20_08_24;

import java.util.Scanner;

/** Создайте класс «Город». Необходимо хранить в полях класса:
 название города, название региона, название
 страны, количество жителей в городе, почтовый индекс
 города, телефонный код города. Реализуйте методы
 класса для ввода данных, вывода данных, реализуйте доступ
 к отдельным полям через методы класса. */

public class City {

    private String nameCity;
    private String nameRegion;
    private String nameCountry;
    private int postalCode;
    private String phoneCityCode;
    private int numberOfResidents;

    public City() {
    }
    public City(String nameCity) {
        this.nameCity = nameCity;
    }
    public City(String nameCity, String nameRegion, String nameCountry) {
        this(nameCity);
        this.nameRegion = nameRegion;
        this.nameCountry = nameCountry;
    }
    public City(String nameCity, String nameRegion, String nameCountry, int postalCode, String phoneCityCode, int numberOfResidents) {
        this(nameCity, nameRegion, nameCountry);
        this.postalCode = postalCode;
        this.phoneCityCode = phoneCityCode;
        this.numberOfResidents = numberOfResidents;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter city name: ");
        String cityName = scanner.nextLine();
        this.setNameCity(cityName);
        System.out.print("Enter region name: ");
        String regionName = scanner.nextLine();
        this.setNameRegion(regionName);
        System.out.print("Enter country name: ");
        String countryName = scanner.nextLine();
        this.setNameCountry(countryName);
        System.out.print("Enter postal code: ");
        int postalCode = scanner.nextInt();
        this.setPostalCode(postalCode);
        System.out.print("Enter phone city code: ");
        String phoneCityCode = scanner.nextLine();
        this.setPhoneCityCode(phoneCityCode);
        System.out.print("Enter number of residents: ");
        int numberOfResidents = scanner.nextInt();
        this.setNumberOfResidents(numberOfResidents);

        scanner.close();
    }

    public void print() {
        System.out.println(getNameCity() + ", " + getNameRegion() + " region. " + getNameCountry() + ".\n" +
        "Postal code: " + getPostalCode() + ". Phone city code: " + getPhoneCityCode() + ". Number of residents: " + getNumberOfResidents() + '\n');
    }

    public String getNameCity() {
        return nameCity;
    }

    public void setNameCity(String nameCity) {
        this.nameCity = nameCity;
    }

    public String getNameRegion() {
        return nameRegion;
    }

    public void setNameRegion(String nameRegion) {
        this.nameRegion = nameRegion;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhoneCityCode() {
        return phoneCityCode;
    }

    public void setPhoneCityCode(String phoneCityCode) {
        this.phoneCityCode = phoneCityCode;
    }

    public int getNumberOfResidents() {
        return numberOfResidents;
    }

    public void setNumberOfResidents(int numberOfResidents) {
        this.numberOfResidents = numberOfResidents;
    }
}
