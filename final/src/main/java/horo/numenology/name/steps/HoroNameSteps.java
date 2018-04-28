package horo.numenology.name.steps;

import horo.numenology.name.pages.HoroNamePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import source.steps.AbstractSteps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HoroNameSteps extends AbstractSteps {
    private HoroNamePage horoNamePage = null;

    public HoroNameSteps(WebDriver driver) {
        super(driver);
        horoNamePage = PageFactory.initElements(getDriver(), HoroNamePage.class);
    }

    @Step("Get page header")
    private void pageHeaderShouldBeSameAs(String header) {
        assertEquals("page header is wrong",
                header,
                horoNamePage.getPageHeader());
    }

    @Step("Open page {header}")
    public void open(String header) {
        horoNamePage.open();
        horoNamePage.pageValidate();
        pageHeaderShouldBeSameAs(header);
    }

    @Step("Get article")
    public String getHoroNameArticle() {
        return horoNamePage.getNameArticle();
    }

    @Step("Check {article}")
    public void horoItemsShouldBeChanged(String article) {
        assertTrue("Article should change",
                horoNamePage.isNameArticleChanged(article));
    }
}
