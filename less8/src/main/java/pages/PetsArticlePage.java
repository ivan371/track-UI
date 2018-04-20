package pages;

import org.openqa.selenium.WebDriver;

import java.util.regex.Pattern;

public class PetsArticlePage extends BasePage{
    public PetsArticlePage(WebDriver driver) {
        super(driver, System.getProperty("domain.url") + "/", Pattern.compile(System.getProperty("domain.url") + "/"));
    }
}
