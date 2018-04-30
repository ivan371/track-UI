package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


@Component(xpath = "//span[contains(@class,'icon_control_previous')]")
public class ButtonLast extends ComponentObject {
    public ButtonLast(WebDriver driver) {
        super(driver);
    }

    private final String locator = "//span[contains(@class,'icon_control_previous')]";

    public boolean lastButtonExists() {
        return waitTools.waitForCondition(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    public boolean lastButtonNotExists() {
        return waitTools.waitForCondition(ExpectedConditions.not(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator))));
    }

    public void clickLastButton() {
        getDriver().findElement(By.xpath(locator)).click();
    }

    public boolean lastButtonDisplayed() {
        return getDriver().findElement(By.xpath(locator)).isDisplayed();
    }
}
