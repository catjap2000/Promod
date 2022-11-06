package DATA;

import com.github.javafaker.Faker;

public interface RegistrationDATA {
    Faker faker = new Faker();

    String
            MainLogInEmail = Faker.instance().internet().emailAddress(),
            MainPasswordInp = "@caTErina798j0",
            MainFamilyNm = Faker.instance().name().lastName(),
            MainFirstNm = Faker.instance().name().firstName(),
            MainPhoneNum = "4" + Faker.instance().number().digits(10),
            MainDateOfBirth = String.valueOf(Faker.instance().date().birthday(20, 80));


}
