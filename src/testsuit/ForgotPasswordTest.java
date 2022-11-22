package testsuit;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class ForgotPasswordTest extends BaseTest {

    String baseurl = "https://opensource-demo.orangehrmlive.com/";
    @Before
    public void setUp(){
        openBrowser(baseurl);
    }
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        clickElement(By.xpath("//form/div/p [text() = 'Forgot your password? ']"));
        //Verify the text
        String expectedmessage = "Reset Password";
        String actualmessage = getTextFromElement(By.xpath("//form/h6 [text()= 'Reset Password']"));
        Assert.assertEquals("Reset password text is not displayed",expectedmessage,actualmessage);
    }
    @After
    public void tearDown(){
       // closeBrowser();
    }
}

