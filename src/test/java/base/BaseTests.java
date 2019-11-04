package base;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

import java.util.List;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);

      /*  List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Amount: " + links.size());
        //driver.manage().window().setSize(new Dimension(375, 812));

        WebElement shiftingLink = driver.findElement(By.linkText("Shifting Content"));
        shiftingLink.click();
        driver.findElement(By.linkText(("Example 1: Menu Element"))).click();
        Integer numberElements = driver.findElements(By.tagName("li")).size();
        System.out.println("Elements in shifting page: " + numberElements);
        System.out.println(driver.getTitle());
*/
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
