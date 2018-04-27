package horo.link.steps;

import horo.pages.HoroPage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import source.steps.AbstractSteps;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HoroLinkSteps extends AbstractSteps {
    private HoroPage horoPage = null;

    public HoroLinkSteps(WebDriver driver) {
        super(driver);
        horoPage = PageFactory.initElements(driver, HoroPage.class);
    }

    @Step("Get page header")
    private void pageHeaderShouldBeSameAs(String header) {
        assertEquals("page header is wrong",
                header,
                horoPage.getPageHeader());
    }

    @Step("Open page {header}")
    public void open(String header) {
        horoPage.open();
        horoPage.pageValidate();
        pageHeaderShouldBeSameAs(header);
    }

    @Step("Get all articles")
    public List<String> getAllHoroItemTitles() {
        return horoPage.getAllHoroItemTitles();
    }

    @Step("Check list {titles}")
    public void horoItemsShouldBeChanged(List<String> titles) {
        assertTrue("Lisk must change",
                horoPage.isArticlesTitlesChanged(titles));
    }
}
