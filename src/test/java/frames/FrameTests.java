package frames;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.NestedFrames;

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

    @Test
    public void nestedFramesTest_LeftFrame(){
        var framesPages = homePage.clickOnFramePage();
        NestedFrames nestedPages = framesPages.clickInNestedFrames();
        String expectedResult = "LEFT";
        String currentResult = nestedPages.getLeftFrameText();
        assertEquals(expectedResult,currentResult);
    }

    @Test
    public void nestedFramesTest_BootomFrame(){
        var framesPages = homePage.clickOnFramePage();
        NestedFrames nestedPages = framesPages.clickInNestedFrames();
        String expectedResult = "BOTTOM";
        String currentResult = nestedPages.getBottomFrameText();
        assertEquals(expectedResult,currentResult);
    }
}
