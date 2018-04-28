package horo.numenology.name.steps.elements;


import horo.numenology.name.data.HoroNameData;
import horo.numenology.name.elements.HoroNameTabsElement;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import source.steps.AbstractSteps;

import static org.junit.Assert.assertTrue;

public class HoroNameTabsStepsElement extends AbstractSteps {

    public HoroNameTabsStepsElement(WebDriver driver) {
        super(driver);
    }

    private HoroNameTabsElement horoTabsMonthElement = null;

    private HoroNameTabsElement getTabLinkElement() {
        if(horoTabsMonthElement == null)
            horoTabsMonthElement = PageFactory.initElements(getDriver(), HoroNameTabsElement.class);
        return horoTabsMonthElement;
    }

    @Step("{horoMonthData.getName} should be active")
    public void filterTabShouldBeActive(HoroNameData horoNameData) {
        assertTrue(String.format("%s should be active", horoNameData.getName()),
                getTabLinkElement().isFilterTabActive(horoNameData));
    }

    @Step("{horoMonthData.getName} shouldn't be active")
    public void filterTabShouldNotBePresent(HoroNameData horoNameData) {
        assertTrue(String.format("%s shouldn't be active", horoNameData.getName()),
                getTabLinkElement().isFilterTabNotActive(horoNameData));
    }

    @Step("click {horoMonthData.getName}")
    public void clickFilterTab(HoroNameData horoNameData) {
        getTabLinkElement().clickFilterTab(horoNameData);
    }
}
