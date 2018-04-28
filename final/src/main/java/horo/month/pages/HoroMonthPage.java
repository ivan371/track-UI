package horo.month.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import source.navigation.Page;
import source.navigation.UrlPattern;
import source.pages.AbstractPage;

import java.util.List;
import java.util.stream.Collectors;

@Page("/moon_calendar/january-2017")
@UrlPattern("moon_calendar/january-2017/")
public class HoroMonthPage extends AbstractPage {
    public HoroMonthPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".p-moon-calendar__moonday__item")
    private List<WebElement> horoItemTitles;

    public List<String> getAllHoroItemTitles() {
        return horoItemTitles.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }

    public boolean isArticlesTitlesChanged(List<String> titles) {
        ExpectedCondition<Boolean> condition = new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver webDriver) {
                return getAllHoroItemTitles() != titles;
            }
        };
        return waitTools.waitForCondition(condition);
    }
}
