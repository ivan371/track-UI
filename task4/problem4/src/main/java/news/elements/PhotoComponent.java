package news.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import source.elements.Component;
import source.elements.ComponentObject;

@Component(xpath = "//div[@class='EmbedSidecar']")
public class PhotoComponent extends ComponentObject {
    public PhotoComponent(WebDriver driver) {
        super(driver);
    }

    private final String locator = "//div[@class='EmbedSidecar']";

    public boolean isPhotoExists() {
        return waitTools.waitForCondition(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    public WebElement getPhoto() {
        return getDriver().findElement(By.xpath(locator));
    }
}
