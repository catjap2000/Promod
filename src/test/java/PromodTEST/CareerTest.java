package PromodTEST;

import STEPS.CareerSteps;
import UTILS.ChromeRunner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static DATA.CareerDATA.*;

@Listeners(Other.Listeners.class)
public class CareerTest extends ChromeRunner {
    @Test
    @Description ("Go to Career page, using filter (location, job type & category) choose 1 Job Announcement, fill credentials and Apply.")
    @Attachment(fileExtension = "png")
    @Severity(SeverityLevel.NORMAL)

    public void CareerPgPromod() throws InterruptedException {
        SoftAssert softAll = new SoftAssert();
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
        Assert.assertTrue(Career_Steps.CareerLocation.is(Condition.not(Condition.empty)));

        Career_Steps
                .JobTypeInput(CareerJobTypeInput);
        Assert.assertTrue(Career_Steps.CareerJobType.is(Condition.empty));

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

        softAll.assertAll();

    }

}

