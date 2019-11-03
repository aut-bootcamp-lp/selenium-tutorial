package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertPage {

    private WebDriver driver;
    //#content button[onclick="jsAlert()"]
    private By triggerAlertButton = By.xpath(".//button[text()=\"Click for JS Alert\"]");
    private By triggerConfirmButton = By.xpath(".//button[text()=\"Click for JS Confirm\"]");
    private By triggerPromptButton = By.xpath(".//button[text()=\"Click for JS Prompt\"]");

    private By result = By.id("result");

    public JavaScriptAlertPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAlertButton(){
        driver.findElement(triggerAlertButton).click();
    }

    public void clickConfirmButton(){
        driver.findElement(triggerConfirmButton).click();
    }

    public void clickPromptButton(){
        driver.findElement(triggerPromptButton).click();
    }

    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }

    public void dismisstAlert(){
        driver.switchTo().alert().dismiss();
    }

    public String getTextAlert(){
        return driver.switchTo().alert().getText();
    }

    public void sendKeysAlert(String text){
        driver.switchTo().alert().sendKeys(text);
    }

    public String getResult (){
        return driver.findElement(result).getText();
    }
}
