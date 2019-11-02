package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSlider {

    private WebDriver driver;
    private By horizontal = By.cssSelector("#content input[type=range]");
    private By result = By.id("range");

    public HorizontalSlider(WebDriver driver) {
        this.driver = driver;
    }

    public void moveHorizontalRight(){
        driver.findElement(horizontal).sendKeys(Keys.ARROW_RIGHT);
    }

    public void moveHorizontalLeft(){
        driver.findElement(horizontal).sendKeys(Keys.LEFT);
    }

    public String getResult(){
        return driver.findElement(result).getText();
    }
}
