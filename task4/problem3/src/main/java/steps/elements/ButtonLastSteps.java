package steps.elements;

import elements.ButtonLast;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import steps.AbstractSteps;

import static junit.framework.TestCase.assertTrue;

public class ButtonLastSteps extends AbstractSteps {
    public ButtonLastSteps(WebDriver driver) {
        super(driver);
    }

    private ButtonLast buttonLast = null;

    private ButtonLast getButtonLast() {
        if (buttonLast == null) {
            buttonLast = PageFactory.initElements(getDriver(), ButtonLast.class);
        }
        return buttonLast;
    }

    @Step("Check next button exists")
    public void existsLastButton() {
        assertTrue("Last button must exists", getButtonLast().lastButtonExists());
    }

    @Step("Check next button not exists")
    public void notExistsLastButton() {
        assertTrue("Last button mustn't exists", getButtonLast().lastButtonNotExists());
    }

    @Step("Check next button displayed")
    public void displayedLastButton() {
        assertTrue("Last button must displayed", getButtonLast().lastButtonDisplayed());
    }

    @Step("Check next button not displayed")
    public void notDisplayedLastButton() {
        assertTrue("Last button must displayed", !getButtonLast().lastButtonDisplayed());
    }

    @Step("Click last button")
    public void clickLastButton() {
        getButtonLast().clickLastButton();
    }
}
