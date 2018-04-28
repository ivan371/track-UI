package horo.month.link.steps.elements;

import horo.month.data.HoroMonthData;
import horo.month.link.elements.HoroLinkMonthElement;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import source.steps.AbstractSteps;

import static org.junit.Assert.assertTrue;


public class HoroLinkStepsElementSteps extends AbstractSteps {
    public HoroLinkStepsElementSteps(WebDriver driver) {
        super(driver);
    }

    private HoroLinkMonthElement horoLinkMonthElement = null;

    private final String year = "2017";

    private HoroLinkMonthElement getHoroLinkElement() {
        if(horoLinkMonthElement == null)
            horoLinkMonthElement = PageFactory.initElements(getDriver(), HoroLinkMonthElement.class);
        return horoLinkMonthElement;
    }

    @Step("{horoMonthData.getName} should be active")
    public void filterTabShouldBeActive(HoroMonthData horoMonthData) {
        assertTrue(String.format("%s should be active", horoMonthData.getNameWithYear(year)),
                getHoroLinkElement().isFilterLinkActive(horoMonthData));
    }

    @Step("{horoMonthData.getName} shouldn't be active")
    public void filterTabShouldNotBePresent(HoroMonthData horoMonthData) {
        assertTrue(String.format("%s shouldn't be active", horoMonthData.getNameWithYear(year)),
                getHoroLinkElement().isFilterLinkNotActive(horoMonthData));
    }

    @Step("click {horoMonthData.getName}")
    public void clickFilterTab(HoroMonthData horoMonthData) {
        getHoroLinkElement().clickFilterLink(horoMonthData);
    }
}
