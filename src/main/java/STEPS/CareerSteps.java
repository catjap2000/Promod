package STEPS;

import PAGE.CareerPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;

import static DATA.CareerDATA.CareerPhoneNumInput;
import static com.codeborne.selenide.Selenide.open;

public class CareerSteps extends CareerPage {

    @Step("Open Main Page")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Open Career Page")
    public void openUrl() {
        open("https://www.promod.com/en/");
    }


    @Step("Accept Cookies on Main Page")
    public CareerSteps CookiesMainPg(){
        AcceptCookiesMain.click();
        return this;
    }

    @Step ("Go to Career Page")
    public CareerSteps GoCareerPage(){
        open ("https://promodjob.talentview.io/?source=site_entreprise");
        return this;
    }

    @Step
    @Description("Choose Our Job Offers")
    public CareerSteps OurJobOffer() {
        CareerOurJobOffers.click();
        return this;
    }

    @Step
    @Description("Fill Keyword Input, Value: {Tech}")
    public CareerSteps KeyWordInput(String careerKeyWordInput) {
        CareerKeyword.setValue(careerKeyWordInput).shouldNotBe(Condition.empty);
        return this;
    }

    @Step
    @Description ("Fill Location Input, Value: {France}")
    public CareerSteps LocationInput(String locationInput) {
        CareerLocation.setValue(locationInput);
        CareerLocation.dragAndDropTo(CareerLocation2).click();
        CareerLocation2.shouldBe(Condition.editable, Condition.text("France")).click();
        CareerLocation.shouldNotBe(Condition.empty);
        return this;
    }

    @Step
    @Description ("Skip Job Type Input, Value: {0}")
    public CareerSteps JobTypeInput(String jobType) {
        CareerJobType.shouldBe(Condition.empty);
        return this;
    }

    @Step
    @Description ("Select Category(Choose from DropDown)")
    public CareerSteps CategoryInput() {
        dropdown.click();
        CareerCategoryCheckBx.click();
        dropdown.click();
        return this;
    }

    @Step
    @Description ("Click on Search Button")
    public CareerSteps SearchButton() {
        CareerJobSearchBtn.submit();
        return this;
    }

    @Step
    @Description ("Choose first Job Announcement, Value: {0}")
    public CareerSteps ChooseJA() {
        CareerJA.click();
        return this;
    }

    @Step
    @Description ("Click Apply Button")
    public CareerSteps ApplyButton() {
        CareerJobApplyBtn.click();
        return this;
    }

    @Step
    @Description ("Fill First Name, Value: {Faker}")
    public CareerSteps FirstNameInput(String firstname) {
        CareerFirsNameInput.setValue(firstname).shouldNotBe(Condition.empty);
        return this;
    }

    @Step
    @Description ("Fill Last Name, Value:{Faker}")
    public CareerSteps LastNameInput(String lastname) {
        CareerLastNameInput.setValue(lastname).shouldNotBe(Condition.empty);
        return this;
    }

    @Step
    @Description ("Fill Email Address, Value: {catjap@gmail.com}")
    public CareerSteps EmailInput(String emailCareer) {
        CareerRegEmailInput.setValue(emailCareer).shouldNotBe(Condition.empty);
        return this;
    }

    @Step
    @Description ("Create Your Password, Value: {Faker}")
    public CareerSteps PasswordInput(String passwordCareer) {
        CareerRegPasswordInput.setValue(passwordCareer).shouldNotBe(Condition.empty);
        return this;
    }

    @Step
    @Description ("Fill Phone Number, Value: {550550550}")
    public CareerSteps PhoneNumberInput() {
        CareerPhoneNumberInput.setValue(CareerPhoneNumInput).shouldNotBe(Condition.empty);
        return this;
    }

    @Step
    @Description ("Check Terms Box")
    public CareerSteps Terms() {
        CareerTermsCheckBx.click();
        CareerTermsCheckBx.shouldBe(Condition.checked);
        return this;
    }

    @Step
    @Description ("Click SignUp Button")
    public CareerSteps SignUp() {
        SignUpBtn.click();
        return this;
    }
    @Step
    @Description("Accept Cookies on Career Page")
    public CareerSteps CareerAcceptCookies() {
        CareerCookies.click();
        return this;
    }

}

