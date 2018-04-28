package horo.month.link.steps;

import horo.month.pages.HoroMonthPage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import source.steps.AbstractSteps;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HoroLinkSteps extends AbstractSteps {
    private HoroMonthPage horoMonthPage = null;

    public HoroLinkSteps(WebDriver driver) {
        super(driver);
        horoMonthPage = PageFactory.initElements(driver, HoroMonthPage.class);
    }

    @Step("Get page header")
    private void pageHeaderShouldBeSameAs(String header) {
        assertEquals("page header is wrong",
                header,
                horoMonthPage.getPageHeader());
    }

    @Step("Open page {header}")
    public void open(String header) {
        horoMonthPage.open();
        horoMonthPage.pageValidate();
        pageHeaderShouldBeSameAs(header);
    }

    @Step("Get all articles")
    public List<String> getAllHoroItemTitles() {
        return horoMonthPage.getAllHoroItemTitles();
    }

    @Step("Check list {titles}")
    public void horoItemsShouldBeChanged(List<String> titles) {
        assertTrue("Lisk must change",
                horoMonthPage.isArticlesTitlesChanged(titles));
    }
}
