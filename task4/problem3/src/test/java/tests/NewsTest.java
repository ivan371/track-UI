package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class NewsTest {
    private WebDriver driver;

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
    public void popupTest() throws InterruptedException {
        driver.get("https://kino.mail.ru/");
        //It will be the first image
        WebElement newsButton = driver.findElement(By.cssSelector("div[class='slider__item js-slider__item slider__item_selected']"));
        WebElement oldText = driver.findElement(By.xpath("//div[contains(@class, 'slider__item')][contains(@class, 'slider__item_selected')][contains(@class, 'js-slider__item')]/div/article/div/header/a"));
        String text = oldText.getText();
        newsButton.click();
        // We find menu "Сюжет фильма"

        assertTrue(String.format("Page need to contain URL %s", "/new/"), driver.getCurrentUrl().contains("/news/"));
        WebElement newText = driver.findElement(By.cssSelector("h1.hdr__inner"));
        assertEquals("Title coinside", text, newText.getText());
//        WebElement articleTitle = driver.findElement(By.xpath("//h1[@class='hdr__inner']"));
//        assertTrue("Title", "Cюжет фильма", articleTitle.getText());
    }
}
