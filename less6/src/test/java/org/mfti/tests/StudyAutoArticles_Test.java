package org.mfti.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class StudyAutoArticles_Test {
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
    public void click_article_title() {
        driver.get("https://auto.mail.ru/articles/");

        WebElement headerPage = driver.findElement(By.xpath("//h1[@class='hdr__inner']"));
        assertEquals("Wrong header", "Статьи", headerPage.getText());
//        assertTrue(String.format("Page contains URL"), "/articles/", driver.getCurrentUrl().contains("/articles"));
//        List<WebElement> articles = driver.findElements(By.cssSelector(".js-pgng_item"));
//        String articleTitle = articles.get(0).getText().trim();
//        articles.get(0).click();
//
//        WebElement articleHeaderPage = driver.findElement(By.xpath("//h1[class='hdr_inner']"));
//        assertEquals("", articleTitle, articleHeaderPage.getText());
//        Actions actions = new Actions(driver);
//        actions.moveToElement(headerPage).doubleClick().build().perform();
    }

    @Test
    public void horoPage() {
        driver.get("https://horo.mail.ru/namesecret/");

        WebElement inputPage = driver.findElement(By.className("input__field"));
        inputPage.sendKeys("Dima");

        WebElement submitButton = driver.findElement(By.className("button__text"));
        submitButton.submit();
    }

    @Test
    public void googleHello() {
        driver.get("https://google.com");

        WebElement googleInput = driver.findElement(By.id("lst-ib"));
        googleInput.sendKeys("Hello, world");
        googleInput.submit();

        List<WebElement> results = driver.findElements(By.className("g"));
        System.out.println(results);
        assertTrue("", results.size() > 0);
    }
}
