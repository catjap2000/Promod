package PromodTEST;

import STEPS.CareerSteps;
import UTILS.ChromeRunner;
import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static DATA.CareerDATA.*;

@Listeners(Other.Listeners.class)
public class CareerTest extends ChromeRunner {
    @Test
    @Attachment
    @Severity(SeverityLevel.NORMAL)
    @Description ("Go to Career page, using filter (location, job type & category) choose 1 Job Announcement, fill credentials and Apply.")
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

