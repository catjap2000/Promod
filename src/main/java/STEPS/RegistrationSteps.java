package STEPS;

import PAGE.RegistrationPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Step;

import static DATA.RegistrationDATA.*;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class RegistrationSteps extends RegistrationPage {
    @Step
    @Description("Open Account Page")
    public void openUrl(){
        open ("https://auth2.promod.com/en/?redirect_uri=www.promod.com%2Fen%2Fauth%2Fcallback%2F");
    }
    @Step
    @Description("Accept Cookies Button")
    public RegistrationSteps Cookies(){
        AcceptCookies.click();
        sleep(1000);
        return this;
    }

    @Step
    @Description("Click Registration button")
    public RegistrationSteps GoToAccountPage() {
        MainGoToCreateAccPg.click();
        return this;
    }
    @Step
    @Description("Fill email address, Value: {Faker}")
    public RegistrationSteps mail (String mainLogInEmail) {
        MainEmailInput.setValue(MainLogInEmail).shouldNotBe(Condition.empty);
        return this;
    }
    @Step
    @Description("Fill Password, Value: {}")
    public RegistrationSteps MainPassword (String mainPasswordInp){
        MainPasswordInput.setValue(MainPasswordInp).click();
        return this;
    }
    @Step
    @Description("Newsletter Checkbox")
    public RegistrationSteps NewsletterCheckBox (){
        MainNewsletterCheckBox.click();
        return this;
    }
    @Step
    @Description("Click Create My Account button")
    public RegistrationSteps AccButton () {
        MainCreateAccBtn.click();
        return this;
    }
    @Step
    @Description("Fill family name")
    public RegistrationSteps MainCredentialsName(String mainFamilyNm) {
        familyNameInput.setValue(MainFamilyNm);
        return this;
    }
    @Step
    @Description("Fill first name")
    public RegistrationSteps MainCredentialsFirstName(String mainFirstNm) {
        firstNameInput.setValue(MainFirstNm);
        return this;
    }
    @Step
    @Description("Fill DoB")
    public RegistrationSteps MainCredentialsDate(String mainDateOfBirth) {
        MainDateOfBirthInput.setValue(MainDateOfBirth);
        return this;
    }
    @Step
    @Description("Fill Phone number")
    public RegistrationSteps MainCredentialsPhone(String mainPhoneNum) {
        MainPhoneNumInput.setValue(MainPhoneNum);
        return this;
    }
    @Step
    @Description("Click Continue button")
    public RegistrationSteps ContinueBut (){
        MainContinueButton.click();
        return this;
    }
}

