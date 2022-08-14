package STEPS;

import PAGE.RegistrationPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Screenshots;
import io.qameta.allure.*;

import static DATA.RegistrationDATA.*;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class RegistrationSteps extends RegistrationPage {
    @Step
    @Severity(SeverityLevel.CRITICAL)
    @Description("The Account Page should be open")
    public void openUrl(){
        open ("https://auth2.promod.com/en/?redirect_uri=www.promod.com%2Fen%2Fauth%2Fcallback%2F");
    }
    @Step
    @Severity(SeverityLevel.MINOR)
    @Attachment
    @Description("Accepting Cookies Button")
    public RegistrationSteps Cookies(){
        AcceptCookies.click();
        sleep(1000);
        return this;
    }

    @Step
    @Severity(SeverityLevel.NORMAL)
    @Attachment
    @Description("Clicking on Registration button")
    public RegistrationSteps GoToAccountPage() {
        MainGoToCreateAccPg.click();
        return this;
    }
    @Step
    @Severity(SeverityLevel.NORMAL)
    @Attachment
    @Description("Filling email address, Value: {Faker}")
    public RegistrationSteps mail (String mainLogInEmail) {
        MainEmailInput.setValue(MainLogInEmail).shouldNotBe(Condition.empty);
        return this;
    }
    @Step
    @Severity(SeverityLevel.NORMAL)
    @Attachment
    @Description("Filling Password, Value: {@caTErina798j0}")
    public void MainPassword (String mainPasswordInp){
        MainPasswordInput.setValue(MainPasswordInp).click();
    }
    @Step
    @Attachment
    @Severity(SeverityLevel.TRIVIAL)
    @Description("Selecting the Newsletter Checkbox")
    public RegistrationSteps NewsletterCheckBox (){
        MainNewsletterCheckBox.click();
        return this;
    }
    @Step
    @Severity(SeverityLevel.CRITICAL)
    @Attachment
    @Description("Clicking on the Create My Account button")
    public void AccButton () {
        MainCreateAccBtn.click();
    }


    @Step
    @Severity(SeverityLevel.NORMAL)
    @Attachment
    @Description("Filling Family Name, Value {Faker}")
    public RegistrationSteps MainCredentialsName(String mainFamilyNm) throws InterruptedException {
        sleep(5000);
        familyNameInput.setValue(MainFamilyNm);
        return this;
    }
    @Step
    @Severity(SeverityLevel.NORMAL)
    @Attachment
    @Description("Filling First Name, Value {Caterina}")
    public RegistrationSteps MainCredentialsFirstName(String mainFirstNm) {
        firstNameInput.setValue(MainFirstNm);
        return this;
    }
    @Step
    @Severity(SeverityLevel.NORMAL)
    @Attachment
    @Description("Filling Date of Birth, Value {02/01/75}")
    public RegistrationSteps MainCredentialsDate(String mainDateOfBirth) {
        MainDateOfBirthInput.setValue(MainDateOfBirth);
        return this;
    }
    @Step
    @Severity(SeverityLevel.NORMAL)
    @Attachment
    @Description("Filling Phone Number, Value {Faker}")
    public RegistrationSteps MainCredentialsPhone(String mainPhoneNum) {
        MainPhoneNumInput.setValue(MainPhoneNum);
        return this;
    }
    @Step
    @Severity(SeverityLevel.CRITICAL)
    @Attachment
    @Description("Clicking Continue Button, Registration is finished")
    public void ContinueBut (){
        MainContinueButton.click();
    }
}

