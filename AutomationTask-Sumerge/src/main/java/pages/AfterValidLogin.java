package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AfterValidLogin {
    private WebDriver driver;

    public AfterValidLogin(WebDriver driver){
        this.driver=driver;

    }
    public By Swag_Div= By.className("app_logo");

    public String get_app_logo(){
        return driver.findElement(Swag_Div).getText();
    }
}
