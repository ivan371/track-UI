package pages;

import org.openqa.selenium.WebDriver;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class BasePage {
    WebDriver driver = null;
    private String pageUrl;
    private Pattern pagePattern;

    protected BasePage(WebDriver driver, String pageUrl, Pattern pagePattern) {
        this.driver = driver;
        this.pageUrl = pageUrl;
        this.pagePattern = pagePattern;
    }

    public boolean isPageCheck() {
        Matcher matcher = pagePattern.matcher(driver.getCurrentUrl());
        return matcher.find();
    }

    protected BasePage open() {
        driver.get(pageUrl);
        return this;
    }
}
