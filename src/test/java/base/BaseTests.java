package base;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseTests {
    private WebDriver driver;


    public void setUp(){
       // WebDriverWait  wait = new WebDriverWait(driver, 30);
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Amount: " + links.size());

        //driver.manage().window().setSize(new Dimension(375, 812));

        WebElement shiftingLink = driver.findElement(By.linkText("Shifting Content"));
        shiftingLink.click();

       // WebElement menuElement = driver.findElement(By.linkText("Example 1: Menu Element"));
        //wait.until(ExpectedConditions.visibilityOf( menuElement));
        //menuElement.click();

          System.out.println(driver.getTitle());
      //  driver.quit();
    }
}
