package steps;

import elements.PhotoGallery;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import page.NewsKinoPage;
import steps.AbstractSteps;

public class NewsSteps extends AbstractSteps{
    NewsKinoPage newsKinoPage = null;

    public NewsSteps(WebDriver driver) {
        super(driver);
        newsKinoPage = PageFactory.initElements(getDriver(), NewsKinoPage.class);
    }

    @Step("Open page")
    public void open() {
        newsKinoPage.open();
    }
}
