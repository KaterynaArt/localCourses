package lesson23;

import init.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileWriter;
import java.io.IOException;

public class TestWithDisplayedAndWritting extends WebDriverInit {
    final String EXPECTED_LABEL_COLOR = "rgba(0, 160, 70, 1)";

    @Test
    public void thirdTest() throws IOException {
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

        String productPriceText = driver.findElement(By.xpath("//*[contains(@class,'product-price__big')]"))
                .getAttribute("textContent");
        WebElement titleOnProductPage = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='product__heading']/h1")));

        if(inStockLabel.isDisplayed() && colorOfInstockLabel.equals(EXPECTED_LABEL_COLOR)){
            FileWriter fileWriter = new FileWriter("lesson23.txt");
            fileWriter.write(titleOnProductPage.getText() + " " + productPriceText);
            fileWriter.close();
        }
    }
}
