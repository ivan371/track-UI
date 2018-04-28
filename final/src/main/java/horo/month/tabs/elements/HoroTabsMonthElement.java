package horo.month.tabs.elements;

import horo.month.data.HoroMonthData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import source.elements.Component;
import source.elements.ComponentObject;


@Component(xpath = "//div[contains(@class, 'filter__list')]")
public class HoroTabsMonthElement extends ComponentObject {
    public HoroTabsMonthElement(WebDriver driver) {
        super(driver);
    }

    private final String horoTabsFilterTabLocator = "//*[contains(@class, 'filter__item')][.//span[contains(@class, 'filter__text')][text() = '%s']]";

    // Is link active
    public boolean isFilterTabActive(HoroMonthData horoMonthData) {
        String locator = String.format(horoTabsFilterTabLocator, horoMonthData.getName());
        return waitTools.waitForCondition(ExpectedConditions.attributeContains(By.xpath(locator), "class", "filter__item_active"));
    }

    // Is link not active
    public boolean isFilterTabNotActive(HoroMonthData horoMonthData) {
        String locator = String.format(horoTabsFilterTabLocator, horoMonthData.getName());
        return waitTools.waitForCondition(ExpectedConditions.not(ExpectedConditions.attributeContains(By.xpath(locator), "class", "filter__item_active")));
    }

    public void clickFilterTab(HoroMonthData horoMonthData) {
        String locator = String.format(horoTabsFilterTabLocator, horoMonthData.getName());
        getDriver().findElement(By.xpath(locator)).click();
    }
}
