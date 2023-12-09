package pattern.pagebject.selenide;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import pattern.pageobject.selenide.BasketLogic;
import java.time.Duration;

public class LaptopsPageLogic extends LaptopsPageLocators implements BasketLogic {

    public LaptopsPageLogic checkQuantityOfGoodsTittles(int tittleAmount) {
        tittleOfAllProducts
                .shouldBe(CollectionCondition.size(tittleAmount), Duration.ofSeconds(10));
        return this;
    }

    public LaptopsPageLogic addNotebookToBasket() {
        btnBasketLocator.
                shouldBe(Condition.visible).click();
        return this;
    }
    public String getTitleOfSelectedProduct() {
        return titleOfSelectedProductLocator.
                shouldBe(Condition.visible).getText();
    }

    public LaptopsPageLogic checkProductsQuantityInBasket() {
        productsQuantityInBasketLocator.
                shouldBe(Condition.visible).shouldHave(Condition.text("1"));
        return this;
    }
    public LaptopsPageLogic clickOnBasketButton() {
        clickOnBasketButtonInt();
        return this;
    }
    public String getTitleOfAddedProduct() {
        return getTitleOfAddedProductInt();
    }
}