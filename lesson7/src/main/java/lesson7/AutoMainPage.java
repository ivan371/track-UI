package lesson7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutoMainPage extends BasePage {
    private WebElement addView;
    public AutoMainPage(WebDriver driver) {
        super(driver);
        driver.get("https://auto.mail.ru");
        addView = driver.findElement(By.xpath("//a[contains(@class, 'button_color')"));
    }

    public void clickAddView() {
        addView.click();
    }
}
