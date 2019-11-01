package login;

import base.BaseTest;
import org.junit.jupiter.api.Test;
//import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ShowWithPasswordPage;
import static org.assertj.core.api.Assertions.*;

public class LoginTests extends BaseTest {

    @Test
    public void testSuccesfullLogin() {
        LoginPage loginPage = homePage.clickLogInBtn();
        loginPage.setUserNameField("sirius776@gmail.com");
        ShowWithPasswordPage passPage = loginPage.clickNextBtn();
        assertThat(passPage.getPasswUrl()).contains("password");
    }
}
