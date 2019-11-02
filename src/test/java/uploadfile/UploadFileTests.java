package uploadfile;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class UploadFileTests extends BaseTests {

    @Test
    public void testFileUpload(){
        var uploadPage = homePage.clickOnFileUpload();
        uploadPage.uploadFile("/home/miguel/IdeaProjects/selenium-tutorial/resources/chromedriver");
        String expectedValue = "chromedriver";
        String currentValue = uploadPage.getUploadedFiles();
        assertEquals(expectedValue,currentValue);
    }
}
