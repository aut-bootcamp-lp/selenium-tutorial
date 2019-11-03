package wait;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTests {

    @Test
    public void testWaitUntilHidden(){
        var loadingPage = homePage.clickOnDynamicLoagindPage().clickExample1();
        loadingPage.clickStartButton();
        String expectedValue = "Hello World!";
        String currentValue = loadingPage.getTextAfterLoading();
        assertEquals(expectedValue,currentValue);
    }

    @Test
    public void testWaitwithExample2(){
        var loadingPage = homePage.clickOnDynamicLoagindPage().clickExample2();
        loadingPage.clickStartButton();
        String expectedValue = "Hello World!";
        String currentValue = loadingPage.getMessage();
        assertEquals(expectedValue,currentValue);
    }
}
