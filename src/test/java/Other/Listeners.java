package Other;

import PromodTEST.CareerTest;
import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import javax.naming.ldap.ExtendedRequest;
import java.io.ByteArrayInputStream;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class Listeners implements ITestListener {
    @Attachment(value = "Web Page Screenshot", type = "image/png")
    public void takeScreenshot(WebDriver driver){((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

    @Override
    public void onTestStart(ITestResult result) {
        ITestListener.super.onTestStart(result);
//        takeScreenshot((WebDriver) OutputType.BYTES);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ITestListener.super.onTestSuccess(result);
//        Allure.addAttachment("ScreenShot", new ByteArrayInputStream(((TakesScreenshot)result.getTestContext().getAttribute("WebDriver")).getScreenshotAs(OutputType.BYTES)));
//        Object webDriverAttribute = result.getTestContext().getAttribute("WebDriver");
//        takeScreenshot((WebDriver) webDriverAttribute);
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ITestListener.super.onTestFailure(result);

        WebDriver driver = getWebDriver();
        takeScreenshot(driver);
//        Allure.addAttachment("screenShot", new ByteArrayInputStream(((TakesScreenshot)result.getTestContext().getAttribute("WebDriver")).getScreenshotAs(OutputType.BYTES)));
//        Object webDriverAttribute = result.getTestContext().getAttribute("WebDriver");
//        takeScreenshot((WebDriver) webDriverAttribute);
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ITestListener.super.onTestSkipped(result);
//        Allure.addAttachment("screenShot", new ByteArrayInputStream(((TakesScreenshot)result.getTestContext().getAttribute("WebDriver")).getScreenshotAs(OutputType.BYTES)));
//        Object webDriverAttribute = result.getTestContext().getAttribute("WebDriver");
//        takeScreenshot((WebDriver) webDriverAttribute);
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
//        Allure.addAttachment("screenShot", new ByteArrayInputStream(((TakesScreenshot)result.getTestContext().getAttribute("WebDriver")).getScreenshotAs(OutputType.BYTES)));
//        Object webDriverAttribute = result.getTestContext().getAttribute("WebDriver");
//        takeScreenshot((WebDriver) webDriverAttribute);
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        ITestListener.super.onTestFailedWithTimeout(result);
//        Allure.addAttachment("screenShot", new ByteArrayInputStream(((TakesScreenshot)result.getTestContext().getAttribute("WebDriver")).getScreenshotAs(OutputType.BYTES)));
//        Object webDriverAttribute = result.getTestContext().getAttribute("WebDriver");
//        takeScreenshot((WebDriver) webDriverAttribute);
    }
}
