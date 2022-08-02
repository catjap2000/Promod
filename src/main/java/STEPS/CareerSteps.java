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

    @Step
    @Severity(SeverityLevel.NORMAL)
    @Description("Open Main Page")
    public void openUrl() {
        open("https://www.promod.com/en/");
    }


    @Step
    @Severity(SeverityLevel.TRIVIAL)
    @Description("Accept Cookies on Main Page")
    public CareerSteps CookiesMainPg(){
        AcceptCookiesMain.click();
        return this;
    }

    @Step
    @Severity(SeverityLevel.NORMAL)
    @Description("Go to Career Page")
    public CareerSteps GoCareerPage(){
        open ("https://promodjob.talentview.io/?source=site_entreprise");
        return this;
    }

    @Step
    @Severity(SeverityLevel.NORMAL)
    @Description("Choose Our Job Offers")
    public CareerSteps OurJobOffer() {
        CareerOurJobOffers.click();
        return this;
    }

    @Step
    @Severity(SeverityLevel.NORMAL)
    @Description("Fill Keyword Input, Value: {Tech}")
    public void KeyWordInput(String careerKeyWordInput) {
        CareerKeyword.setValue(careerKeyWordInput).shouldNotBe(Condition.empty);
    }

    @Step
    @Severity(SeverityLevel.NORMAL)
    @Description ("Fill Location Input, Value: {France}")
    public void LocationInput(String locationInput) {
        CareerLocation.setValue(locationInput);
        CareerLocation.dragAndDropTo(CareerLocation2).click();
        CareerLocation2.shouldBe(Condition.editable, Condition.text("France")).click();
        CareerLocation.shouldNotBe(Condition.empty);
    }

    @Step
    @Severity(SeverityLevel.TRIVIAL)
    @Description ("Skip Job Type Input, Value: {0}")
    public void JobTypeInput(String jobType) {
        CareerJobType.shouldBe(Condition.empty);
    }

    @Step
    @Severity(SeverityLevel.NORMAL)
    @Description ("Select Category 'Siege' (Choose from DropDown)")
    public void CategoryInput() {
        dropdown.click();
        CareerCategoryCheckBx.click();
        dropdown.click();
    }

    @Step
    @Severity(SeverityLevel.NORMAL)
    @Description ("Click on Job Search Button")
    public CareerSteps SearchButton() {
        CareerJobSearchBtn.submit();
        return this;
    }

    @Step
    @Severity(SeverityLevel.NORMAL)
    @Description ("Choose first Job Announcement")
    public CareerSteps ChooseJA() {
        CareerJA.click();
        return this;
    }

    @Step
    @Severity(SeverityLevel.NORMAL)
    @Description ("Click 'Apply' Button")
    public void ApplyButton() {
        CareerJobApplyBtn.click();
    }

    @Step
    @Severity(SeverityLevel.NORMAL)
    @Description ("Fill First Name, Value: {Faker}")
    public CareerSteps FirstNameInput(String firstname) {
        CareerFirsNameInput.setValue(firstname).shouldNotBe(Condition.empty);
        return this;
    }

    @Step
    @Severity(SeverityLevel.NORMAL)
    @Description ("Fill Last Name, Value:{Faker}")
    public CareerSteps LastNameInput(String lastname) {
        CareerLastNameInput.setValue(lastname).shouldNotBe(Condition.empty);
        return this;
    }

    @Step
    @Severity(SeverityLevel.NORMAL)
    @Description ("Fill Email Address, Value: {catjap@gmail.com}")
    public CareerSteps EmailInput(String emailCareer) {
        CareerRegEmailInput.setValue(emailCareer).shouldNotBe(Condition.empty);
        return this;
    }

    @Step
    @Severity(SeverityLevel.NORMAL)
    @Description ("Create Your Password, Value: {Faker}")
    public CareerSteps PasswordInput(String passwordCareer) {
        CareerRegPasswordInput.setValue(passwordCareer).shouldNotBe(Condition.empty);
        return this;
    }

    @Step
    @Severity(SeverityLevel.NORMAL)
    @Description ("Fill Phone Number, Value: {550550550}")
    public CareerSteps PhoneNumberInput() {
        CareerPhoneNumberInput.setValue(CareerPhoneNumInput).shouldNotBe(Condition.empty);
        return this;
    }

    @Step
    @Severity(SeverityLevel.NORMAL)
    @Description ("Check Terms Box")
    public CareerSteps Terms() {
        CareerTermsCheckBx.click();
        CareerTermsCheckBx.shouldBe(Condition.checked);
        return this;
    }

    @Step
    @Severity(SeverityLevel.NORMAL)
    @Description ("Click SignUp Button")
    public void SignUp() {
        SignUpBtn.click();
    }
    @Step
    @Severity(SeverityLevel.MINOR)
    @Description("Accept Cookies on Career Page")
    public CareerSteps CareerAcceptCookies() {
        CareerCookies.click();
        return this;
    }

}

