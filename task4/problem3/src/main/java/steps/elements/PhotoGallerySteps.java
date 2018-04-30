package steps.elements;

import elements.PhotoGallery;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import steps.AbstractSteps;

import static junit.framework.TestCase.assertTrue;

public class PhotoGallerySteps extends AbstractSteps {
    public PhotoGallerySteps(WebDriver driver) {
        super(driver);
    }

    private PhotoGallery photoGallery = null;

    private PhotoGallery getPhotoGallery () {
        if (photoGallery == null) {
            photoGallery = PageFactory.initElements(getDriver(), PhotoGallery.class);
        }
        return photoGallery;
    }

    @Step("Photo gallery exists")
    public void photoGalleryExists() {
        assertTrue("Photo gallery must exists", getPhotoGallery().photoGalleryExists());
    }

    @Step("CLick photo gallery")
    public void clickPhotoGallery() {
        getPhotoGallery().clickPhotoGallery();
    }
}
