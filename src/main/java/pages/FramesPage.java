package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage {

    private WebDriver driver;
    private By linkNestedFrames = By.linkText("Nested Frames");

    public FramesPage(WebDriver driver) {
        this.driver = driver;
    }

    public NestedFrames clickInNestedFrames(){
        driver.findElement(linkNestedFrames).click();
        return new NestedFrames(driver);
    }
}
