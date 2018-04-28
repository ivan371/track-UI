package horo.month.link;

import horo.month.data.HoroMonthData;
import horo.month.link.steps.HoroLinkSteps;
import horo.month.link.steps.elements.HoroLinkStepsElementSteps;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import source.driver.DriverProvider;

import java.util.Arrays;
import java.util.List;

@DisplayName("Проверяем клил по ссылке январь /moon_calendar проекта \"horo\"")
public class ClickJanuaryHoroLinkTest {
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
    public void click_january_link() {
        HoroLinkSteps horoLinkSteps = new HoroLinkSteps((driverProvider.getDriver()));
        horoLinkSteps.open("Лунно-солнечный прогноз на месяц");

        List<String> titles = horoLinkSteps.getAllHoroItemTitles();

        // link january should be active
        HoroLinkStepsElementSteps horoLinkStepsElementSteps = new HoroLinkStepsElementSteps(driverProvider.getDriver());
        horoLinkStepsElementSteps.filterTabShouldBeActive(HoroMonthData.January);

        // after click link february should be active
        horoLinkStepsElementSteps.clickFilterTab(HoroMonthData.February);
        horoLinkStepsElementSteps.filterTabShouldBeActive(HoroMonthData.February);

        // other links shouldn't be active
        Arrays.stream(HoroMonthData.values())
                .filter(horo -> horo != HoroMonthData.February)
                .forEach(horoLinkStepsElementSteps::filterTabShouldNotBePresent);

        horoLinkSteps.horoItemsShouldBeChanged(titles);
    }
}
