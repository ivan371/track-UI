package lady.search.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import source.elements.Component;
import source.elements.ComponentObject;

@Component(xpath = "//form[contains(@class, 'js-formvalidate__form')]")
public class LadySearchInputElement extends ComponentObject {
    public LadySearchInputElement(WebDriver driver) {
        super(driver);
    }

    private final String ladySearchInputLocator = "//form[contains(@class, 'js-formvalidate__form')]//input[contains(@class, 'input__field')]";
    private final String ladySearchButtonLocator = "//form[contains(@class, 'js-formvalidate__form')]//button[contains(@class, 'button')]";

    public void enterLadySearchInput(String text) {
        getDriver().findElement(By.xpath(ladySearchInputLocator)).sendKeys(text);
    }

    public void submitLadySearchForm() {
        getDriver().findElement(By.xpath(ladySearchButtonLocator)).click();
    }
}
