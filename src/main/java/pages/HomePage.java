package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver drive;

    public HomePage(WebDriver driver) {
        this.drive = driver;
    }

    public LoginPage clickFormAuthentication() {
        clickLink("Form Athentication");
        return new LoginPage(drive);
    }

    public DropDownPage clickDropDown(){
        clickLink("Dropdown");
        return new DropDownPage(drive);
    }

    public HoverPage clickHovers(){
        clickLink("Hovers");
        return new HoverPage(drive);
    }

    private void clickLink(String linkTest){
        drive.findElement(By.linkText(linkTest)).click();
    }
}
