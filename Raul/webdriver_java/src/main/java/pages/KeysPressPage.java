package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeysPressPage {
    private WebDriver driver;
    private By imputField = By.id("target");
    private By resultText = By.id("result");

    public KeysPressPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterText(String text){
        driver.findElement(imputField).sendKeys(text);
    }

    public String getResult(){
        return driver.findElement((resultText)).getText();
    }

    public void enterPi(){
        enterText(Keys.chord(Keys.ALT, "1") + "=3.14");
    }
}
