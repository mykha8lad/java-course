package Less20_08_24.FactoryClasses;

import Less20_08_24.Country;
import Less20_08_24.RandomResources.RandomResCountry;

public class CountryFactory {
    public static Country getCountry() {
        Country country = new Country();

        country.setNameCountry(RandomResCountry.getRandomCountryName());
        country.setNameContinent(RandomResCountry.getRandomContinentName());
        country.setPhoneCountryCode(RandomResCountry.getRandomPhoneCountryCode());
        country.setNameCapital(RandomResCountry.getRandomCapitalName());
        country.setCitiesNames(RandomResCountry.getRandomCitiesNames());
        country.setNumberOfResidents(RandomResCountry.getRandomNumberOfResidents());

        return country;
    }
}
