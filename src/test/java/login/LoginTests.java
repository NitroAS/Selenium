package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.AssertJUnit.assertEquals;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfullLogin(){
        LoginPage  loginpage = homePage.clickFormAuthentication();
    loginpage.setUsername("tomsmith");
    loginpage.setPassword("SuperSecretPassword!");
    SecureAreaPage secureAreaPage= loginpage.clickLoginButton();
     assertEquals(secureAreaPage.getAlertText(),
             "You logged out of the secure area!",
             "You logged out of the secure area!");

    }
}
