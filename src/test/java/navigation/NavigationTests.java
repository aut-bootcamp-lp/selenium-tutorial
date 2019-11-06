package navigation;

import base.BaseTests;
import org.testng.annotations.Test;

public class NavigationTests extends BaseTests {

    @Test
    public void testNavigation(){
        homePage.clickOnDynamicLoagindPage().clickExample1();
        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goForward();
        getWindowManager().goTo("https://www.google.com.bo/");
    }

    @Test
    public void testSwitchTab() {
        homePage.clickOnMultipleWindows().clickHere();
        getWindowManager().switchToTab("New Window");
    }
}
