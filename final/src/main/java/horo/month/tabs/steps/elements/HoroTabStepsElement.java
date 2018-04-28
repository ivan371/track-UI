package horo.month.tabs.steps.elements;

import horo.month.data.HoroMonthData;
import horo.month.tabs.elements.HoroTabsMonthElement;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import source.steps.AbstractSteps;

import static org.junit.Assert.assertTrue;

public class HoroTabStepsElement extends AbstractSteps {
    public HoroTabStepsElement(WebDriver driver) {
        super(driver);
    }

    private HoroTabsMonthElement horoTabsMonthElement = null;

    private HoroTabsMonthElement getTabLinkElement() {
        if(horoTabsMonthElement == null)
            horoTabsMonthElement = PageFactory.initElements(getDriver(), HoroTabsMonthElement.class);
        return horoTabsMonthElement;
    }

    @Step("{horoMonthData.getName} should be active")
    public void filterTabShouldBeActive(HoroMonthData horoMonthData) {
        assertTrue(String.format("%s should be active", horoMonthData.getName()),
                getTabLinkElement().isFilterTabActive(horoMonthData));
    }

    @Step("{horoMonthData.getName} shouldn't be active")
    public void filterTabShouldNotBePresent(HoroMonthData horoMonthData) {
        assertTrue(String.format("%s shouldn't be active", horoMonthData.getName()),
                getTabLinkElement().isFilterTabNotActive(horoMonthData));
    }

    @Step("click {horoMonthData.getName}")
    public void clickFilterTab(HoroMonthData horoMonthData) {
        getTabLinkElement().clickFilterTab(horoMonthData);
    }
}
