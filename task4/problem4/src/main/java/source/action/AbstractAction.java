package source.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import source.navigation.PageObject;

public class AbstractAction extends PageObject{
    private Actions actions;
    public AbstractAction(WebDriver driver) {
        super(driver);
        actions = new Actions(driver);
    }

    public void moveToElement(By locator) {
        actions.moveToElement((WebElement)waitTools.waitForAction(ExpectedConditions.visibilityOfElementLocated(locator))).perform();
    }
}
