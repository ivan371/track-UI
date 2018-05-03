package lesson7;

import org.openqa.selenium.WebDriver;

@At(value = "mail.ru", urls = "/*")
public class AbstractPage {
    private WebDriver driver;
    private String baseUrl;

    public String getBaseUrl() {
        return baseUrl;
    }
    public AbstractPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getNamedUrl(String name) {
        return name;
    }

    public WebDriver getDriver() {
        return driver;
    }
}
