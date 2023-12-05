package pattern.pagebject.selenium;

import org.openqa.selenium.By;

public class MainPageLocators {

    By inputSearch = By.name("search");
    By btnSearch = By.xpath("//button[contains(@class, 'search-form__submit')]");
    By computersNotebooksLocator = By.xpath("//rz-main-page-sidebar//a[contains(@href, 'computers-notebooks')]");

}
