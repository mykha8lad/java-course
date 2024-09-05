package Less20_08_24.RandomResources;

import java.util.Random;

public class RandomResCountry {

    private static final Random random = new Random();

    private static final String[] COUNTRY_NAMES = {
            "USA", "Canada", "UK", "Germany", "France",
            "Italy", "Spain", "Australia", "Japan", "China"
    };

    private static final String[] CONTINENT_NAMES = {
            "North America", "Europe", "Asia", "South America", "Africa",
            "Oceania", "Antarctica"
    };

    private static final String[] PHONE_COUNTRY_CODES = {
            "+1", "+44", "+49", "+33", "+39",
            "+34", "+61", "+81", "+86", "+7"
    };

    private static final String[] CAPITAL_NAMES = {
            "Washington D.C.", "Ottawa", "London", "Berlin", "Paris",
            "Rome", "Madrid", "Canberra", "Tokyo", "Beijing"
    };

    private static final String[][] CITIES_NAMES = {
            {"New York", "Los Angeles", "Chicago"},
            {"Toronto", "Vancouver", "Montreal"},
            {"London", "Manchester", "Birmingham"},
            {"Berlin", "Munich", "Hamburg"},
            {"Paris", "Marseille", "Lyon"},
            {"Rome", "Milan", "Naples"},
            {"Madrid", "Barcelona", "Valencia"},
            {"Sydney", "Melbourne", "Brisbane"},
            {"Tokyo", "Osaka", "Nagoya"},
            {"Beijing", "Shanghai", "Guangzhou"}
    };

    private static final int[] NUMBER_OF_RESIDENTS = {
            331000000, 37700000, 67800000, 83000000, 67000000,
            59000000, 47000000, 25000000, 126000000, 1400000000
    };

    public static String getRandomCountryName() {
        return COUNTRY_NAMES[random.nextInt(COUNTRY_NAMES.length)];
    }

    public static String getRandomContinentName() {
        return CONTINENT_NAMES[random.nextInt(CONTINENT_NAMES.length)];
    }

    public static String getRandomPhoneCountryCode() {
        return PHONE_COUNTRY_CODES[random.nextInt(PHONE_COUNTRY_CODES.length)];
    }

    public static String getRandomCapitalName() {
        return CAPITAL_NAMES[random.nextInt(CAPITAL_NAMES.length)];
    }

    public static String[] getRandomCitiesNames() {
        return CITIES_NAMES[random.nextInt(CITIES_NAMES.length)];
    }

    public static int getRandomNumberOfResidents() {
        return NUMBER_OF_RESIDENTS[random.nextInt(NUMBER_OF_RESIDENTS.length)];
    }
}
