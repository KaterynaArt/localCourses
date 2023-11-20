package lesson23;


import init.InitialWebDriver;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestWithGetAtr extends InitialWebDriver {
    private final String EXPECTED_TITLE = "Ноутбук Apple MacBook Air 13\" M1 8/256GB 2020 (MGN63) Space Gray";

    @Test
    public void secondTest() {
        driver.get("https://rozetka.com.ua/ua/");
        WebElement searchInput = driver.findElement(By.name("search"));
        searchInput.sendKeys("Mac");
        WebElement searchButton = driver.findElement(By.xpath("//button[contains(@class,  'search-form__submit')]"));
        searchButton.click();
        WebElement titleOfFirstProduct = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='goods-tile__title']")));
        titleOfFirstProduct.click();
        webDriverWait.until(ExpectedConditions.urlToBe("https://rozetka.com.ua/ua/apple_macbook_air_13_m1_256gb_2020_space_gray/p245161909/"));
        WebElement titleOnProductPage = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='product__heading']/h1")));
        String titleOnProductPageText = titleOnProductPage.getAttribute("innerText");
        Assert.assertEquals(titleOnProductPageText, EXPECTED_TITLE);
    }
}