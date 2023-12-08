package pattern.pagebject.selenide;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.Cookie;
import java.time.Duration;

import static com.codeborne.selenide.Selenide.page;

public class MainPageLogic extends MainPageLocators {

    public MainPageLogic changeCFCookie(String value) {
        Cookie cookie = new Cookie("cf_clearance", value);
        WebDriverRunner.getWebDriver().manage().deleteCookieNamed("cf_clearance");
        WebDriverRunner.getWebDriver().manage().addCookie(cookie);
        WebDriverRunner.getWebDriver().navigate().refresh();
        return this;
    }

    public MainPageLogic checkCategoriesQuantity(int categories) {
        sideBarCategories.shouldHave(CollectionCondition.size(categories));
        return this;
    }

    public CategoriesPageLogic clickOnCategory(int categoryNumber) {
        sideBarCategories.get(categoryNumber)
                .shouldBe(Condition.visible, Duration.ofSeconds(5))
                .click();
        return page(CategoriesPageLogic.class);
    }

}