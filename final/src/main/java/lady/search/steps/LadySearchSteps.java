package lady.search.steps;

import io.qameta.allure.Step;
import lady.search.pages.LadySearchPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import source.steps.AbstractSteps;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LadySearchSteps extends AbstractSteps {
    private LadySearchPage ladySearchPage = null;

    public LadySearchSteps(WebDriver driver) {
        super(driver);
        ladySearchPage = PageFactory.initElements(driver, LadySearchPage.class);
    }

    @Step("Open page")
    public void open() {
        ladySearchPage.open();
        ladySearchPage.pageValidate();
    }

    @Step("Check list {titles}")
    public void ladySearchTitlesSimilar() {
        assertTrue("Titles must't be similar",
                ladySearchPage.isTitlesDifferent());
    }
}
