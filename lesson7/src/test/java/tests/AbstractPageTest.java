package tests;

import lesson7.AbstractPage;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AbstractPageTest {
    private WebDriver driver;
    private AbstractPage abstractPage;

    @Before
    public void init() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--no-first-run");
        chromeOptions.addArguments("--homepage=about:blank");
        chromeOptions.addArguments("--ignore-certificate-errors");
        driver = new ChromeDriver(chromeOptions);
        abstractPage = new AbstractPage(driver);
    }

    @After
    public void close() {
        if(driver != null) {
            driver.quit();
        }
    }

    public void open(String name) {
        abstractPage.getDriver().get(abstractPage.getBaseUrl() + abstractPage.getNamedUrl(name));
    }
}
