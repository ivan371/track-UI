package horo.month.link.elements;

import horo.month.data.HoroMonthData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import source.elements.Component;
import source.elements.ComponentObject;

// Month links filter

@Component(xpath = "//*[contains(@class, 'p-content-menu')]")
public class HoroLinkMonthElement extends ComponentObject {
    public HoroLinkMonthElement(WebDriver driver) {
        super(driver);
    }

    // If link is selected the element is span
    private final String horoLinksFilterTabLocator = "//*[contains(@class, 'link')][.//span[contains(@class, 'link__text')][text()='%s']]";
    private final String year = "2017";

    // Is link active
    public boolean isFilterLinkActive(HoroMonthData horoMonthData) {
        String locator = String.format(horoLinksFilterTabLocator, horoMonthData.getNameWithYear(year));
        return waitTools.waitForCondition(ExpectedConditions.attributeContains(By.xpath(locator), "class", "link_active"));
    }

    // Is link not active
    public boolean isFilterLinkNotActive(HoroMonthData horoMonthData) {
        String locator = String.format(horoLinksFilterTabLocator, horoMonthData.getNameWithYear(year));
        return waitTools.waitForCondition(ExpectedConditions.not(ExpectedConditions.attributeContains(By.xpath(locator), "class", "link_active")));
    }

    public void clickFilterLink(HoroMonthData horoMonthData) {
        String locator = String.format(horoLinksFilterTabLocator, horoMonthData.getNameWithYear(year));
        getDriver().findElement(By.xpath(locator)).click();
    }
}
