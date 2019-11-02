package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeysTests extends BaseTests {

    @Test
    public void testBackspace(){
        var KeyPage = homePage.clickKeyPresses();
        KeyPage.enterText("A" + Keys.BACK_SPACE);
        assertEquals(KeyPage.getResult(),"You entered: BACK_SPACE");
    }

    @Test
    public void testPI(){
        var KeyPage = homePage.clickKeyPresses();
        KeyPage.enterPi();
        assertEquals(KeyPage.getResult(),"You entered: 4");
    }
}
