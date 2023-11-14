package lesson23;

import init.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestExistInDom extends WebDriverInit {
    final String EXPECTED_LABEL_COLOR = "rgba(0, 160, 70, 1)";

    @Test
    public void thirdTest() {
        driver.get("https://rozetka.com.ua/ua/");
        List<WebElement> logo = driver.findElements(By.xpath("//img[@alt='Rozetka Logo']"));
        if(logo.size() > 0){
            System.out.println("Logo appeared");
        }else {
            Assert.fail("Logo doesn't appeared");
        }
    }
}
