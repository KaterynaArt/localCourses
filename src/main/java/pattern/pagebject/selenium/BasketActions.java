package pattern.pagebject.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public interface BasketActions {
    By basketBtnLocator = By.xpath("//button[@rzopencart]");
    By titleOfAddedProductToBasketLocator = By.xpath("//a[@class='cart-product__title']");

    default void clickOnBasketButtonI(WebDriver driver) {
        driver.findElement(basketBtnLocator).click();

    }

    default String getTitleOfAddedProductI(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement titleOfAddedProductToBasket = wait.until(ExpectedConditions.visibilityOfElementLocated(titleOfAddedProductToBasketLocator));
        return titleOfAddedProductToBasket.getText();
    }
}
