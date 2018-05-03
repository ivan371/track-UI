package lesson7;

import org.openqa.selenium.WebDriver;

class BasePage {
    private WebDriver driver;
    BasePage(WebDriver driver) {
        this.driver = driver;
    }
}
