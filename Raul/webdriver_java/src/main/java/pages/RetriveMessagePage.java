package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RetriveMessagePage {
    private WebDriver driver;
    private By content = By.id("content");

    public RetriveMessagePage(WebDriver driver){
        this.driver=driver;
    }

    public String getContentText(){
        return driver.findElement(content).getText();
    }
}
