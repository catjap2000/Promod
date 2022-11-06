package PAGE;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;


public class RegistrationPage {

    public SelenideElement

            MainGoToCreateAccPg = $(new ByText("Create an account")),
            AcceptCookies = $("#popin_tc_privacy_button_2"),
            MainEmailInput = $("#email"),
            MainPasswordInput = $(byXpath("//*[@id=\"__layout\"]/div/main/section/div/div/form/div/div/div/input")),
            MainNewsletterCheckBox = $(".pmd-checkbox_input"),
            MainCreateAccBtn = $(byText("Create my account")),
            familyNameInput = $("#name"),
            firstNameInput = $("#firstname"),
            MainDateOfBirthInput = $(byName("Date of Birth")),
            MainPhoneNumInput = $(byXpath("//*[@id=\"__layout\"]/div/main/div/div/div[2]/form/div[1]/div[4]/div/div[2]/div/input")),
            MainContinueButton = $(byXpath("//*[@id=\"__layout\"]/div/main/div/div/div[2]/form/div[2]/button/span"));


}
