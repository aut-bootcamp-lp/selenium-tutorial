package slider;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HorizontalSliderTest extends BaseTest {

    @Test
    public void moveHorizontalSlider() {

        var horizontalSlider = homePage.clickHorizontalSlider();
        horizontalSlider.moveHorizontalRight();
        horizontalSlider.moveHorizontalRight();
        int rightControl = 2;
        do{
            int right = (int)(Math.random()*2);
            if(right==1){
                rightControl++;
                horizontalSlider.moveHorizontalRight();
            } else if (rightControl>1){
                rightControl--;
                horizontalSlider.moveHorizontalLeft();
            }
        } while (rightControl < 8);
        assertEquals(horizontalSlider.getResult(), "4","The Slider does not move 4 steps");
    }
}
