package contextmenu;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests {

    @Test
    public void testRigthClickInBox(){
        var contextMenu = homePage.clickOnContextMenu();
        contextMenu.clickRigthInBox();
        String excpectedValue = "You selected a context menu";
        String currentValue = contextMenu.getMessageFromAlert();
        contextMenu.acceptAlert();
        assertEquals(excpectedValue,currentValue);
    }
}
