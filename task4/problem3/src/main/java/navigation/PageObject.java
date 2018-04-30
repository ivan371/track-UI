package navigation;

import org.openqa.selenium.WebDriver;
import tools.WaitTools;

import static org.junit.Assert.assertTrue;

public abstract class PageObject {

    private Class<?> pageClass = super.getClass();

    private WebDriver driver = null;

    protected WaitTools waitTools;

    public PageObject(WebDriver driver) {
        this.driver = driver;
        waitTools = new WaitTools(getDriver());
    }

    /**
     * Возвращает URL страницы
     * @return URL страницы
     */
    protected String getPageUrl() {
        if(pageClass.isAnnotationPresent(Page.class))
            return System.getProperty("webdriver.base.url") + pageClass.getAnnotation(Page.class).value();
        return System.getProperty("webdriver.base.url");
    }

    /**
     * Возвращает драйвер
     * @return драйвер
     */
    protected WebDriver getDriver() {
        return driver;
    }
}