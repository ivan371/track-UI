package page;

import navigation.Page;
import navigation.UrlPattern;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;

import java.util.List;
import java.util.stream.Collectors;

public class NewsPage extends AbstractPage {
    public NewsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".pypo-item__title")
    private List<WebElement> articlesTitles;

    public List<String> getAllArticlesTitles() {
        return articlesTitles.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }

    public boolean isArticlesTitlesDoubled(List<String> titles) {
        ExpectedCondition<Boolean> condition = new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver webDriver) {
                return getAllArticlesTitles().size() == 2 * titles.size();
            }
        };
        return waitTools.waitForCondition(condition);
    }

    public boolean isArticlesTitlesContainsPrevious(List<String> titles) {
        ExpectedCondition<Boolean> condition = new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver webDriver) {
                return getAllArticlesTitles().containsAll(titles);
            }
        };
        return waitTools.waitForCondition(condition);
    }
}
