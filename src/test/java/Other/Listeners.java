package Other;

import PromodTEST.CareerTest;
import PromodTEST.RegistrationTest;
import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import java.io.ByteArrayInputStream;
import java.util.UUID;

public class Listeners  extends TestListenerAdapter {

    @Attachment(value = "Screenshot", fileExtension = "jpg")

    public byte[] takeScreenshot(WebDriver driver) {
//        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);

        Allure.addAttachment("Attach", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
        return new byte[0];
    }




    @Override
    public void onTestFailure(ITestResult result) {

        System.out.println("Executing listener on failure");

        WebDriver driver =
                CareerTest.PromodChromeRunner(result.getTestContext());
                RegistrationTest.PromodChromeRunner(result.getTestContext());

        if (driver != null) {
            Allure.addAttachment(UUID.randomUUID().toString(), new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
        }
    }
    @Override
    public void onTestSuccess(ITestResult result) {

        System.out.println("Executing listener on success");

        WebDriver driver =
        RegistrationTest.PromodChromeRunner(result.getTestContext());
        CareerTest.PromodChromeRunner((result.getTestContext()));

        if (driver != null) {
            Allure.addAttachment(UUID.randomUUID().toString(), new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
        }

    }
}

/*
    private static String getTestMethodName(ITestResult iTestResult) {
        return iTestResult.getMethod().getConstructorOrMethod().getName();
    }
    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] saveScreenshotPNG(WebDriver driver) {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
    @Attachment(value = "{0}", type = "text/plain")
    public static String saveTextLog(String message) {
        return message;
    }
    @Attachment(value = "{0}", type = "text/html")
    public static String attachHtml(String html) {
        return html;
    }

    @Override
    public void onStart(ITestContext iTestContext) {
        System.out.println("I am in onStart method " + iTestContext.getName());
        iTestContext.setAttribute("WebDriver", BasePage.getDriver());
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        System.out.println("I am in onFinish method " + iTestContext.getName());
    }

    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("I am in onTestStart method " + getTestMethodName(iTestResult) + " start");
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("I am in onTestSuccess method " + getTestMethodName(iTestResult) + " succeed");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("I am in onTestFailure method " + getTestMethodName(iTestResult) + " failed");
        Object testClass = iTestResult.getInstance();
        WebDriver driver = UTILS.ChromeRunner.PromodChromeRunner((ITestContext) getWebDriver());
        // Allure ScreenShotRobot and SaveTestLog
        if (driver instanceof WebDriver) {
            System.out.println("Screenshot captured for test case:" + getTestMethodName(iTestResult));
            saveScreenshotPNG(driver);
        }
        // Save a log on allure.
        saveTextLog(getTestMethodName(iTestResult) + " failed and screenshot taken!");
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("I am in onTestSkipped method " + getTestMethodName(iTestResult) + " skipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        System.out.println("Test failed but it is in defined success ratio " + getTestMethodName(iTestResult));
    }
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
*/







