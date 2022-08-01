package PromodTEST;

import STEPS.CareerSteps;
import UTILS.ChromeRunner;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static DATA.CareerDATA.*;

@Listeners(UTILS.TestListener.class)
public class CareerTest extends ChromeRunner {
    @Test
    @Description ("Go to Career page, using filter (location, job type & category) choose 1 Job Announcement and Apply")
    public void CareerPgPromod() throws InterruptedException {
        CareerSteps Career_Steps = new CareerSteps();

        Career_Steps
                .openUrl();

        Career_Steps
//                .CookiesMainPg()
                .GoCareerPage()
                .CareerAcceptCookies()
                .OurJobOffer()
                .KeyWordInput(CareerKeyWordInput);
        Thread.sleep(2000);

        Career_Steps
                .LocationInput(CareerLocationInput);
        Thread.sleep(1000);

        Career_Steps
                .JobTypeInput(CareerJobTypeInput);

        Career_Steps
                .CategoryInput();
        Thread.sleep(2000);

        Career_Steps
                .SearchButton()
                .ChooseJA()
                .ApplyButton();
        Thread.sleep(2000);

        Career_Steps
                .FirstNameInput(CareerFirstNameInput)
                .LastNameInput(CareerLastNameInput)
                .EmailInput(CareerLogInEmailInput)
                .PasswordInput(CareerLogInPassword)
                .PhoneNumberInput()
                .Terms()
                .SignUp();
    }
}

