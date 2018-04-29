package news.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import source.elements.Component;
import source.elements.ComponentObject;

@Component(xpath = "//a[contains(@class,'coreSpriteRightChevron')]")
public class FirstPhotoComponent extends ComponentObject {
    public FirstPhotoComponent(WebDriver driver) {
        super(driver);
    }

    private final String locator = "//a[contains(@class,'coreSpriteRightChevron')]";

    public boolean isSliderButtonExists() {
        return waitTools.waitForCondition(ExpectedConditions.not(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator))));
    }

    public void sliderClick() {
        getDriver().findElement(By.xpath(locator)).click();
    }
}
