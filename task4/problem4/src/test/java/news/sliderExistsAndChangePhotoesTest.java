package news;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.junit4.DisplayName;
import news.steps.NewsSteps;
import news.steps.elements.PhotoStepsComponent;
import news.steps.elements.SliderStepsComponent;
import news.steps.elements.InstagramPostStepsComponent;
import news.steps.elements.TextAreaInstagramPostStepsComponent;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import news.action.Action;
import news.driver.DriverProvider;

@DisplayName("Check slider in instagram")
public class sliderExistsAndChangePhotoesTest {
    private DriverProvider driverProvider = null;

    @Before
    public void initDriver() {
        driverProvider = new DriverProvider();
    }

    @After
    public void closeDriver() {
        driverProvider.closeDriver();
    }

    @Test
    @Severity(SeverityLevel.BLOCKER)
    public void check_instagram() {
        NewsSteps newsSteps = new NewsSteps(driverProvider.getDriver());
        newsSteps.open("СМИ: грузовик въехал в группу людей в Мюнстере, три человека погибли");

        // Scroll to textarea component. If we scroll until textarea. Frame will appear
        TextAreaInstagramPostStepsComponent textAreaInstagramPostStepsComponent = new TextAreaInstagramPostStepsComponent(driverProvider.getDriver());
        newsSteps.scrollToInstagram(textAreaInstagramPostStepsComponent.getInstagramPost());


        // Wait while frame appear
        InstagramPostStepsComponent instagramPostStepsComponent = new InstagramPostStepsComponent(driverProvider.getDriver());
        instagramPostStepsComponent.waitInstagramLoading();

        newsSteps.switchToInstagram(instagramPostStepsComponent.getInstagramPage());

        // Component that describe photo
        PhotoStepsComponent photoStepsComponent = new PhotoStepsComponent(driverProvider.getDriver());
        photoStepsComponent.isPhotoComponentExist();

        // Move to photo
        Action newsAction = new Action(driverProvider.getDriver());
        newsAction.moveToElement(photoStepsComponent.getPhoto());

        // Component of instagram slider
        SliderStepsComponent sliderStepsComponent = new SliderStepsComponent(driverProvider.getDriver());
        sliderStepsComponent.sliderExists();

        // We get old photo utl
        String src = newsSteps.getImageSrc();

        // Switch to the next instagram
        sliderStepsComponent.sliderClick();

        // Check old and new photo
        photoStepsComponent.isPhotoComponentExist();
        newsSteps.checkImgSrc(src);
    }
}
