package pattern.pagebject.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ComputersNotebooksPage {
    By notebooksLocator = By.xpath("(//a[@class='tile-cats__picture ng-star-inserted'])[1]");

    private final WebDriver driver;
    private WebDriverWait wait;

    public ComputersNotebooksPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public NotebooksPage navigateToNotebooks() {
        wait.until(ExpectedConditions.elementToBeClickable(notebooksLocator)).click();
        return new NotebooksPage(driver);
    }
}

