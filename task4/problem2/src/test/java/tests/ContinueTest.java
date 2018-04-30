package tests;

import driver.DriverProvider;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import steps.NewsSteps;
import steps.elements.ClickButtonStepsComponent;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class ContinueTest {
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
    public void continueButton() throws InterruptedException {
        NewsSteps newsSteps = new NewsSteps(driverProvider.getDriver());
        newsSteps.open();

        // Get old titles
        List<String> title = newsSteps.getAllArticlesTitles();

        // Click the button
        ClickButtonStepsComponent clickButtonStepsComponent = new ClickButtonStepsComponent(driverProvider.getDriver());
        clickButtonStepsComponent.clickButtonShowMore();

        // Check the articles list
        newsSteps.articlesTitlesShouldBeChanged(title);
    }
}
