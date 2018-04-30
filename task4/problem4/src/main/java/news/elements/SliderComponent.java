package news.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

@Component(xpath = "//a[contains(@class,'coreSpriteRightChevron')]")
public class SliderComponent extends ComponentObject {
    public SliderComponent(WebDriver driver) {
        super(driver);
    }

    private final String locator = "//a[contains(@class,'coreSpriteRightChevron')]";

    public boolean isSliderButtonExists() {
        return waitTools.waitForCondition(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    public void sliderClick() {
        getDriver().findElement(By.xpath(locator)).click();
    }

    public WebElement getSlider() {
        return getDriver().findElement(By.xpath(locator));
    }
}
