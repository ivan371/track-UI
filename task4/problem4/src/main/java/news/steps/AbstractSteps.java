package news.steps;

import org.openqa.selenium.WebDriver;
import news.navigation.PageObject;

public abstract class AbstractSteps extends PageObject {

    public AbstractSteps(WebDriver driver) {
        super(driver);
    }
}
