package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class BaseComponent {
    private WebDriver driver = null;
    private WebElement component = null;

    public BaseComponent(WebDriver driver) {
        this.driver = driver;
    }

    public void setComponent(By finder) {
        this.component = driver.findElement(finder);
    }

    public boolean isComponentPresent() {
        return component.isDisplayed();
    }

    WebDriver getDriver() {
        return driver;
    }
}
