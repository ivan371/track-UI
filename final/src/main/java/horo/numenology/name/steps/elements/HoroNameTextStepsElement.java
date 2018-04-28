package horo.numenology.name.steps.elements;

import horo.numenology.name.elements.HoroNameTextElement;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import source.steps.AbstractSteps;
import static org.junit.Assert.assertTrue;

public class HoroNameTextStepsElement extends AbstractSteps {
    public HoroNameTextStepsElement(WebDriver driver) {
        super(driver);
    }

    HoroNameTextElement horoNameTextElement = null;

    private HoroNameTextElement getHoroNameTextElement() {
        if (horoNameTextElement == null) {
            horoNameTextElement = PageFactory.initElements(getDriver(), HoroNameTextElement.class);
        }
        return horoNameTextElement;
    }

    @Step("Text should contains name")
    public void textContainsName(String text) {
        assertTrue(String.format("Text should contains %s", text),
                getHoroNameTextElement().isTextContainsName(text));
    }
}
