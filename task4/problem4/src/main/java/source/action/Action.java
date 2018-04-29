package source.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import source.navigation.PageObject;

public class Action extends PageObject{
    private Actions actions;
    public Action(WebDriver driver) {
        super(driver);
        actions = new Actions(driver);
    }

    public void moveToElement(WebElement webElement) {
        actions.moveToElement(webElement).perform();
    }
}
