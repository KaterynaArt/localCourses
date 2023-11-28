package homework25;

import init.InitialWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.lang.InterruptedException;
import java.util.ArrayList;
import java.util.Set;
import java.util.List;

public class TestCheckTitles extends InitialWebDriver {

    @Test
    public void testCheckTitle() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://intertop.ua/uk-ua/");
        SoftAssert softAssert = new SoftAssert();

        Thread.sleep(2000);
        WebElement loginBtn = driver.findElement(By.id("auth_block"));
        loginBtn.click();

        Thread.sleep(3000);

        WebElement registrationBtn = driver.findElement(
                By.xpath("//div[@data-v-71e951da]//a[text()='Створити акаунт']"));
        registrationBtn.click();

        WebElement privatePolicyDocBtn = driver.findElement(
                By.xpath("//p[@data-v-4c52ab80]//a[2]"));
        privatePolicyDocBtn.click();

        Thread.sleep(2000);
        Set<String> handles = driver.getWindowHandles();
        List<String> listHandles = new ArrayList<>(handles);
        driver.switchTo().window(listHandles.get(1));

        Thread.sleep(2000);
        softAssert.assertEquals(driver.getTitle(), "Безпека", "The title doesn't match");

        WebElement textIntertop = driver.findElement(By.xpath("//div[@class='page-cont']//*[contains(text(),'ТОВ «ІНТЕРТОП УКРАЇНА»')]"));
        softAssert.assertTrue(textIntertop.isDisplayed(), "The text is not found");

        WebElement secondTitle = driver.findElement(By.xpath("//div[@class='page-cont']//h3[contains(., 'Спосіб збору інформації')]"));
        softAssert.assertTrue(secondTitle.isDisplayed(), "The second Title is not found");

        softAssert.assertAll();
    }
}