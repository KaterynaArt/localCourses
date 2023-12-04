package pattern.pagebject.selenium;

import org.openqa.selenium.WebDriver;

public class MainPage extends MainPageLocators implements ICartPage {

    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public MainPage checkingCart(){
        checkingCartI(driver);
        return this;
    }

    public MainPage typeTextInInputSearch(String text) {
        driver.findElement(inputSearch).sendKeys(text);
        return this;
    }

    public MainPage clearOfInputSearch() {
        driver.findElement(inputSearch).clear();
        return this;
    }

    public SearchPage clickBtnSearch() {
        driver.findElement(btnSearch).click();
        return new SearchPage(driver);
    }
}
