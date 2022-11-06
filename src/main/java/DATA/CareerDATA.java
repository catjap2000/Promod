package DATA;

import com.github.javafaker.Faker;

public interface CareerDATA {
    Faker faker = new Faker();

    String

            CareerKeyWordInput = "tech",
            CareerLocationInput = "France",
            CareerJobTypeInput = " ",
            CareerFirstNameInput = Faker.instance().name().firstName(),
            CareerLastNameInput = Faker.instance().name().lastName(),
            CareerPhoneNumInput = Faker.instance().number().digits(11),
            CareerLogInEmailInput = Faker.instance().internet().emailAddress(),
            CareerLogInPassword = Faker.instance().number().digits(7);

}

