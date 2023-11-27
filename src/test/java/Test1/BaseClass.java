package Test1;
import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;



public class BaseClass {
    public static WebDriver driver;

    LoginPage loginPage = new LoginPage(driver);



    @BeforeClass
    public static void beforeClass() throws Exception{
        WebDriverManager.firefoxdriver().setup();

        driver= new FirefoxDriver();
        driver.manage().window().maximize();


    }


    @AfterClass
    public static void afterClass() throws Exception{
        driver.quit();
    }

    public void login(){
        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();
    }


}
