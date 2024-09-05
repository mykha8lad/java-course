package Less20_08_24.FactoryClasses;

import Less20_08_24.City;
import Less20_08_24.RandomResources.RandomResCity;

public class CityFactory {
    public static City getCity() {
        City city = new City();

        city.setNameCity(RandomResCity.getRandomCityName());
        city.setNameRegion(RandomResCity.getRandomRegionName());
        city.setNameCountry(RandomResCity.getRandomCountryName());
        city.setPostalCode(RandomResCity.getRandomPostalCode());
        city.setPhoneCityCode(RandomResCity.getRandomPhoneCityCode());
        city.setNumberOfResidents(RandomResCity.getRandomNumberOfResidents());

        return city;
    }
}
