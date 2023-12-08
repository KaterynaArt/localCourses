package pattern.pageobject.selenide;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import pattern.pagebject.selenide.LaptopsPageLogic;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;


public interface BasketLogic {

    public SelenideElement basketBtnLocator = $(byXpath("//button[@rzopencart]"));
    public SelenideElement titleOfAddedProductToBasketLocator = $(byXpath("//a[@class='cart-product__title']"));

    default LaptopsPageLogic clickOnBasketButton() {
        basketBtnLocator.shouldBe(Condition.visible).click();
        return null;
    }

    default String getTitleOfAddedProduct() {
        return titleOfAddedProductToBasketLocator.shouldBe(Condition.visible).getText();
    }
}