package pages.otherProjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DobroPetsProjectPage extends BasePage{
    public DobroPetsProjectPage(WebDriver driver) {
        super(driver, driver.getCurrentUrl(), Pattern.compile("http[s]?://.*?dobro\\..*?/projects/.*?"));
    }

    @FindBy(css = ".hdr .hdr__inner")
    private WebElement header;


    public String getPageHeader() {
        return header.getText();
    }
}
