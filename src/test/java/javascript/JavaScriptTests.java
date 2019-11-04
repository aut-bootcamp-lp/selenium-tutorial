package javascript;

import base.BaseTests;
import org.testng.annotations.Test;

public class JavaScriptTests extends BaseTests {

    @Test
    public void testScrollTable(){
        var scrollPage = homePage.clickOnLargeAndDeepDom();
        scrollPage.scrollToTable();
    }

    @Test
    public void testScrollToFifthParagraph() {
        homePage.clickOnInfiniteScrollPage().scrollToParagraph(5);
    }
}
