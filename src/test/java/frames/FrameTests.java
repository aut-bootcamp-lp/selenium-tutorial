package frames;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.WysiwygEditorPage;

import static org.testng.Assert.assertEquals;

public class FrameTests extends BaseTests {

    @Test
    public void wysiwygTest_ReturnHelloWorld(){
        var editorPage = homePage.clickOnWysiwygPage();
        String hello = "Hello", world = " world";
        String expectedResult = "Hello world";
        editorPage.clearTextArea();
        editorPage.setTextArea(hello);
        editorPage.clickOnIndentButton();
        editorPage.setTextArea(world);
        String currentValue = editorPage.getTextFromTextArea();
        assertEquals(expectedResult,currentValue);
    }
}
