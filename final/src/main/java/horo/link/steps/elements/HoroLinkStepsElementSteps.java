package horo.link.steps.elements;

import horo.data.HoroData;
import horo.link.elements.HoroLinkMonthElement;
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

    @Step("Проверяем, что вкладка {horoData.getName} активна в фильтре")
    public void filterTabShouldBeActive(HoroData horoData) {
        assertTrue(String.format("Вкладка фильтра %s должна быть активна", horoData.getNameWithYear(year)),
                getHoroLinkElement().isFilterLinkActive(horoData));
    }

    @Step("Проверяем, что вкладка {horoData.getName} не активна в фильтре")
    public void filterTabShouldNotBePresent(HoroData horoData) {
        assertTrue(String.format("Вкладка фильтра %s не должна быть активна", horoData.getNameWithYear(year)),
                getHoroLinkElement().isFilterTabNotActive(horoData));
    }

    @Step("Кликаем на вкладку {horoData.getName}")
    public void clickFilterTab(HoroData horoData) {
        getHoroLinkElement().clickFilterTab(horoData);
    }
}
