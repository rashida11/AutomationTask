package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.AfterValidLogin;

import static org.testng.Assert.*;

public class loginTests extends BaseTests {
    @Test
    public void testCheckFields() {
        assertTrue(loginpage.isUsernameFieldDisplayed(), "Username field is not displayed");
        assertTrue(loginpage.isPassFieldDisplayed(), "Password field is not displayed");

    }
    @Test
    public void testValidCredentials(){
        loginpage.usernameEnter("standard_user");
        loginpage.passwordEnter("secret_sauce");
        AfterValidLogin aftervalidlogin =loginpage.loginBut();
        assertEquals(aftervalidlogin.get_app_logo(),"Swag Labs","Wrong App Logo");
    }
    @Test
    public void testInvalidCredentials(){
        loginpage.usernameEnter("not_user");
        loginpage.passwordEnter("not_secret");
        assertEquals(loginpage.invalid_login(),"Epic sadface: Username and password do not match any user in this service",
                "Wrong Output");

    }
    @Test
    public void testEmptyUsername(){
        assertEquals(loginpage.invalid_login(),"Epic sadface: Username is required",
                "Wrong Output");

    }
    @Test
    public void testEmptyPassword(){
        loginpage.usernameEnter("standard_user");
        assertEquals(loginpage.invalid_login(),"Epic sadface: Password is required",
                "Wrong Output");
    }


}
