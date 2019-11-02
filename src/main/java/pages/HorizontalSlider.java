package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSlider {

    private WebDriver driver;
    private By valueSlider = By.id("range");
    private By slider = By.cssSelector("#content div > div > input[type=range]");

    public HorizontalSlider(WebDriver driver) {
        this.driver = driver;
    }

    public void moveSlider(){
        for (int i = 0; i < 8; i++) {
            driver.findElement(slider).sendKeys(Keys.RIGHT);
        }
    }

    public String getResultSlider(){
        return driver.findElement(valueSlider).getText();
    }
}
