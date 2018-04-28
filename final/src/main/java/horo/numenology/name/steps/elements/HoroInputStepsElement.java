package horo.numenology.name.steps.elements;

import horo.numenology.name.elements.HoroInputElement;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import source.steps.AbstractSteps;

import static org.junit.Assert.assertTrue;

public class HoroInputStepsElement extends AbstractSteps {
    public HoroInputStepsElement(WebDriver driver) {
        super(driver);
    }

    private HoroInputElement horoInputElement = null;

    private HoroInputElement getTabNameElement() {
        if(horoInputElement == null)
            horoInputElement = PageFactory.initElements(getDriver(), HoroInputElement.class);
        return horoInputElement;
    }


    @Step("enter {value}")
    public void enterInputName(String value) {
        getTabNameElement().enterNameInput(value);
    }

    @Step("click button")
    public void clickButton() {
        getTabNameElement().sendText();
    }
}
