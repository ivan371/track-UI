package steps.elements;

import elements.ClickButtonComponent;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import steps.AbstractSteps;

public class ClickButtonStepsComponent extends AbstractSteps {
    public ClickButtonStepsComponent(WebDriver driver) {
        super(driver);
    }

    private ClickButtonComponent clickButtonComponent = null;

    private ClickButtonComponent getClickButtonComponent() {
        if (clickButtonComponent == null) {
            clickButtonComponent = PageFactory.initElements(getDriver(), ClickButtonComponent.class);
        }
        return clickButtonComponent;
    }

    @Step("Click to button show more")
    public void clickButtonShowMore() {
        getClickButtonComponent().clickButtonShowMore();
    }
}
