package PromodTEST;

import STEPS.RegistrationSteps;
import UTILS.ChromeRunner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;

import static DATA.RegistrationDATA.*;

@Listeners(UTILS.TestListener.class)
public class RegistrationTest extends ChromeRunner {

        @Test
        @Description("Registering new account on Promod.com")
        public void RegPgProm() throws InterruptedException {
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
                    .MainCredentialsDate(MainDateOfBirth)
                    .MainCredentialsPhone(MainPhoneNum)
                    .ContinueBut();
        }
    }

