package homework27;

import init.InitialWebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pattern.pagebject.selenium.MainPage;
import pattern.pagebject.selenium.NotebooksPage;

public class TestToCheckAddedProductToCart extends InitialWebDriver {
    final String URL = "https://rozetka.com.ua/";
    final String cf_clearance = "URW31mryHjSNYomvgBFmbbiLhKL5jbc90fYaqflk9tY-1701777348-0-1-c5145f7.4c07598a.5b501a17-0.2.1701777348";

    @Test
    public void checkAddedProductToCart() {
        driver.get(URL);
        MainPage mainPage = new MainPage(driver);
        NotebooksPage notebooksPage = new NotebooksPage(driver);
        SoftAssert softAssert = new SoftAssert();

        String selectedProductTitle = mainPage
                .changeCFCookie(cf_clearance)
                .navigateToComputersNotebooks()
                .navigateToNotebooks()
                .addNotebookToBasket()
                .checkProductsQuantityInBasket()
                .getTitleOfSelectedProduct();

        String addedProductTitle = notebooksPage
                .clickOnBasketButton()
                .getTitleOfAddedProduct();

        softAssert.assertEquals(addedProductTitle, selectedProductTitle, "Titles of the selected product and product in the basket don't match.");
        softAssert.assertAll();
    }
}
