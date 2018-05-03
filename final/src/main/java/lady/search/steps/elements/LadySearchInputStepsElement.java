package lady.search.steps.elements;

import io.qameta.allure.Step;
import lady.search.elements.LadySearchInputElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import source.steps.AbstractSteps;

import static org.junit.Assert.assertTrue;

public class LadySearchInputStepsElement extends AbstractSteps {
    public LadySearchInputStepsElement(WebDriver driver) {
        super(driver);
    }

    private LadySearchInputElement ladySearchInputElement = null;

    private LadySearchInputElement getLadySearchInputElement() {
        if(ladySearchInputElement == null)
            ladySearchInputElement = PageFactory.initElements(getDriver(), LadySearchInputElement.class);
        return ladySearchInputElement;
    }

    @Step("enter {text}")
    public void enterInputForm(String text) {
        getLadySearchInputElement().enterLadySearchInput(text);
    }

    @Step("submit form")
    public void submitInputForm() {
        getLadySearchInputElement().submitLadySearchForm();
    }

    @Step("Check input value")
    public void ladyInputValueEntered() {
        assertTrue("Input form must contains value which we enter", getLadySearchInputElement().isInputValueEntered());
    }
}
