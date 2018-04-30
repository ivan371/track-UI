package steps.elements;

import elements.ButtonNext;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import steps.AbstractSteps;

import static junit.framework.TestCase.assertTrue;

public class ButtonNextSteps extends AbstractSteps {
    public ButtonNextSteps(WebDriver driver) {
        super(driver);
    }

    private ButtonNext buttonNext = null;

    private ButtonNext getButtonNext() {
        if (buttonNext == null) {
            buttonNext = PageFactory.initElements(getDriver(), ButtonNext.class);
        }
        return buttonNext;
    }

    @Step("Check next button exists")
    public void existsNextButton() {
        assertTrue("Next button must exists", getButtonNext().nextButtonExists());
    }

    @Step("Check next button displayed")
    public void displayedNextButton() {
        assertTrue("Next button must displayed", getButtonNext().nextButtonDisplayed());
    }

    @Step("Click next button")
    public void clickNextButton() {
        getButtonNext().clickNextButton();
    }
}
