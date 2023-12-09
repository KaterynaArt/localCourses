package pattern.pageobject.selenide;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public interface BasketLogic {

    SelenideElement basketBtnLocator = $(byXpath("//button[@rzopencart]"));
    SelenideElement titleOfAddedProductToBasketLocator = $(byXpath("//a[@class='cart-product__title']"));

    default void clickOnBasketButtonInt() {
        basketBtnLocator.shouldBe(Condition.visible).click();
    }

    default String getTitleOfAddedProductInt() {
        return titleOfAddedProductToBasketLocator.shouldBe(Condition.visible).getText();
    }
}