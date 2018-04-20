package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PetsMainPage extends BasePage{

    public PetsMainPage(WebDriver driver) {
        super(driver, System.getProperty("domain.url") + "/", Pattern.compile(System.getProperty("domain.url") + "/"));
    }

    @FindBy(tagName = "h1")
    private WebElement header;

    private String getPageHeader() {
        return header.getText();
    }

    public String openMainPage() {
        open();
        isPageCheck();
        return getPageHeader();
    }
}
