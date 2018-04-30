package tests;

import driver.DriverProvider;
import elements.PhotoGallery;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import steps.NewsSteps;
import steps.elements.ButtonLastSteps;
import steps.elements.ButtonNextSteps;
import steps.elements.PhotoGallerySteps;

import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

@DisplayName("Check slider in instagram")
public class NewsTest {
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
    public void check_instagram() {
        NewsSteps newsSteps = new NewsSteps(driverProvider.getDriver());
        newsSteps.open();

        // Open gallery
        PhotoGallerySteps photoGallerySteps = new PhotoGallerySteps(driverProvider.getDriver());
        photoGallerySteps.photoGalleryExists();
        photoGallerySteps.clickPhotoGallery();

        ButtonNextSteps buttonNextSteps = new ButtonNextSteps(driverProvider.getDriver());
        ButtonLastSteps buttonLastSteps = new ButtonLastSteps(driverProvider.getDriver());

        // Check the existance of next and last button
        buttonNextSteps.existsNextButton();
        buttonLastSteps.notExistsLastButton();

        // Next button must displayed
        buttonNextSteps.displayedNextButton();

        // All buttons must existed and displayed after click
        buttonNextSteps.clickNextButton();
        buttonNextSteps.existsNextButton();
        buttonLastSteps.existsLastButton();

        buttonNextSteps.displayedNextButton();
        buttonLastSteps.displayedLastButton();
    }
}
