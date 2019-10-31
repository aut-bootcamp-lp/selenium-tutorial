package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Carperter3 {
    private WebDriver driver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        //WebElement inpuptsLink = driver.findElement(By.linkText("Inputs"));
        WebElement shiftingContent = driver.findElement(By.linkText("Shifting Content"));
        shiftingContent.click();

        WebElement menuElement = driver.findElement(By.linkText("Example 1: Menu Element"));
        menuElement.click();

        System.out.println(driver.getTitle());
        driver.quit();
    }

    public static void main (String[] args){
        Carperter3 test = new Carperter3();
        test.setUp();
    }
}
