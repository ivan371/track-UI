package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// Click to button show more
@Component(xpath = "//button[contains(@class,'js-pgng_more_link')]")
public class ClickButtonComponent extends ComponentObject {
    public ClickButtonComponent(WebDriver driver) {
        super(driver);
    }

    private final String locator = "//button[contains(@class,'js-pgng_more_link')]";

    public void clickButtonShowMore() {
        getDriver().findElement(By.xpath(locator)).click();
    }
}
