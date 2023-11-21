package lesson25;

import init.InitialWebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestJsExecuteScroll extends InitialWebDriver {
    @Test
    public void testClickViaJs() throws InterruptedException {
        driver.get("https://rozetka.com.ua/");

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0, 1000)", "");

        TimeUnit.SECONDS.sleep(5);
    }

}