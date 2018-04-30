package news.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import news.navigation.Page;
import news.navigation.UrlPattern;

@Page("/incident/33094804")
@UrlPattern("incident/33094804")
public class NewsPage extends AbstractPage {
    public NewsPage(WebDriver driver) {
        super(driver);
    }

    public void ScrollToInstagram(WebElement webElement) {
        getJSExecutor().executeScript("arguments[0].scrollIntoView();", webElement);
    }

    public void SwitchToInstagram(WebElement instagramFrame) {
        getDriver().switchTo().frame(instagramFrame);
    }

    public String getPhotoUrl() {
        return getDriver().findElement(By.xpath("//div[contains(@class, 'EmbedSidecar')]//img")).getAttribute("src");
    }
}
