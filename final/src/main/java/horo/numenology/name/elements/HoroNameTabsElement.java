package horo.numenology.name.elements;

import horo.numenology.name.data.HoroNameData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import source.elements.Component;
import source.elements.ComponentObject;

@Component(xpath = "//div[contains(@class, 'filter__list')]")
public class HoroNameTabsElement extends ComponentObject {
    public HoroNameTabsElement(WebDriver driver) {
        super(driver);
    }

    private final String horoTabsFilterTabLocator = "//*[contains(@class, 'filter__item')][.//span[contains(@class, 'filter__text')][text() = '%s']]";
    // Is link active
    public boolean isFilterTabActive(HoroNameData horoNameData) {
        String locator = String.format(horoTabsFilterTabLocator, horoNameData.getName());
        return waitTools.waitForCondition(ExpectedConditions.attributeContains(By.xpath(locator), "class", "filter__item_active"));
    }

    // Is link not active
    public boolean isFilterTabNotActive(HoroNameData horoNameData) {
        String locator = String.format(horoTabsFilterTabLocator, horoNameData.getName());
        return waitTools.waitForCondition(ExpectedConditions.not(ExpectedConditions.attributeContains(By.xpath(locator), "class", "filter__item_active")));
    }

    public void clickFilterTab(HoroNameData horoNameData) {
        String locator = String.format(horoTabsFilterTabLocator, horoNameData.getName());
        getDriver().findElement(By.xpath(locator)).click();
    }
}
