package PAGE;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CareerPage {
    public SelenideElement

            AcceptCookiesMain = $("#popin_tc_privacy_button"),
            CareerPageSelector = $(new By.ByXPath("//*[@id=\"abtest-footer\"]/nav/div[3]/div[2]/ul/li[4]/a")),
            CareerCookies = $(new ByText("Accept all")),
            CareerOurJobOffers = $(new ByText("Our job offers")),
            CareerKeyword = $(new By.ByXPath("//*[@id=\"10\"]")),
            CareerLocation = $(new By.ByXPath("//*[@id=\"12\"]")),
            CareerLocation2 = $(new ByText("France")),
            CareerJobType = $(new By.ByXPath("//*[@id=\"14\"]")),
            dropdown = $(new By.ByXPath("//*[@id=\"16\"]")),
            CareerCategoryCheckBx = $(By.xpath("//section[@id='jobs']/div/div[2]/form/div[4]/div[@id=\"dropdown-15\"]/ul/li[3]/a/span/span[@class=\"icon-wrapper\"]")),
            CareerJobSearchBtn = $(By.xpath("//html/body/div[1]/div[1]/div/main/div/section/div[2]/div/section/div/div[2]/form/div[5]/button")),
            CareerJA = $(By.xpath("//html/body/div[1]/div/div/main/div/section/div[2]/div/div/div/div/div[@class=\"row justify-content-center\"]/a[1]")),
            CareerJobApplyBtn = $(new ByText("Apply")),
            CareerFirsNameInput = $(By.xpath("//html/body/div/div/div/main/section/div/div/section/section/section/form/div/input[@class=\"form-control\"]")),
            CareerLastNameInput = $(By.xpath("//html/body/div/div/div/main/section/div/div/section/section/section/form/div[2]/input")),
            CareerRegEmailInput = $(By.xpath("//html/body/div/div/div/main/section/div/div/section/section/section/form/div[3]/input")),
            CareerRegPasswordInput = $(By.xpath("//html/body/div/div/div/main/section/div/div/section/section/section/form/div[4]/input")),
            CareerDialCodeDropDown = $(By.xpath("//html/body/div/div/div/main/section/div/div/section/section/section/form/div[5]/div/div/div/div[3]")),
            CareerCountries = $(By.xpath("//html/body/div/div/div/main/section/div/div/section/section/section/form/div[5]/div/div/ul/li[@id=\"iti-1__item-ge")),
            CareerPhoneNumberInput = $(By.xpath("//html/body/div/div/div/main/section/div/div/section/section/section/form/div[5]/div/input")),
            CareerTermsCheckBx = $(By.xpath("//html/body/div/div/div/main/section/div/div/section/section/section/form/div[6]/input")),
            SignUpBtn = $(By.xpath("//html/body/div/div/div/main/section/div/div/section/section/section/form/div[7]/button"));


    protected ElementsCollection.SelenideElementIterable getOptions() {
        return null;
    }
}

