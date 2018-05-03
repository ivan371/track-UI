package lady.search;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.junit4.DisplayName;
import lady.search.steps.LadySearchSteps;
import lady.search.steps.elements.LadySearchInputStepsElement;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import source.driver.DriverProvider;

@DisplayName("Check input form")
public class LadySearchInputFormTest {
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
    public void lady_search_input() {
        LadySearchSteps ladySearchSteps = new LadySearchSteps(driverProvider.getDriver());
        ladySearchSteps.open();

        // enter value Паста in input form
        LadySearchInputStepsElement ladySearchInputStepsElement = new LadySearchInputStepsElement(driverProvider.getDriver());
        ladySearchInputStepsElement.enterInputForm("паста");

        // check text in input form
        ladySearchInputStepsElement.ladyInputValueEntered();
    }
}
