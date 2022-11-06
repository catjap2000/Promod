package STEPS;

import PAGE.CareerPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.*;
import org.testng.annotations.Listeners;

import static DATA.CareerDATA.CareerPhoneNumInput;
import static com.codeborne.selenide.Selenide.open;

public class CareerSteps extends CareerPage {

    @Step ("Open Main Page")
    @Attachment(fileExtension = "")
    @Severity(SeverityLevel.NORMAL)
    public void openUrl() {
        open("https://www.promod.com/en/");
    }


    @Step ("Accept Cookies on Main Page")
    @Attachment(fileExtension = "")
    @Severity(SeverityLevel.TRIVIAL)
    public CareerSteps CookiesMainPg() {
        AcceptCookiesMain.click();
        return this;
    }

    @Step ("Go to Career Page")
    @Attachment(fileExtension = "")
    @Severity(SeverityLevel.NORMAL)
    public CareerSteps GoCareerPage() {
        open("https://promodjob.talentview.io/?source=site_entreprise");
        return this;
    }

    @Step("Click on 'Our Job Offers' button")
    @Attachment(fileExtension = "")
    @Severity(SeverityLevel.NORMAL)
    public CareerSteps OurJobOffer() {
        CareerOurJobOffers.click();
        return this;
    }

    @Step ("Fill Keyword Input, Value: {0}")
    @Attachment(fileExtension = "")
    @Severity(SeverityLevel.NORMAL)
    public void KeyWordInput(String careerKeyWordInput) {
        CareerKeyword.setValue(careerKeyWordInput).shouldNotBe(Condition.empty);
    }

    @Step ("Fill Location Input, Value: {0}")
    @Attachment(fileExtension = "")
    @Severity(SeverityLevel.NORMAL)
    public void LocationInput(String locationInput) {
        CareerLocation.setValue(locationInput);
        CareerLocation.dragAndDropTo(CareerLocation2).click();
        CareerLocation2.shouldBe(Condition.editable, Condition.text("France")).click();
        CareerLocation.shouldNotBe(Condition.empty);
    }

    @Step("Skip Job Type Input, Value: {0}")
    @Attachment(fileExtension = "")
    @Severity(SeverityLevel.TRIVIAL)
    public void JobTypeInput(String jobType) {
        CareerJobType.shouldBe(Condition.empty);
    }

    @Step ("Category input, from dropdown menu select: Value {0} ")
    @Attachment(fileExtension = "")
    @Severity(SeverityLevel.NORMAL)
    public void CategoryInput() {
        dropdown.click();
        CareerCategoryCheckBx.click();
        dropdown.click();
    }

    @Step ("Click on Job Search Button")
    @Attachment(fileExtension = "")
    @Severity(SeverityLevel.NORMAL)
    public CareerSteps SearchButton() {
        CareerJobSearchBtn.submit();
        return this;
    }

    @Step ("Choose first Job Announcement: Value {0}")
    @Attachment (fileExtension = "")
    @Severity(SeverityLevel.NORMAL)
    public CareerSteps ChooseJA() {
        CareerJA.click();
        return this;
    }

    @Step ("Click 'Apply' Button")
    @Attachment (fileExtension = "")
    @Severity(SeverityLevel.NORMAL)
    public void ApplyButton() {
        CareerJobApplyBtn.click();
    }

    @Step ("Fill First Name, Value: {0}")
    @Attachment (fileExtension = "")
    @Severity(SeverityLevel.NORMAL)
    public CareerSteps FirstNameInput(String firstname) {
        CareerFirsNameInput.setValue(firstname).shouldNotBe(Condition.empty);
        return this;
    }

    @Step ("Fill Last Name, Value:{0}")
    @Attachment (fileExtension = "")
    @Severity(SeverityLevel.NORMAL)
    public CareerSteps LastNameInput(String lastname) {
        CareerLastNameInput.setValue(lastname).shouldNotBe(Condition.empty);
        return this;
    }

    @Step ("Fill Email Address, Value: {0}")
    @Attachment (fileExtension = "")
    @Severity(SeverityLevel.NORMAL)
    public CareerSteps EmailInput(String emailCareer) {
        CareerRegEmailInput.setValue(emailCareer).shouldNotBe(Condition.empty);
        return this;
    }

    @Step ("Create Your Password, Value: {0}")
    @Attachment (fileExtension = "")
    @Severity(SeverityLevel.NORMAL)
    public CareerSteps PasswordInput(String passwordCareer) {
        CareerRegPasswordInput.setValue(passwordCareer).shouldNotBe(Condition.empty);
        return this;
    }

    @Step ("Fill Phone Number, Value: {0}")
    @Attachment (fileExtension = "")
    @Severity(SeverityLevel.NORMAL)
    public CareerSteps PhoneNumberInput() {
        CareerPhoneNumberInput.setValue(CareerPhoneNumInput).shouldNotBe(Condition.empty);
        return this;
    }

    @Step ("Select Terms Box")
    @Attachment (fileExtension = "")
    @Severity(SeverityLevel.NORMAL)
    public CareerSteps Terms() {
        CareerTermsCheckBx.click();
        CareerTermsCheckBx.shouldBe(Condition.checked);
        return this;
    }

    @Step("Click on the SignUp Button")
    @Attachment (fileExtension = "")
    @Severity(SeverityLevel.NORMAL)
    public void SignUp() {
        SignUpBtn.click();
    }

    @Step ("Accept Cookies on Career Page")
    @Attachment (fileExtension = "")
    @Severity(SeverityLevel.MINOR)
    public CareerSteps CareerAcceptCookies() {
//        if (CareerCookies.is(Condition.visible)) {
            CareerCookies.click();
//        } else {
//          CareerCookies.shouldBe(Condition.selected);
//        }
        return this;
    }
}



