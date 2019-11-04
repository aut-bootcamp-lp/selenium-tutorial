package javascript;

import base.BaseTests;
import org.testng.annotations.Test;

public class JavaScriptTests extends BaseTests {

    @Test
    public void testScrollTable(){
        var scrollPage = homePage.clickOnLargeAndDeepDom();
        scrollPage.scrollToTable();
    }
}
