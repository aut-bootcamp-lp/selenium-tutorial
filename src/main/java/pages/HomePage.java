package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickFormAuthentication(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropDownPage clickDropDown(){
        clickLink("Dropdown");
        return new DropDownPage(driver);
    }

    public ForgotPassword clickForgotPassword(){
        clickLink("Forgot Password");
        return new ForgotPassword(driver);
    }

    public HoversPage clickHovers(){
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    public KeyPressesPage clickKeyPresses(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    public HorizontalSlider clickHorizontalSlider() {
        clickLink("Horizontal Slider");
        return new HorizontalSlider(driver);
    }

    public JavaScriptAlerts clickInJavaScripAlert(){
        clickLink("JavaScript Alerts");
        return new JavaScriptAlerts(driver);

    }

    public FileUpload clickOnFileUpload(){
        clickLink("File Upload");
        return new FileUpload(driver);
    }

    public EntryAdPage cliclOnEntryAd(){
        clickLink("Entry Ad");
        return new EntryAdPage(driver);
    }

    public ContextMenuPage clickOnContextMenu(){
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }

    public WysiwygEditorPage clickOnWysiwygPage(){
        clickLink("WYSIWYG Editor");
        return new WysiwygEditorPage(driver);
    }

    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}
