package horo.month.tab;

import horo.month.data.HoroMonthData;
import horo.month.tabs.steps.HoroTabSteps;
import horo.month.tabs.steps.elements.HoroTabStepsElement;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import source.driver.DriverProvider;

import java.util.Arrays;
import java.util.List;

public class ClickHoroTagTest {
    private DriverProvider driverProvider = null;

    @Before
    public void initDriver() {
        driverProvider = new DriverProvider();
    }

    @After
    public void closeDriver() {
        driverProvider.closeDriver();
    }

    @Test
    @Severity(SeverityLevel.BLOCKER)
    public void click_january_horo_link() {
        HoroTabSteps horoLinkSteps = new HoroTabSteps((driverProvider.getDriver()));
        horoLinkSteps.open("Лунно-солнечный прогноз на месяц");

        List<String> titles = horoLinkSteps.getAllHoroItemTitles();

        // link january should be active
        HoroTabStepsElement horoTabStepsElement = new HoroTabStepsElement(driverProvider.getDriver());
        horoTabStepsElement.filterTabShouldBeActive(HoroMonthData.January);

        // after click link february should be active
        horoTabStepsElement.clickFilterTab(HoroMonthData.February);
        horoTabStepsElement.filterTabShouldBeActive(HoroMonthData.February);

        // other links shouldn't be active
        Arrays.stream(HoroMonthData.values())
                .filter(horo -> horo != HoroMonthData.February)
                .forEach(horoTabStepsElement::filterTabShouldNotBePresent);

        horoLinkSteps.horoItemsShouldBeChanged(titles);


        // after click link match should be active
        horoTabStepsElement.clickFilterTab(HoroMonthData.March);
        horoTabStepsElement.filterTabShouldBeActive(HoroMonthData.March);

        // other links shouldn't be active
        Arrays.stream(HoroMonthData.values())
                .filter(horo -> horo != HoroMonthData.March)
                .forEach(horoTabStepsElement::filterTabShouldNotBePresent);

        horoLinkSteps.horoItemsShouldBeChanged(titles);

        // after click link april should be active
        horoTabStepsElement.clickFilterTab(HoroMonthData.April);
        horoTabStepsElement.filterTabShouldBeActive(HoroMonthData.April);

        // other links shouldn't be active
        Arrays.stream(HoroMonthData.values())
                .filter(horo -> horo != HoroMonthData.April)
                .forEach(horoTabStepsElement::filterTabShouldNotBePresent);

        horoLinkSteps.horoItemsShouldBeChanged(titles);

        // after click link may should be active
        horoTabStepsElement.clickFilterTab(HoroMonthData.May);
        horoTabStepsElement.filterTabShouldBeActive(HoroMonthData.May);

        // other links shouldn't be active
        Arrays.stream(HoroMonthData.values())
                .filter(horo -> horo != HoroMonthData.May)
                .forEach(horoTabStepsElement::filterTabShouldNotBePresent);

        horoLinkSteps.horoItemsShouldBeChanged(titles);

        // after click link june should be active
        horoTabStepsElement.clickFilterTab(HoroMonthData.June);
        horoTabStepsElement.filterTabShouldBeActive(HoroMonthData.June);

        // other links shouldn't be active
        Arrays.stream(HoroMonthData.values())
                .filter(horo -> horo != HoroMonthData.June)
                .forEach(horoTabStepsElement::filterTabShouldNotBePresent);

        horoLinkSteps.horoItemsShouldBeChanged(titles);

        // after click link july should be active
        horoTabStepsElement.clickFilterTab(HoroMonthData.July);
        horoTabStepsElement.filterTabShouldBeActive(HoroMonthData.July);

        // other links shouldn't be active
        Arrays.stream(HoroMonthData.values())
                .filter(horo -> horo != HoroMonthData.July)
                .forEach(horoTabStepsElement::filterTabShouldNotBePresent);

        horoLinkSteps.horoItemsShouldBeChanged(titles);

        // after click link august should be active
        horoTabStepsElement.clickFilterTab(HoroMonthData.August);
        horoTabStepsElement.filterTabShouldBeActive(HoroMonthData.August);

        // other links shouldn't be active
        Arrays.stream(HoroMonthData.values())
                .filter(horo -> horo != HoroMonthData.August)
                .forEach(horoTabStepsElement::filterTabShouldNotBePresent);

        horoLinkSteps.horoItemsShouldBeChanged(titles);
    }
}
