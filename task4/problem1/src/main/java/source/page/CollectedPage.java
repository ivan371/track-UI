package source.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

public class CollectedPage extends AbstractPage{
    public CollectedPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(tagName = "a")
    private List<WebElement> links;

    private List<WebElement> internalLinks;

    public List<WebElement> getInternalLinks() {
        internalLinks = links.stream().filter(x -> x.getAttribute("href").contains(getPageUrl())
                || !x.getAttribute("href").contains("http")).collect(Collectors.toList());
        return internalLinks;
    }

    public List<WebElement> getExternalLinks() {
        return links.stream().filter(x -> !internalLinks.contains(x)).collect(Collectors.toList());
    }
}
