package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


@Component(xpath = "//span[contains(@class,'icon_control_next')]")
public class ButtonNext extends ComponentObject {
    public ButtonNext(WebDriver driver) {
        super(driver);
    }

    private final String locator = "//span[contains(@class,'icon_control_next')]";

    public boolean nextButtonExists() {
        return waitTools.waitForCondition(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    public void clickNextButton() {
        getDriver().findElement(By.xpath(locator)).click();
    }

    public boolean nextButtonDisplayed() {
        return getDriver().findElement(By.xpath(locator)).isDisplayed();
    }
}
