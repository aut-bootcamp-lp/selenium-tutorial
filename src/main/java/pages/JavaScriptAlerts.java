package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlerts {

    private WebDriver driver;
    private By jsAlertButton = By.xpath(".//button[text()='Click for JS Alert']");
    private By results = By.id("result");
    private By jsConfirmButton = By.xpath(".//button[text()='Click for JS Confirm']");
    private By jsPromptButton = By.xpath(".//button[text()='Click for JS Prompt']");


    public JavaScriptAlerts(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnAlertButton(){
        driver.findElement(jsAlertButton).click();
    }

    public void clickAndConfirmInAlert(){
        driver.findElement(jsConfirmButton).click();
    }

    public void clickOnPromptButton(){
        driver.findElement(jsPromptButton).click();
    }

    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }

    public void confirmAlertDismiss(){
        driver.switchTo().alert().dismiss();
    }

    public String getTextFromAlert(){
        return driver.switchTo().alert().getText();
    }

    public String getResult(){
        return driver.findElement(results).getText();
    }

    public void alertSetInput(String text){
        driver.switchTo().alert().sendKeys(text);
    }
}
