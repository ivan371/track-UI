package news.steps.elements;

import io.qameta.allure.Step;
import news.elements.PhotoComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import news.steps.AbstractSteps;

import static junit.framework.TestCase.assertTrue;

public class PhotoStepsComponent extends AbstractSteps {
    public PhotoStepsComponent(WebDriver driver) {
        super(driver);
    }

    private PhotoComponent photoComponent = null;

    private PhotoComponent getPhotoComponent() {
        if (photoComponent == null) {
            photoComponent = PageFactory.initElements(getDriver(), PhotoComponent.class);
        }
        return photoComponent;
    }

    @Step("Photo must exist")
    public void isPhotoComponentExist() {
        assertTrue("photo must exist", getPhotoComponent().isPhotoExists());
    }

    @Step("Get photo component")
    public WebElement getPhoto() {
        return getPhotoComponent().getPhoto();
    }
}
