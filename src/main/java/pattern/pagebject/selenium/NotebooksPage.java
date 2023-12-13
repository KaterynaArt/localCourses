package pattern.pagebject.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class NotebooksPage implements BasketActions {

    By btnBasketLocator = By.xpath("//button[contains(@class, 'buy-button')]");
    By titleOfSelectedProductLocator = By.xpath("(//span[@class='goods-tile__title'])[1]");
    By productsQuantityInBasketLocator = By.xpath("//rz-icon-badge/span");

    private WebDriver driver;
    private WebDriverWait wait;

    public NotebooksPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public NotebooksPage clickOnBasketButton() {
        clickOnBasketButtonI(driver);
        return this;
    }

    public String getTitleOfAddedProduct() {
        return getTitleOfAddedProductI(driver);
    }

    public NotebooksPage addNotebookToBasket() {
        driver.findElement(btnBasketLocator).click();
        return this;
    }

    public String getTitleOfSelectedProduct() {
        WebElement titleOfSelectedProduct = wait.until(ExpectedConditions.visibilityOfElementLocated(titleOfSelectedProductLocator));
        return titleOfSelectedProduct.getText();
    }

    public NotebooksPage checkProductsQuantityInBasket() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(wait.until(ExpectedConditions.visibilityOfElementLocated(productsQuantityInBasketLocator)).getText(), "1", "Counter doesn't match 1.");
        return this;
    }
}

