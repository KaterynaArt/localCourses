package lesson26;


import init.InitialWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class TestFrameExample extends InitialWebDriver {

    @Test
    public void testFrame() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/iframe");

        WebElement frame = driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(frame);
        sleep(5000);
        WebElement inputInFrame = driver.findElement(By.id("tinymce"));
        sleep(5000);
        inputInFrame.sendKeys("Hello world. I am here");


    }
}
