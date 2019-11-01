package login;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;
import pages.RetriveMessagePage;

import static org.testng.Assert.assertTrue;

public class ForgotPasswordTest extends BaseTest {

    @Test
    public void testSuccessfullLogin(){
        ForgotPasswordPage forgotPage = homePage.clickForgotPassword();
        forgotPage.setEmailField("pipo@gome.com");
        RetriveMessagePage retrivePage = forgotPage.clickRetriveButton();
        assertTrue(retrivePage.getContentText()
                        .contains("Your e-mail's been sent!"),
                "Message text is incorrect");

    }
}
