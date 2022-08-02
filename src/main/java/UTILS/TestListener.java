package UTILS;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class TestListener implements ITestListener {

    @Attachment(value = "Web Page Screenshot", type = "image/png")

    public void takeScreenshot(WebDriver driver){
        ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
    @Override
    public void onTestStart(ITestResult result){}

    @Override
    public void onTestSuccess (ITestResult result){}

    @Override
    public void onTestFailure (ITestResult result){
        WebDriver driver = getWebDriver();
        takeScreenshot(driver);
    }
    @Override
    public void onTestFailedButWithinSuccessPercentage (ITestResult result){}

    @Override
    public void onFinish(ITestContext arg0) {}

    @Override
    public void onStart(ITestContext arg0) {}

    @Override
    public void onTestSkipped(ITestResult arg0) {}



}
