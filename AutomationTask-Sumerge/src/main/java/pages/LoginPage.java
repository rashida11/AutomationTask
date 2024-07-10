package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    public By usernameField= By.id("user-name");
    public By passField= By.id("password");
    public By loginButton= By.id("login-button");

    public By invalidLoginText= By.cssSelector("h3[data-test='error']");
    public LoginPage(WebDriver driver){
        this.driver=driver;

    }
    public boolean isUsernameFieldDisplayed() {
        return driver.findElement(usernameField).isDisplayed();
    }
    public boolean isPassFieldDisplayed() {
        return driver.findElement(passField).isDisplayed();
    }
    public void usernameEnter(String username){
        driver.findElement(usernameField).sendKeys(username);
    }
    public void passwordEnter(String password){
        driver.findElement(passField).sendKeys(password);
    }
    public AfterValidLogin loginBut(){
        driver.findElement(loginButton).click();
        return new AfterValidLogin(driver);
    }
    public String invalid_login(){
        driver.findElement(loginButton).click();
        return driver.findElement(invalidLoginText).getText();
    }



}
