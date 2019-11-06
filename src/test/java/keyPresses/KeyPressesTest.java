package keyPresses;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeyPressesTest extends BaseTests {
    @Test
    public void testBackspace(){
        var keyPage = homePage.clickKeyPressed();
        keyPage.enterText("A" + Keys.BACK_SPACE);
        assertEquals(keyPage.getResult(), "You entered: BACK_SPACE", "Is not space");
    }

    @Test
    public void testPi(){
        var keyPage = homePage.clickKeyPressed();
        keyPage.enterPi();
    }
}
