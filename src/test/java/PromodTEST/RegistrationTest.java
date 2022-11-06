package PromodTEST;

import STEPS.RegistrationSteps;
import UTILS.ChromeRunner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.*;
import org.junit.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import org.testng.asserts.SoftAssert;

import static DATA.RegistrationDATA.*;

@Listeners(Other.Listeners.class)
public class RegistrationTest extends ChromeRunner {

        @Test
        @Description("Registering new account on Promod.com")
        @Attachment(fileExtension = "png")
        @Severity(SeverityLevel.CRITICAL)

        public void RegPgProm() throws InterruptedException {
            SoftAssert softAll = new SoftAssert();
            RegistrationSteps Reg_Steps = new RegistrationSteps();

            Reg_Steps
                    .openUrl();

            Reg_Steps
                    .Cookies()
                    .GoToAccountPage()
                    .mail(MainLogInEmail);
            Assert.assertTrue(Reg_Steps.MainEmailInput.is(Condition.not(Condition.empty)));

            Reg_Steps
                    .MainPassword(MainPasswordInp);
            Assert.assertTrue(Reg_Steps.MainPasswordInput.is(Condition.not(Condition.empty)));

            Reg_Steps
                    .NewsletterCheckBox()
                    .AccButton();
            Thread.sleep(1000);

            Reg_Steps
                    .MainCredentialsName(MainFamilyNm)
                    .MainCredentialsFirstName(MainFirstNm)
                    .MainCredentialsDate(MainDateOfBirth);
//            Assert.assertTrue(Reg_Steps.MainDateOfBirthInput.is(Condition.value(String.valueOf(Date.from(Instant.ofEpochSecond(1900))))));

            Reg_Steps
                    .MainCredentialsPhone(MainPhoneNum)
                    .ContinueBut();


            softAll.assertAll();

        }
        }




