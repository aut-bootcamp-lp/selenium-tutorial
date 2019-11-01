package base;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
import pages.HomePage;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeAll
    public void setUp() {
        System.setProperty("webdriver.chrome.driver",
                "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.pivotaltracker.com");

        homePage = new HomePage(driver);
    }

    @AfterAll
    public void tearDown(){
        driver.quit();
    }


//    public static void main(String[] args) {
//        BaseTest test = new BaseTest();
//        test.setUp();
//    }
}
