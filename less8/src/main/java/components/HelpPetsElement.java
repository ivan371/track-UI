package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.PetsArticlePage;

import java.util.stream.Collectors;

public class HelpPetsElement extends BaseComponent{

    public HelpPetsElement(WebDriver driver) {
        super(driver);
    }

    //Набор локаторов для плиток
    private final String petsDobroItemTitlesLocator = "//*[contains(@class, 'pets-dobro')]//*[contains(@class, 'pypo-item__title')]";
    private final String petsDobroItemTileByTitleLocator = petsDobroItemTitlesLocator + "[text()='%s']/ancestor::div[contains(@class, 'pypo-item_dobro')]";

    public String getPetsDobroTitle(int index) {
        return getDriver().findElements(By.xpath(petsDobroItemTitlesLocator)).stream()
                .map(WebElement::getText)
                .collect(Collectors.toList()).get(--index);
    }

    public PetsArticlePage clickPetsDobroArticleTile(String title) {
        String locator = String.format(petsDobroItemTileByTitleLocator, title);
        getDriver().findElement(By.xpath(locator)).click();
        return PageFactory.initElements(getDriver(), PetsArticlePage.class);
    }
}
