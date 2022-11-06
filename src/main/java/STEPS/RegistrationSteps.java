package STEPS;

import PAGE.RegistrationPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.*;

import static DATA.RegistrationDATA.*;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class RegistrationSteps extends RegistrationPage {


    @Step ("Open Account Page")
    @Severity(SeverityLevel.CRITICAL)
    @Attachment(fileExtension = "png")
    public void openUrl(){
        open ("https://auth2.promod.com/en/?redirect_uri=www.promod.com%2Fen%2Fauth%2Fcallback%2F");
    }
    @Step ("Accepting Cookies Button")
    @Severity(SeverityLevel.MINOR)
    @Attachment(fileExtension = "png")
    public RegistrationSteps Cookies(){
        AcceptCookies.click();
        sleep(1000);
        return this;
    }

    @Step ("Clicking on Registration button")
    @Severity(SeverityLevel.NORMAL)
    @Attachment(fileExtension = "png")
    public RegistrationSteps GoToAccountPage() {
        MainGoToCreateAccPg.click();
        return this;
    }
    @Step ("Filling email address, Value: {0}")
    @Severity(SeverityLevel.NORMAL)
    @Attachment(fileExtension = "png")
    public RegistrationSteps mail (String mainLogInEmail) {
        MainEmailInput.setValue(MainLogInEmail).shouldNotBe(Condition.empty);
        return this;
    }
    @Step ("Filling Password, Value: {0}")
    @Severity(SeverityLevel.NORMAL)
    @Attachment(fileExtension = "png")
    public void MainPassword (String mainPasswordInp){
        MainPasswordInput.setValue(MainPasswordInp).click();
    }

    @Step ("Selecting the Newsletter Checkbox")
    @Attachment(fileExtension = "png")
    @Severity(SeverityLevel.TRIVIAL)
    public RegistrationSteps NewsletterCheckBox (){
        MainNewsletterCheckBox.click();
        return this;
    }

    @Step ("Clicking on the Create My Account button")
    @Severity(SeverityLevel.CRITICAL)
    @Attachment(fileExtension = "png")
    public void AccButton () {
        MainCreateAccBtn.click();
    }


    @Step ("Filling Family Name, Value {0}")
    @Severity(SeverityLevel.NORMAL)
    @Attachment(fileExtension = "jpg")
    public RegistrationSteps MainCredentialsName(String mainFamilyNm) throws InterruptedException {
        sleep(5000);
        familyNameInput.setValue(MainFamilyNm);
        return this;
    }
    @Step ("Filling First Name, Value {0}")
    @Severity(SeverityLevel.NORMAL)
    @Attachment(fileExtension = "png")
    public RegistrationSteps MainCredentialsFirstName(String mainFirstNm) {
        firstNameInput.setValue(MainFirstNm);
        return this;
    }
    @Step ("Filling Date of Birth, Value {0}")
    @Severity(SeverityLevel.NORMAL)
    @Attachment(fileExtension = "png")
    public RegistrationSteps MainCredentialsDate(String mainDateOfBirth) {
        MainDateOfBirthInput.setValue(MainDateOfBirth);
        return this;
    }
    @Step ("Filling Phone Number, Value {0}")
    @Severity(SeverityLevel.NORMAL)
    @Attachment(fileExtension = ".jpg")
    @Description
    public RegistrationSteps MainCredentialsPhone(String mainPhoneNum) {
        MainPhoneNumInput.setValue(MainPhoneNum);
        return this;
    }
    @Step ("Clicking Continue Button, Registration is finished")
    @Severity(SeverityLevel.CRITICAL)
    @Attachment(fileExtension = ".png")
    public void ContinueBut (){
        MainContinueButton.click();
    }


}

