package alerts;

import base.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.JavaScriptAlertPage;

import static org.testng.Assert.assertEquals;

public class AlertsTest extends BaseTest {
    private JavaScriptAlertPage alertPage;

    @Test
    public void AlertMessage(){
        alertPage = homePage.clickJavaScriptAlert();
        alertPage.clickAlertButton();
        String alertMessage = alertPage.getTextAlert();
        alertPage.acceptAlert();
        String result = alertPage.getResult();
        System.out.println(alertMessage);
        assertEquals(result, "You successfuly clicked an alert","The Result is not correct");
    }

    @Test
    public void confirmAlert(){
        alertPage = homePage.clickJavaScriptAlert();
        alertPage.clickConfirmButton();
        String alertMessage = alertPage.getTextAlert();
        alertPage.dismisstAlert();
        assertEquals(alertMessage,"I am a JS Confirm","The message displayed is incorrect");
    }

    @Test
    public void PromtAlert(){
        alertPage = homePage.clickJavaScriptAlert();
        alertPage.clickPromptButton();
        String message = "I love Dogs";
        alertPage.sendKeysAlert(message);
        alertPage.acceptAlert();
        assertEquals("You entered: " + message,alertPage.getResult(),"Message incorrect");
    }
}
