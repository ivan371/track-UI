package source.page;

import org.openqa.selenium.WebDriver;

abstract class PageObject {

    private Class<?> pageClass = super.getClass();

    private WebDriver driver = null;

    PageObject(WebDriver driver) {
        this.driver = driver;
    }

    // return page url
    String getPageUrl() {
        return System.getProperty("pageUrl");
    }

    WebDriver getDriver() {
        return driver;
    }
}