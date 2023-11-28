package lesson26;

import init.InitialWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class TestSelectAutodoc extends InitialWebDriver {
    @Test
    public void testSelect() throws InterruptedException {
        driver.get("https://www.autodoc.de/");
        WebElement cookiesNotification = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(
                By.linkText("Alle Cookies erlauben")));
        if (cookiesNotification.isDisplayed()) {
            cookiesNotification.click();
        }
        getMarkByValue(driver, "25");
    }

    public void getMarkByValue(WebDriver driverFromTest, String markValue) throws InterruptedException {

        WebElement makerList = driverFromTest.findElement(By.id("form_maker_id"));
        String makerListOption = String.format("//select[@id='form_maker_id']/optgroup[2]/option[@value='%s']", markValue);
        makerList.click();
        driver.findElement(By.xpath(makerListOption)).click();
        sleep(5000);
    }
}
