package UTILS;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideConfig;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;
import org.testng.annotations.BeforeTest;

import java.net.URI;

public class ChromeRunner {

    @BeforeTest
    public static void PromodChromeRunner(){

        Configuration.browser = "Chrome";
        Configuration.baseUrl = "https://www.promod.com/en/";
        Configuration.browserSize = "1300x1080";

    }
}
