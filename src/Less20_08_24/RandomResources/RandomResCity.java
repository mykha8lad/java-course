package Less20_08_24.RandomResources;

import java.util.Random;

public class RandomResCity {

    private static final Random random = new Random();

    private static final String[] CITY_NAMES = {
            "New York", "Los Angeles", "Chicago", "Houston", "Phoenix",
            "Philadelphia", "San Antonio", "San Diego", "Dallas", "San Jose"
    };

    private static final String[] REGION_NAMES = {
            "California", "Texas", "Florida", "New York", "Illinois",
            "Pennsylvania", "Arizona", "Ohio", "Georgia", "North Carolina"
    };

    private static final String[] COUNTRY_NAMES = {
            "USA", "Canada", "UK", "Germany", "France",
            "Italy", "Spain", "Australia", "Japan", "China"
    };

    private static final int[] POSTAL_CODES = {
            10001, 90001, 60601, 77001, 85001,
            19101, 78201, 92101, 75201, 95101
    };

    private static final String[] PHONE_CITY_CODES = {
            "212", "213", "312", "713", "602",
            "215", "210", "619", "214", "408"
    };

    private static final int[] NUMBER_OF_RESIDENTS = {
            8419600, 3980400, 2716000, 2328000, 1690000,
            1584200, 1547200, 1423800, 1341000, 1035300
    };

    public static String getRandomCityName() {
        return CITY_NAMES[random.nextInt(CITY_NAMES.length)];
    }

    public static String getRandomRegionName() {
        return REGION_NAMES[random.nextInt(REGION_NAMES.length)];
    }

    public static String getRandomCountryName() {
        return COUNTRY_NAMES[random.nextInt(COUNTRY_NAMES.length)];
    }

    public static int getRandomPostalCode() {
        return POSTAL_CODES[random.nextInt(POSTAL_CODES.length)];
    }

    public static String getRandomPhoneCityCode() {
        return PHONE_CITY_CODES[random.nextInt(PHONE_CITY_CODES.length)];
    }

    public static int getRandomNumberOfResidents() {
        return NUMBER_OF_RESIDENTS[random.nextInt(NUMBER_OF_RESIDENTS.length)];
    }
}
