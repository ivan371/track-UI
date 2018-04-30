package news.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@Component(xpath = "//textarea[contains(@class,'lazyembed-textarea')]")
public class TextAreaInstagramPostComponent extends ComponentObject{
    public TextAreaInstagramPostComponent(WebDriver driver) {
        super(driver);
    }

    private final String locator = "//textarea[contains(@class,'lazyembed-textarea')]";

    public WebElement getInstagramPost() {
        return getDriver().findElement(By.xpath(locator));
    }
}
