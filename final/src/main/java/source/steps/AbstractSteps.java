package source.steps;

import org.openqa.selenium.WebDriver;
import source.navigation.PageObject;

public abstract class AbstractSteps extends PageObject {

    public AbstractSteps(WebDriver driver) {
        super(driver);
    }
}
