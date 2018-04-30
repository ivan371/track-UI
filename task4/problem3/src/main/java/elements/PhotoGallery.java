package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

@Component(xpath = "//span[contains(@class,'js-show_photo')]")
public class PhotoGallery extends ComponentObject {
    public PhotoGallery(WebDriver driver) {
        super(driver);
    }

    private final String locator = "//span[contains(@class,'js-show_photo')]";

    public boolean photoGalleryExists() {
        return waitTools.waitForCondition(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    public void clickPhotoGallery() {
        getDriver().findElement(By.xpath(locator)).click();
    }
}
