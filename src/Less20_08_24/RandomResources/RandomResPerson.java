package Less20_08_24.RandomResources;

import Less20_08_24.City;
import Less20_08_24.Country;

import java.util.Date;
import java.util.Random;

public class RandomResPerson {

    private static final Random random = new Random();

    private static final String[] NAMES = {
            "John", "Alice", "Michael", "Emma", "David",
            "Olivia", "James", "Sophia", "Daniel", "Mia"
    };

    private static final String[] SURNAMES = {
            "Smith", "Johnson", "Williams", "Jones", "Brown",
            "Davis", "Miller", "Wilson", "Moore", "Taylor"
    };

    private static final String[] PATRONYMIC_NAMES = {
            "Ivanovich", "Petrovich", "Alexandrovich", "Sergeevich", "Mikhailovich",
            "Vladimirovich", "Nikolayevich", "Yurievich", "Andreevich", "Dmitrievich"
    };

    private static final Date[] BIRTH_DATES = {
            new Date(1990, 1, 1), new Date(1991, 2, 2), new Date(1992, 3, 3),
            new Date(1993, 4, 4), new Date(1994, 5, 5), new Date(1995, 6, 6),
            new Date(1996, 7, 7), new Date(1997, 8, 8), new Date(1998, 9, 9),
            new Date(1999, 10, 10)
    };

    private static final String[] PHONE_NUMBERS = {
            "+1234567890", "+2345678901", "+3456789012", "+4567890123", "+5678901234",
            "+6789012345", "+7890123456", "+8901234567", "+9012345678", "+0123456789"
    };

    private static final City[] CITIES = {
            new City("New York"), new City("Los Angeles"), new City("Chicago"),
            new City("Houston"), new City("Phoenix"), new City("Philadelphia"),
            new City("San Antonio"), new City("San Diego"), new City("Dallas"),
            new City("San Jose")
    };

    private static final Country[] COUNTRIES = {
            new Country("USA"), new Country("Canada"), new Country("UK"),
            new Country("Germany"), new Country("France"), new Country("Italy"),
            new Country("Spain"), new Country("Australia"), new Country("Japan"),
            new Country("China")
    };

    private static final String[] ADDRESSES = {
            "123 Main St", "456 Elm St", "789 Maple Ave", "101 Oak St", "202 Pine Rd",
            "303 Birch Dr", "404 Cedar St", "505 Spruce St", "606 Walnut St", "707 Cherry Ln"
    };

    public static String getRandomName() {
        return NAMES[random.nextInt(NAMES.length)];
    }

    public static String getRandomSurname() {
        return SURNAMES[random.nextInt(SURNAMES.length)];
    }

    public static String getRandomPatronymicName() {
        return PATRONYMIC_NAMES[random.nextInt(PATRONYMIC_NAMES.length)];
    }

    public static Date getRandomBirthDate() {
        return BIRTH_DATES[random.nextInt(BIRTH_DATES.length)];
    }

    public static String getRandomPhoneNumber() {
        return PHONE_NUMBERS[random.nextInt(PHONE_NUMBERS.length)];
    }

    public static City getRandomCity() {
        return CITIES[random.nextInt(CITIES.length)];
    }

    public static Country getRandomCountry() {
        return COUNTRIES[random.nextInt(COUNTRIES.length)];
    }

    public static String getRandomAddress() {
        return ADDRESSES[random.nextInt(ADDRESSES.length)];
    }
}
