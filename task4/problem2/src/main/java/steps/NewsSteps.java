package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import page.NewsPage;

import java.util.List;

import static junit.framework.TestCase.assertTrue;

public class NewsSteps extends AbstractSteps {
    private NewsPage newsPage = null;

    public NewsSteps(WebDriver driver) {
        super(driver);
        newsPage = PageFactory.initElements(driver, NewsPage.class);
    }

    @Step("Open news page")
    public void open() {
        newsPage.open();
    }

    @Step("Get page articles")
    public List<String> getAllArticlesTitles() {
        return newsPage.getAllArticlesTitles();
    }


    @Step("Check {titles}")
    public void articlesTitlesShouldBeChanged(List<String> titles) {
        assertTrue("Titles must doubled",
                newsPage.isArticlesTitlesDoubled(titles));
        assertTrue("Titles must contains previous acticles",
                newsPage.isArticlesTitlesContainsPrevious(titles));
    }
}
