package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import source.driver.DriverProvider;
import source.page.CollectedPage;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class UrlCollectorTest {
    private DriverProvider driverProvider = null;
    private String pageUrl;
    private String fileName;

    @Before
    public void initDriver() {
        driverProvider = new DriverProvider();
        pageUrl = System.getProperty("pageUrl");
        fileName = System.getProperty("fileName");
    }

    @After
    public void closeDriver() {
        driverProvider.closeDriver();
    }

    @Test
    public void urlCollector() {
        driverProvider.getDriver().get(pageUrl);
        CollectedPage collectedPage = PageFactory.initElements(driverProvider.getDriver(), CollectedPage.class);
        collectedPage.open();

        // collect internal and external links
        List<WebElement> internalLinks = collectedPage.getInternalLinks();
        List<WebElement> externalLinks = collectedPage.getExternalLinks();

        // write them to file
        try(FileWriter writer = new FileWriter(fileName)) {
            writer.write(String.format("Inner links (find %d):\n", internalLinks.size()));
            for (WebElement internalLink : internalLinks) {
                if (!internalLink.getAttribute("href").contains("http")) {
                    writer.write(pageUrl);
                }
                writer.write(internalLink.getAttribute("href") + "\n");
            }
            writer.write(String.format("\nExternal links (find %d):\n", externalLinks.size()));
            for (WebElement externalLink : externalLinks) {
                writer.write(externalLink.getAttribute("href") + "\n");
            }
            writer.close();
        }
        catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
