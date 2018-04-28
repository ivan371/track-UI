package lady.search;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.junit4.DisplayName;
import lady.search.pages.elements.LadySearchInputStepsElement;
import lady.search.steps.LadySearchSteps;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import source.driver.DriverProvider;

import java.util.Arrays;
import java.util.List;

@DisplayName("Check difference between titles in search results")
public class LadySearchTitlesDifferentTest {
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
    public void lady_search_titles() {
        LadySearchSteps ladySearchSteps = new LadySearchSteps(driverProvider.getDriver());
        ladySearchSteps.open();

        // enter value Паста in input form
        LadySearchInputStepsElement ladySearchInputStepsElement = new LadySearchInputStepsElement(driverProvider.getDriver());
        ladySearchInputStepsElement.enterInputForm("паста");
        ladySearchInputStepsElement.submitInputForm();

        // check difference between titles
        ladySearchSteps.ladySearchTitlesSimilar();
    }
}
