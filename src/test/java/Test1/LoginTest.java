package Test1;

import Pages.LoginPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class LoginTest extends BaseClass {



        LoginPage login = new LoginPage(driver);

    @Before
    public void setUp() throws Exception {
        driver.get("https://www.saucedemo.com/");
    }

    @Test
    public void testSaValidnimImenomISifrom () {
        login.enterUserName("standard_user");
        login.enterPassword("secret_sauce");
        login.clickOnLoginButton();
        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertTrue("Epic sadface: Username is required", expectedUrl.equals(actualUrl));

    }
    @Test
    public void testBezKredencijala(){
        login.enterUserName("");
        login.enterPassword("");
        login.clickOnLoginButton();
        String expectedErrorMessage = "Epic sadface: Username is required";
        String actualErrorMessage = login.getTextErrorMassage1();
        Assert.assertTrue("Error message is not adequate for login without credentials",expectedErrorMessage.equals(actualErrorMessage));


    }
    @Test
    public void testValidnoImeNevalidnaSifra(){
        login.enterUserName("standard_user");
        login.enterPassword("secret");
        login.clickOnLoginButton();
        String expectedErrorMessage = "Epic sadface: Username and password do not match any user in this service";
        String actualErrorMessage = login.getTextErrorMassage1();
        Assert.assertTrue("Error message is not adequate for login with right username and wrong password",expectedErrorMessage.equals(actualErrorMessage));


    }
    @Test
    public void testNevalidnoImeValidnaSifra(){
        login.enterUserName("standard");
        login.enterPassword("secret_sauce");
        login.clickOnLoginButton();
        String expectedErrorMessage = "Epic sadface: Username and password do not match any user in this service";
        String actualErrorMessage = login.getTextErrorMassage1();
        Assert.assertTrue("Error message is not adequate for login with wrong username and right password", expectedErrorMessage.equals(actualErrorMessage));
    }
    @Test
    public void testNevalidniKredencijali(){
        login.enterUserName("standard");
        login.enterPassword("secret");
        login.clickOnLoginButton();
        String expectedErrorMessage = "Epic sadface: Username and password do not match any user in this service";
        String actualErrorMessage = login.getTextErrorMassage1();
        Assert.assertTrue("Error message is not adequate for login with wrong username and password",expectedErrorMessage.equals(actualErrorMessage));
    }



}
