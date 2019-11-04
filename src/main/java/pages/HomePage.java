package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver drive;
    private By formAthenticationLink = By.linkText("Form Authentication");

    public HomePage(WebDriver driver) {
        this.drive = driver;
    }

    public LoginPage clickFormAuthentication() {
        drive.findElement(formAthenticationLink).click();
        return new LoginPage(drive);
    }
}
