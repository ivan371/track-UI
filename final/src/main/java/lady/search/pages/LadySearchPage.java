package lady.search.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import source.navigation.Page;
import source.navigation.UrlPattern;
import source.pages.AbstractPage;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

@Page("/search")
@UrlPattern("search")
public class LadySearchPage extends AbstractPage {
    public LadySearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a.newsitem__title")
    private List<WebElement> ladySearchTitles;

    public boolean isTitlesDifferent() {
        return ladySearchTitles.size() == new HashSet<WebElement>(ladySearchTitles).size();
    }
}
