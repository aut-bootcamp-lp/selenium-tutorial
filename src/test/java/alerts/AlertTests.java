package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTests {

    @Test
    public void testAcceptAlert(){
        var alertPage = homePage.clickInJavaScripAlert();
        alertPage.clickOnAlertButton();
        alertPage.acceptAlert();
        String expectedValue = "You successfuly clicked an alert";
        String currentResult = alertPage.getResult();
        assertEquals(expectedValue,currentResult);
    }

    @Test
    public void testDismissConfirmAlert(){
        var alertPage = homePage.clickInJavaScripAlert();
        alertPage.clickAndConfirmInAlert();
        String expectedValue = "I am a JS Confirm";
        String currentValue = alertPage.getTextFromAlert();
        alertPage.confirmAlertDismiss();
        assertEquals(expectedValue,currentValue);
    }

    @Test
    public void testSetTHePromptAlert(){
        var alertPage = homePage.clickInJavaScripAlert();
        alertPage.clickOnPromptButton();
        alertPage.alertSetInput("Hello");
        alertPage.acceptAlert();
        String expectedValue = "You entered: Hello";
        String currentValue = alertPage.getResult();
        assertEquals(expectedValue,currentValue);
    }
}
