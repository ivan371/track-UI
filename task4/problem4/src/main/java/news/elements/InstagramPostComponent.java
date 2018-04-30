package news.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

@Component(xpath = "//iframe[contains(@class,'instagram-media')]")
public class InstagramPostComponent extends ComponentObject {
    public InstagramPostComponent(WebDriver driver) {
        super(driver);
    }

    private final String locator = "//iframe[contains(@class,'instagram-media')]";

    public boolean waitLoadingInstagram() {
        return waitTools.waitForCondition(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    public WebElement getInstagramFrame() {
        return getDriver().findElement(By.xpath(locator));
    }
}
