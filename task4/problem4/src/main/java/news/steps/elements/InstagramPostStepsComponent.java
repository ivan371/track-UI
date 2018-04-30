package news.steps.elements;

import io.qameta.allure.Step;
import news.elements.InstagramPostComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import news.steps.AbstractSteps;

import static junit.framework.TestCase.assertTrue;

public class InstagramPostStepsComponent extends AbstractSteps {
    public InstagramPostStepsComponent(WebDriver driver) {
        super(driver);
    }

    private InstagramPostComponent instagramPostComponent = null;

    private InstagramPostComponent getInstagramPostComponent() {
        if (instagramPostComponent == null) {
            instagramPostComponent = PageFactory.initElements(getDriver(), InstagramPostComponent.class);
        }
        return instagramPostComponent;
    }

    @Step("Wait instagram loading")
    public void waitInstagramLoading() {
        assertTrue("Instagram loading", getInstagramPostComponent().waitLoadingInstagram());
    }

    @Step("Get instagram page")
    public WebElement getInstagramPage() {
        return getInstagramPostComponent().getInstagramFrame();
    }
}
