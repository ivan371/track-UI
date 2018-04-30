package news.steps.elements;

import io.qameta.allure.Step;
import news.elements.SliderComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import news.steps.AbstractSteps;

import static junit.framework.TestCase.assertTrue;

public class SliderStepsComponent extends AbstractSteps {
    public SliderStepsComponent(WebDriver driver) {
        super(driver);
    }

    private SliderComponent sliderComponent = null;

    private SliderComponent getPhotoComponent() {
        if (sliderComponent == null) {
            sliderComponent = PageFactory.initElements(getDriver(), SliderComponent.class);
        }
        return sliderComponent;
    }

    @Step("Slider Exists")
    public void sliderExists() {
        assertTrue("slider must exists", getPhotoComponent().isSliderButtonExists());
    }

    @Step("Click slider")
    public void sliderClick() {
        getPhotoComponent().sliderClick();
    }

    @Step("Get slider")
    public WebElement getSlider() {
        return getPhotoComponent().getSlider();
    }
}
