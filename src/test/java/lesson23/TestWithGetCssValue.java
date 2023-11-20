package lesson23;

import init.InitialWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestWithGetCssValue extends InitialWebDriver {
    final String EXPECTED_LABEL_COLOR = "rgba(0, 160, 70, 1)";

    @Test
    public void thirdTest() {
        driver.get("https://rozetka.com.ua/ua/");
        WebElement searchInput = driver.findElement(By.name("search"));
        searchInput.sendKeys("Mac");
        WebElement searchButton = driver.findElement(By.xpath("//button[contains(@class,  'search-form__submit')]"));
        searchButton.click();
        WebElement titleOfFirstProduct = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='goods-tile__title']")));
        titleOfFirstProduct.click();
        webDriverWait.until(ExpectedConditions.urlToBe("https://rozetka.com.ua/ua/apple_macbook_air_13_m1_256gb_2020_space_gray/p245161909/"));
        WebElement inStockLabel = driver.findElement(By.xpath("//p[contains(@class, 'status-label--green')]"));
        String colorOfInstockLabel = inStockLabel.getCssValue("color");
        Assert.assertEquals(colorOfInstockLabel, EXPECTED_LABEL_COLOR);
    }
}