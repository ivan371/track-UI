package news.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import source.elements.Component;
import source.elements.ComponentObject;

@Component(xpath = "//iframe[contains(@class,'instagram-media')]")
public class InstagramPostComponent extends ComponentObject {
    public InstagramPostComponent(WebDriver driver) {
        super(driver);
    }

    private final String locator = "//iframe[contains(@class,'instagram-media')]";

    public WebElement WaitLoadingInstagram() {
        return (WebElement) waitTools.waitForAction(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }
}
