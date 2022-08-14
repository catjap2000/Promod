package PAGE;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CareerPage {
    public SelenideElement

            AcceptCookiesMain = $("#popin_tc_privacy_button"),
            CareerPageSelector = $(("//*[@id=\"abtest-footer\"]/nav/div[3]/div[2]/ul/li[4]/a")),
            CareerCookies = $(new ByText("Accept all")),
            CareerOurJobOffers = $(new ByText("Our job offers")),
            CareerKeyword = $(By.xpath("//div[@class=\"search-engine__content\"]/form/div/div/input")),
            CareerLocation = $(new By.ByXPath("//html/body/div[1]/div[1]/div/main/div/section/div[2]/div/section/div/div[2]/form/div[2]/div/div/span/div/input")),
            CareerLocation2 = $(By.xpath("//a[@title=\"France\"]")),
            CareerJobType = $(new By.ByXPath("//*[@id=\"14\"]")),
            dropdown = $(new By.ByXPath("//*[@id=\"16\"]")),
            CareerCategoryCheckBx = $(By.xpath("//section[@id='jobs']/div/div[2]/form/div[4]/div[@id=\"dropdown-15\"]/ul/li[3]/a/span/span[@class=\"icon-wrapper\"]")),
            CareerJobSearchBtn = $(By.xpath("//html/body/div[1]/div[1]/div/main/div/section/div[2]/div/section/div/div[2]/form/div[5]/button")),
            CareerJA = $(By.xpath("//div[@class=\"row justify-content-center\"]/a[1]")),
            CareerJobApplyBtn = $(new ByText("Apply")),
            CareerFirsNameInput = $(By.xpath("//input[@class=\"form-control\"]")),
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
