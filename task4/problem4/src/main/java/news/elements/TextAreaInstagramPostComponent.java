package news.elements;

import org.openqa.selenium.WebDriver;
import source.elements.Component;
import source.elements.ComponentObject;

@Component(xpath = "//textarea[contains(@class,'lazyembed-textarea')]")
public class TextAreaInstagramPostComponent extends ComponentObject{
    public TextAreaInstagramPostComponent(WebDriver driver) {
        super(driver);
    }
}
