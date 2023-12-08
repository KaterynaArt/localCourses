package lesson28;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FirstSelenideTest {

    @BeforeTest
    public void before() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-popup-blocking");
        Configuration.browserSize = "1280x720";
        Configuration.browserPosition = "0x0";
        Configuration.timeout = 10000;
        Configuration.pageLoadTimeout = 200000;
        Configuration.browserCapabilities = options;
    }

    @Test
    public void testSelenide() {
        open("https://rozetka.com.ua/");
        Cookie cookie = new Cookie("cf_clearance", "ejhbfjehvjhebvkjebvkjernrbjlver");
        WebDriverRunner.getWebDriver().manage().deleteCookieNamed("cf_clearance");
        WebDriverRunner.getWebDriver().manage().addCookie(cookie);


        $(By.name("search")).setValue("Mac").pressEnter();

    }
}