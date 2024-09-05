package Less20_08_24.FactoryClasses;


import Less20_08_24.Person;
import Less20_08_24.RandomResources.RandomResPerson;

public class PersonFactory {
    public static Person getPerson() {
        Person person = new Person();

        person.setName(RandomResPerson.getRandomName());
        person.setSurname(RandomResPerson.getRandomSurname());
        person.setPatronymicName(RandomResPerson.getRandomPatronymicName());
        person.setBirthDate(RandomResPerson.getRandomBirthDate().getYear(), RandomResPerson.getRandomBirthDate().getMonth(), RandomResPerson.getRandomBirthDate().getDay());
        person.setPhoneNumber(RandomResPerson.getRandomPhoneNumber());
        person.setNameCity(RandomResPerson.getRandomCity().getNameCity());
        person.setNameCountry(RandomResPerson.getRandomCountry().getNameCountry());
        person.setAddress(RandomResPerson.getRandomAddress());

        return person;
    }
}
