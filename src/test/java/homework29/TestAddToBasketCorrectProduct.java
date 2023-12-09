package homework29;

import init.InitialSelenide;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pattern.pagebject.selenide.LaptopsPageLogic;
import pattern.pagebject.selenide.MainPageLogic;

import static com.codeborne.selenide.Selenide.open;

public class TestAddToBasketCorrectProduct extends InitialSelenide{

    final String URL = "https://rozetka.com.ua/";
    final String cf_clearance = "aFZtXIAFFogR.nrXDzKalSOy92RxKJ97k9gUvjslztc-1702122763-0-1-d10aaf6e.a01b7aff.860bf08e-0.2.1702122763";
    @Test
    public void TestAddToBasketCorrectProduct() {
        open(URL);
        SoftAssert softAssert = new SoftAssert();
        String selectedProductTitle =  new MainPageLogic()
                .changeCFCookie(cf_clearance)
                .clickOnCategory(0)
                .clickOnSubCategoryLaptops()
                .addNotebookToBasket()
                .checkProductsQuantityInBasket()
                .getTitleOfSelectedProduct();

        String addedProductTitle = new LaptopsPageLogic()
                .clickOnBasketButton()
                .getTitleOfAddedProduct();

        softAssert.assertEquals(addedProductTitle, selectedProductTitle, "Titles of the selected product and product in the basket don't match.");
        softAssert.assertAll();
    }
}





