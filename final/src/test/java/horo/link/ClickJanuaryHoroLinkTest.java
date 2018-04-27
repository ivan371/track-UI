package horo.link;

import horo.data.HoroData;
import horo.link.steps.HoroLinkSteps;
import horo.link.steps.elements.HoroLinkStepsElementSteps;
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
    public void click_milota_filter_cats_pet_tab() {
        HoroLinkSteps horoLinkSteps = new HoroLinkSteps((driverProvider.getDriver()));
        horoLinkSteps.open("Лунно-солнечный прогноз на месяц");

        List<String> titles = horoLinkSteps.getAllHoroItemTitles();

        // link january should be active
        HoroLinkStepsElementSteps horoLinkStepsElementSteps = new HoroLinkStepsElementSteps(driverProvider.getDriver());
        horoLinkStepsElementSteps.filterTabShouldBeActive(HoroData.January);

        // after click link february should be active
        horoLinkStepsElementSteps.clickFilterTab(HoroData.February);
        horoLinkStepsElementSteps.filterTabShouldBeActive(HoroData.February);

        // other links shouldn't be active
        Arrays.stream(HoroData.values())
                .filter(horo -> horo != HoroData.February)
                .forEach(horoLinkStepsElementSteps::filterTabShouldNotBePresent);

        horoLinkSteps.horoItemsShouldBeChanged(titles);
    }
}
