package homework26;

import init.InitialWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.Cookie;

import static java.lang.Thread.sleep;


public class TestActionLabelPresence extends InitialWebDriver {
    @Test
    public void testActionLabelPresence() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://rozetka.com.ua");
        changeCFCookie("k7ovhRZkFKYjyAo.bvMggTUuLTdXdRisXei49SH6Jbk-1701266124-0-1-b2cf8bdb.3eca5a5c.e5ced43b-0.2.1701266124");
        navigateToLaptopsSection();
        applySellerFilter();
        applyPriceFilter();
        sleep(3000);
        goToProductWithActionLabel();
        Assert.assertTrue(checkActionLabel().isDisplayed(), "No plug on the page");
    }

    public void changeCFCookie(String value) {
        Cookie cookie = new Cookie("cf_clearance", value);
        driver.manage().deleteCookieNamed("cf_clearance");
        driver.manage().addCookie(cookie);
        driver.navigate().refresh();
    }

    private void navigateToLaptopsSection() {
        WebElement computersNotebooks = driver.findElement(By.xpath("//rz-main-page-sidebar//a[contains(@href, 'computers-notebooks')]"));
        computersNotebooks.click();
        WebElement notebooks = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[contains(@class, 'tile-cats__picture')])[1]")));
        notebooks.click();
    }

    private void applySellerFilter() {
        WebElement filterRozetka = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-id='Rozetka']")));
        filterRozetka.click();
        WebElement seller = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(), 'Ноутбуки, продавець Rozetka')]")));
        Assert.assertTrue(seller.isDisplayed(), "Seller filter is not applied correctly");
    }

    private void applyPriceFilter() {
        WebElement filterPrice = driver.findElement(By.xpath("//fieldset/div/input[2]"));
        filterPrice.clear();
        filterPrice.sendKeys("10000");
        WebElement okButton = driver.findElement(By.xpath("//fieldset/div/button"));
        okButton.click();
    }

    private void goToProductWithActionLabel()  {

        WebElement productWithActionLabel = webDriverWait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//span[contains(@class, 'promo-label_type_action')])[1]/parent::div")));
        jsExecutor(driver, "arguments[0].scrollIntoView();", productWithActionLabel);
                    productWithActionLabel.click();
            }

    private  WebElement checkActionLabel() {

        return webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='product-about']//rz-label)[2]")));
    }
}