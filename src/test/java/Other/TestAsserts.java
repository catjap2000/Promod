package Other;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.Test;
import org.testng.asserts.SoftAssert;

import java.util.Objects;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class TestAsserts {
    @Test
    public void assertsTest(){

        Selenide.open("https://www.promod.com/en/search/");
        Configuration.browserSize = "1920x1080";

//        SoftAssert soft = new SoftAssert();
//
//        $(byName("search")).setValue("coat");
//
//        soft.assertEquals(Objects.requireNonNull($(byName("search")).getValue()),"coat");
//        $(byName("search")).setValue("dress");
//        sleep(1000);
//
//        soft.assertAll();

    }
}