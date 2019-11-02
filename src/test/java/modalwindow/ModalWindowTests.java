package modalwindow;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ModalWindowTests extends BaseTests {

    @Test
    public void testSeeModalWindow(){
        var ModalWindow = homePage.cliclOnEntryAd();
        String currentValue = ModalWindow.getTextFooterModal();
        String expectedValue = "Close";
        assertEquals(currentValue,expectedValue);
    }
}
