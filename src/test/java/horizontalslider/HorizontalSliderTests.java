package horizontalslider;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HorizontalSlider;

import static org.testng.Assert.assertEquals;

public class HorizontalSliderTests extends BaseTests {

    @Test
    public void moveSliderToValueFour(){
        HorizontalSlider horizontalSlider = homePage.clickHorizontalSlider();
        horizontalSlider.moveSlider();
        String currentValue = horizontalSlider.getResultSlider();
        String expectedVaue = "4";
        assertEquals(currentValue,expectedVaue);
    }
}
