package Homework23;

import init.InitialWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import java.time.Duration;
import org.testng.asserts.SoftAssert;


public class TestAddToCart extends InitialWebDriver {
    @Test
    public void addProductToBasket() {
        driver.get("https://rozetka.com.ua/");
        SoftAssert softAssert = new SoftAssert();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement computersNotebooks = driver.findElement(By.xpath("//rz-main-page-sidebar//a[contains(@href, 'computers-notebooks')]"));
        computersNotebooks.click();

        WebElement notebooks = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='tile-cats__picture ng-star-inserted'])[1]")));
        notebooks.click();

        WebElement btnBasket = driver.findElement(By.xpath("//button[contains(@class, 'buy-button')]"));
        btnBasket.click();

        WebElement titleOfSelectedProduct = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='goods-tile__title'])[1]")));
        softAssert.assertEquals(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//rz-icon-badge/span"))).getText(), "1", "Counter doesn't match 1.");

        WebElement basket = driver.findElement(By.xpath("//button[@rzopencart]"));
        basket.click();

        WebElement titleOfAddedProductToBasket = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='cart-product__title']")));
        softAssert.assertEquals(titleOfAddedProductToBasket.getText(), titleOfSelectedProduct.getText(), "Titles of the selected product and product in the basket don't match.");

        softAssert.assertAll();
    }
}

