package horo.numenology.name.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import source.elements.Component;
import source.elements.ComponentObject;

@Component(xpath = "//div[contains(@class, 'p-item')]")
public class HoroNameTextElement extends ComponentObject {
    public HoroNameTextElement(WebDriver driver) {
        super(driver);
    }

    private String horoNameText = "//div[contains(@class, 'p-item')]//div[contains(@class, 'text')][text() = 'полное имя: %s']";

    // is element contains {text}
    public boolean isTextContainsName(String text) {
        String locator = String.format(horoNameText, text);
        return getDriver().findElement(By.xpath(locator)).isDisplayed();
    }
}
