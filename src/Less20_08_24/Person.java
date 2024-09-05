package Less20_08_24;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/** Реализуйте класс «Человек». Необходимо хранить
 в полях класса: ФИО, дату рождения, контактный телефон,
 город, страну, домашний адрес. Реализуйте методы
 класса для ввода данных, вывода данных, реализуйте
 доступ к отдельным полям через методы класса */

public class Person {

    private String name;
    private String surname;
    private String patronymicName;
    private LocalDate birthDate;
    private String phoneNumber;
    private City nameCity;
    private Country nameCountry;
    private String address;

    public Person() {
    }
    public Person(String name, String surname, String patronymicName) {
        this.name = name;
        this.surname = surname;
        this.patronymicName = patronymicName;
    }
    public Person(String name, String surname, String patronymicName, int year, int month, int day, String phoneNumber, String nameCity, String nameCountry, String address) {
        this(name, surname, patronymicName);
        this.birthDate = LocalDate.of(year, month, day);
        this.phoneNumber = phoneNumber;
        this.nameCity = new City(nameCity);
        this.nameCountry = new Country(nameCountry);
        this.address = address;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("NAME");
        System.out.print("Enter surname: ");
        String surname = scanner.nextLine();
        this.setSurname(surname);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        this.setName(name);
        System.out.print("Enter patronymic name: ");
        String patronymic = scanner.nextLine();
        this.setPatronymicName(patronymic);
        System.out.println("DATE");
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        System.out.print("Enter month: ");
        int month = scanner.nextInt();
        System.out.print("Enter day: ");
        int day = scanner.nextInt();
        this.setBirthDate(year, month, day);
        System.out.println("PHONE NUMBER");
        String phoneNumber = scanner.nextLine();
        this.setPhoneNumber(phoneNumber);
        System.out.println("ADDRESS");
        System.out.print("Enter city: ");
        String city = scanner.nextLine();
        this.setNameCity(city);
        System.out.print("Enter country: ");
        String country = scanner.nextLine();
        this.setNameCountry(country);
        System.out.print("Enter street: ");
        String address = scanner.nextLine();
        this.setAddress(address);

        scanner.close();
    }

    public void print() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println(getSurname() + ' ' + getName() + ' ' + getPatronymicName() + '\n'
        + getBirthDate().format(formatter) + '\n' + getNameCountry() + ", " + getNameCity() + ", " + getAddress() + '\n' + getPhoneNumber() + '\n');
    }

    public String toString() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

        return getSurname() + ' ' + getName() + ' ' + getPatronymicName() + '\n'
                + formatter.format(getBirthDate()) + '\n' + getNameCountry() + ", "
                + getNameCity() + ", " + getAddress() + '\n' + getPhoneNumber() + '\n';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymicName() {
        return patronymicName;
    }

    public void setPatronymicName(String patronymicName) {
        this.patronymicName = patronymicName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int year, int month, int day) {
        this.birthDate = LocalDate.of(year, month, day);
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNameCity() {
        return this.nameCity.getNameCity();
    }

    public void setNameCity(String nameCity) {
        this.nameCity = new City(nameCity);
    }

    public String getNameCountry() {
        return this.nameCountry.getNameCountry();
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = new Country(nameCountry);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
