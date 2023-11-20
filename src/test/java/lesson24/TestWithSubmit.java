package lesson24;

import init.InitialWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestWithSubmit extends InitialWebDriver {
    @Test
    public void testSubmit() {
        driver.get("https://www.google.com.ua/");
        WebElement inputSearch = driver.findElement(By.name("q"));
        WebElement btnSearch = driver.findElement(By.name("btnK"));
        if (btnSearch.getAttribute("value").equals("Поиск в Google")) {
            inputSearch.sendKeys("qa");
            btnSearch.submit();
        } else {
            Assert.fail();
        }
    }
}



