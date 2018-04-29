package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class ContinueTest {
    private WebDriver driver;
    private WebElement button;

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

    private void buttonExistTest() {
        button = driver.findElement(By.className("js-pgng_more_link"));
        assertTrue("Button exists", button.isDisplayed());
    }

    @Test
    public void continueButton() throws InterruptedException {
        driver.get("https://pets.mail.ru/news/");
        List<WebElement> items = driver.findElements(By.className("pypo-item"));
        int count = items.size();
        buttonExistTest();
        button.click();

        //we need wait to upload data
        TimeUnit.SECONDS.sleep(1);
        items = driver.findElements(By.className("pypo-item"));
        int newCount = items.size();

        assertEquals("Count items", 2 * count, newCount);
        buttonExistTest();
    }
}
