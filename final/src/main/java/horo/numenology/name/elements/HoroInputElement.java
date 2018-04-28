package horo.numenology.name.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import source.elements.Component;
import source.elements.ComponentObject;

@Component(xpath = "//div[contains(@class, 'p-tabs__item_active')]")
public class HoroInputElement extends ComponentObject {
    public HoroInputElement(WebDriver driver) {
        super(driver);
    }

    private final String horoInputNameLocator = "//div[contains(@class, 'p-tabs__item_active')]//input[@name='v1']";
    private final String horoButtonNameLocator = "//div[contains(@class, 'p-tabs__item_active')]//button[contains(@class, 'button')]";

    public void enterNameInput(String value) {
        getDriver().findElement(By.xpath(horoInputNameLocator)).sendKeys(value);
    }

    public void sendText() {
        getDriver().findElement(By.xpath(horoButtonNameLocator)).click();
    }
}
