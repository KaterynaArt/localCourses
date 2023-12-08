package homework29;

import init.InitialSelenide;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pattern.pagebject.selenide.LaptopsPageLogic;
import pattern.pagebject.selenide.MainPageLogic;

import static com.codeborne.selenide.Selenide.open;

public class TestAddToBasketCorrectProduct extends InitialSelenide{

    final String URL = "https://rozetka.com.ua/";
    final String cf_clearance = "DQzbw2H7pADvgXhWsq4mPqsaBhgqCM81siPAiJmM330-1702061528-0-1-d10aaf6e.46d9bf5.860bf08e-0.2.1702061528";
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


