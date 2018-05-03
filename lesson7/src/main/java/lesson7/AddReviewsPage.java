package lesson7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddReviewsPage extends BasePage {
    private WebElement reviewHeader;
    AddReviewsPage(WebDriver driver) {
        super(driver);
        reviewHeader = driver.findElement(By.xpath("//span[contains(@class, 'bread__close')]"));
    }

    public String getHeader() {
        return reviewHeader.getText();
    }
}
