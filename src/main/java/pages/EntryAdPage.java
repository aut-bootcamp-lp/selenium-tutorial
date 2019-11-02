package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EntryAdPage {

    private WebDriver driver;
    private By footerModal = By.cssSelector("div.modal-footer p");

    public EntryAdPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTextFooterModal(){
        return driver.findElement(footerModal).getText();
    }

}
