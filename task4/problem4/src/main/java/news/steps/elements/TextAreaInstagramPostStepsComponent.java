package news.steps.elements;

import io.qameta.allure.Step;
import news.elements.TextAreaInstagramPostComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import news.steps.AbstractSteps;

public class TextAreaInstagramPostStepsComponent extends AbstractSteps {
    public TextAreaInstagramPostStepsComponent(WebDriver driver) {
        super(driver);
    }

    private TextAreaInstagramPostComponent textAreaInstagramPostComponent = null;

    private TextAreaInstagramPostComponent getTextAreaInstagramPostComponent() {
        if (textAreaInstagramPostComponent == null) {
            textAreaInstagramPostComponent = PageFactory.initElements(getDriver(), TextAreaInstagramPostComponent.class);
        }
        return textAreaInstagramPostComponent;
    }

    @Step("Get instagram post")
    public WebElement getInstagramPost() {
        return getTextAreaInstagramPostComponent().getInstagramPost();
    }
}
