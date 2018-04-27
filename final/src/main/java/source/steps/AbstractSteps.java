package source.steps;

import org.openqa.selenium.WebDriver;
import source.navigation.PageObject;

/**
 * Абстрактные Шаги
 * @author Pavel Balahonov <p.balahonov@corp.mail.ru>
 */
public abstract class AbstractSteps extends PageObject {

    public AbstractSteps(WebDriver driver) {
        super(driver);
    }
}
