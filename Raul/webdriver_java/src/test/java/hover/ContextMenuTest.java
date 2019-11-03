package hover;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTest extends BaseTest {

    @Test
    public void workContextMenu(){
        var contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.rightClick();
        String expectedMessage = "You selected a context menu";
        String actualMessage = contextMenuPage.getTextAlert();
        contextMenuPage.acceptAlert();
        assertEquals(actualMessage, expectedMessage,"The Result is not correct");
    }
}
