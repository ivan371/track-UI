package horo.month.tab;

import horo.month.data.HoroMonthData;
import horo.month.tabs.steps.HoroTabSteps;
import horo.month.tabs.steps.elements.HoroTabStepsElement;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import source.driver.DriverProvider;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

@DisplayName("Проверяем клил по тегу январь /moon_calendar проекта \"horo\"")
public class ClickHoroTagTest {
    private DriverProvider driverProvider = null;
    private  HoroTabStepsElement horoTabStepsElement = null;
    private List<String> titles;
    private HoroTabSteps horoLinkSteps = null;

    @Before
    public void initDriver() {
        driverProvider = new DriverProvider();
    }

    @After
    public void closeDriver() {
        driverProvider.closeDriver();
    }

    public void checkMonth(HoroMonthData horoMonthData) {
        // after click link horoMonthData should be active
        horoTabStepsElement.clickFilterTab(horoMonthData);
        horoTabStepsElement.filterTabShouldBeActive(horoMonthData);

        // other links shouldn't be active
        Arrays.stream(HoroMonthData.values())
                .filter(horo -> horo != horoMonthData)
                .forEach(horoTabStepsElement::filterTabShouldNotBePresent);

        horoLinkSteps.horoItemsShouldBeChanged(titles);
    }

    @Test
    @Severity(SeverityLevel.BLOCKER)
    public void click_january_horo_link() {
        horoLinkSteps = new HoroTabSteps((driverProvider.getDriver()));
        horoLinkSteps.open("Лунно-солнечный прогноз на месяц");

        titles = horoLinkSteps.getAllHoroItemTitles();

        // link january should be active
        horoTabStepsElement = new HoroTabStepsElement(driverProvider.getDriver());
        horoTabStepsElement.filterTabShouldBeActive(HoroMonthData.January);


        checkMonth(HoroMonthData.February);
        checkMonth(HoroMonthData.March);
        checkMonth(HoroMonthData.April);
        checkMonth(HoroMonthData.May);
        checkMonth(HoroMonthData.June);
        checkMonth(HoroMonthData.July);
        checkMonth(HoroMonthData.August);
    }
}
