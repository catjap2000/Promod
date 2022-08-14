package UTILS;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Attachment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class ChromeRunner {

    @BeforeTest
    @Attachment
    public static void PromodChromeRunner() {

        Configuration.browser = "Chrome";
        Configuration.baseUrl = "https://www.promod.com/en/";
        Configuration.browserSize = "1300x1080";

    }


    public void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Promod/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
    }
}
