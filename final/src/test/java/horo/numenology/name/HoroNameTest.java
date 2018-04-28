package horo.numenology.name;

import horo.numenology.name.data.HoroNameData;
import horo.numenology.name.steps.HoroNameSteps;
import horo.numenology.name.steps.elements.HoroNameTextStepsElement;
import horo.numenology.name.steps.elements.HoroInputStepsElement;
import horo.numenology.name.steps.elements.HoroNameTabsStepsElement;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import source.driver.DriverProvider;

import java.util.Arrays;

@DisplayName("Проверяем корректрую работу числовой вибрации имени по душе")
public class HoroNameTest {
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
    public void horo_name_test() {
        HoroNameSteps horoNameSteps = new HoroNameSteps((driverProvider.getDriver()));
        horoNameSteps.open("Числовая вибрация имени");

        String article = horoNameSteps.getHoroNameArticle();

        // link peace should be active
        HoroNameTabsStepsElement horoNameTabsStepsElement = new HoroNameTabsStepsElement(driverProvider.getDriver());
        horoNameTabsStepsElement.filterTabShouldBeActive(HoroNameData.Peace);

        // after click tab spitit should be active
        horoNameTabsStepsElement.clickFilterTab(HoroNameData.Spirit);
        horoNameTabsStepsElement.filterTabShouldBeActive(HoroNameData.Spirit);

        Arrays.stream(HoroNameData.values())
                .filter(horo -> horo != HoroNameData.Spirit)
                .forEach(horoNameTabsStepsElement::filterTabShouldNotBePresent);
        horoNameSteps.horoItemsShouldBeChanged(article);

        article = horoNameSteps.getHoroNameArticle();
        // submit value test
        HoroInputStepsElement horoInputStepsElement = new HoroInputStepsElement(driverProvider.getDriver());
        horoInputStepsElement.enterInputName("Тест");
        horoInputStepsElement.clickButton();

        //Text should contains name
        HoroNameTextStepsElement horoNameTextStepsElement = new HoroNameTextStepsElement(driverProvider.getDriver());
        horoNameTextStepsElement.textContainsName("Тест");
    }
}
