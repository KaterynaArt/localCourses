package lesson22;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;


public class FirstTest {

    private WebDriver driver;
    private WebDriverWait webDriverWait;
    final String EXPECTED_TITLE = "Ноутбук Apple MacBook Air 13\" M1 8/256GB 2020 (MGN63) Space Gray";

    @BeforeTest
    public void initDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void firstTest() {
        driver.get("https://rozetka.com.ua/");
        WebElement searchInput = driver.findElement(By.name("search"));
        searchInput.sendKeys("Mac");
        WebElement btnSearch = driver.findElement(By.xpath("//button[contains(@class,  'search-form__submit')]"));
        btnSearch.click();
        WebElement titleOfFirstProduct = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='goods-tile__title']")));
        String title = titleOfFirstProduct.getText().trim();
        Assert.assertEquals(title, EXPECTED_TITLE, "Title doesn't contains search data");
    }

    @AfterTest
    public void closeDriver() {
        driver.quit();
    }
}