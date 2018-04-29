package news.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import source.elements.ComponentObject;
import source.navigation.Page;
import source.navigation.UrlPattern;
import source.page.AbstractPage;

@Page("/incident/33094804")
@UrlPattern("incident/33094804")
public class NewsPage extends AbstractPage {
    public NewsPage(WebDriver driver) {
        super(driver);
    }

    private String photoUrl;

    public void ScrollToInstagram(ComponentObject componentObject) {
        getJSExecutor().executeScript("arguments[0].scrollIntoView();", componentObject);
    }

    public void SwitchToInstagram(WebElement instagramFrame) {
        getDriver().switchTo().frame(instagramFrame);
    }

    public void setPhotoUrl() {
        photoUrl = getDriver().findElement(By.tagName("img")).getAttribute("src");
    }

    public String getPhotoUrl() {
        return photoUrl;
    }
}
