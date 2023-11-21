package lesson25;

import init.InitialWebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestAlertExample extends InitialWebDriver {
    @Test
    public void testClickViaJs() throws InterruptedException {
        driver.get("https://rozetka.com.ua/");

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("alert('are you sure?')");

        TimeUnit.SECONDS.sleep(5);

        driver.switchTo().alert().accept();

        TimeUnit.SECONDS.sleep(5);
    }

}