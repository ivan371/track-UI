package tests;

import components.HelpPetsElement;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import pages.PetsMainPage;
import pages.otherProjects.DobroPetsProjectPage;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class ClickPetsDobroArticleTest {
    private WebDriver driver;
    private PetsMainPage petsMainPage;

    @Before
    public void init() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--no-first-run");
        chromeOptions.addArguments("--homepage=about:blank");
        chromeOptions.addArguments("--ignore-certificate-errors");

        driver = new ChromeDriver(chromeOptions);
    }

    @After
    public void close() {
        if(driver != null) {
            driver.quit();
        }
    }

    @Test
    public void clickDobroPetsArticleTest() {
        PetsMainPage mainPage = PageFactory.initElements(driver, PetsMainPage.class);
        assertEquals("Page is opened", "Все о питомцах", mainPage.openMainPage());
        HelpPetsElement helpPetsElement = PageFactory.initElements(driver, HelpPetsElement.class);
        helpPetsElement.setComponent(By.className("pets-dobro"));
        helpPetsElement.isComponentPresent();

        String handler = driver.getWindowHandle();

        String title = helpPetsElement.getPetsDobroTitle(1);
        helpPetsElement.clickPetsDobroArticleTile(title);

        ArrayList<String> handlers = new ArrayList<String>(driver.getWindowHandles());
        handlers.remove(handler);

        driver.switchTo().window(handlers.get(0));


        DobroPetsProjectPage petsProjectPage = PageFactory.initElements(driver, DobroPetsProjectPage.class);
        assertTrue("New page is opened", petsProjectPage.isPageCheck());

        assertEquals("Title coincide", title, petsProjectPage.getPageHeader());
    }
}
