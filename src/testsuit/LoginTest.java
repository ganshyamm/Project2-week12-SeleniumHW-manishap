package testsuit;
/*3. Write down the following test into ‘LoginTest’ class
1. userSholdLoginSuccessfullyWithValidCredentials
* Enter “Admin” username
* Enter “admin123“ password
* Click on ‘LOGIN’ button
* Verify the ‘Dashboard’ text is display*/

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    String baseurl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseurl);

    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {

        //Enter username and password
        sendTextToElement(By.name("Username"), "Admin");
        sendTextToElement(By.name("password"), "admin");

        //click on login button
        clickElement(By.xpath("//button [@type = 'submit']"));

        //verify Dashboard text is displayed
        String expectedmessage = "Dashboard";
        String actualmessage = getTextFromElement(By.xpath("\"//span/h6 [text()='Dashboard']"));
        Assert.assertEquals("Dashboard text is Displayed", expectedmessage, actualmessage);


    }

    @After
    public void tearDown() {
       // closeBrowser();


    }
}
