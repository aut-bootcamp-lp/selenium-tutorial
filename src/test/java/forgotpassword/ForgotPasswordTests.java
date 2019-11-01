package forgotpassword;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.EmailSended;
import pages.ForgotPassword;

import static org.testng.Assert.assertEquals;

public class ForgotPasswordTests extends BaseTests {

    @Test
    public void emailSendedForForgotPassword(){
        ForgotPassword forgotPassword = homePage.clickForgotPassword();
        forgotPassword.setEmail("example.email@gmail.com");
        EmailSended emailSended = forgotPassword.clickInRetrievePasswordButton();
        String emailSendedMessage = emailSended.emailSended();
        assertEquals(emailSendedMessage,"Your e-mail's been sent!");
    }
}
