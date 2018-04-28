package horo.name.numenology.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import source.navigation.Page;
import source.navigation.UrlPattern;
import source.pages.AbstractPage;

@Page("/numerology/chislovaya-vibraciya-imen")
@UrlPattern("numerology/chislovaya-vibraciya-imen")
public class HoroNamePage extends AbstractPage {
    public HoroNamePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[contains(@class, 'p-tabs__item_active')]//div[contains(@class, 'article__item')]")
    private WebElement nameArticle;

    public String getNameArticle() {
        return nameArticle.getText();
    }

    public boolean isNameArticleChanged(String article) {
        ExpectedCondition<Boolean> condition = new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver webDriver) {
                return getNameArticle() != article;
            }
        };
        return waitTools.waitForCondition(condition);
    }
}
