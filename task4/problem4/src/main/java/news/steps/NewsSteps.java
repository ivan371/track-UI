package news.steps;

import io.qameta.allure.Step;
import news.page.NewsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import source.elements.ComponentObject;
import source.steps.AbstractSteps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class NewsSteps extends AbstractSteps{
    private NewsPage newsPage = null;

    public NewsSteps(WebDriver driver) {
        super(driver);
        newsPage = PageFactory.initElements(driver, NewsPage.class);
    }

    @Step("Get page header")
    private void pageHeaderShouldBeSameAs(String header) {
        assertEquals("page header is wrong",
                header,
                newsPage.getPageHeader());
    }

    @Step("Open page {header}")
    public void open(String header) {
        newsPage.open();
        newsPage.pageValidate();
        pageHeaderShouldBeSameAs(header);
    }

    @Step("Get img src")
    public String getImageSrc() {
        return newsPage.getPhotoUrl();
    }

    @Step("Check img src")
    public void checkImgSrc(String src) {
        assertTrue(String.format("src must change: %s and %s", src, getImageSrc()), !getImageSrc().equals(src));
    }

    @Step("Scroll to instagram")
    public void scrollToInstagram(WebElement webElement) {
        newsPage.ScrollToInstagram(webElement);
    }

    @Step("Switch to instagram")
    public void switchToInstagram(WebElement webElement) {
        newsPage.SwitchToInstagram(webElement);
    }
}
