package base;
import org.openqa.selenium.*;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;

public class BaseTests {
    private WebDriver driver;
    protected LoginPage loginpage;

    @BeforeClass
    public void setUp() {
        String driverPath = "C:\\Users\\Rashida\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        goHome();
        loginpage = new LoginPage(driver);


    }
    @AfterMethod
    public void goHome(){
        driver.get("https://www.saucedemo.com/");
    }


    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}