package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {

    private WebDriver driver;
    private By square = By.id("hot-spot");


    public ContextMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public void rightClick(){
        WebElement area = driver.findElement(square);
        Actions actions = new Actions(driver);
        actions.contextClick(area).perform();
    }

    public String getTextAlert(){
        return driver.switchTo().alert().getText();
    }

    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }

}
