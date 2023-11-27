package Pages;
import  org.openqa.selenium.By;
import  org.openqa.selenium.WebDriver;

public class LoginPage {
    public WebDriver driver;

    public By userNameInputField = By.id("user-name");

    public By userPasswordInputField = By.id("password");

    public By LoginButton = By.id("login-button");
    public By errorMessage1 = By.cssSelector("h3[data-test=\"error\"");



    public LoginPage(WebDriver driver){
        this.driver=driver;

    }

    public void enterUserName(String textToEnterToUserNameInputField){
        driver.findElement(userNameInputField).sendKeys(textToEnterToUserNameInputField);
    }
    public  void enterPassword(String textToEnterToPasswordToInputField){
        driver.findElement(userPasswordInputField).sendKeys(textToEnterToPasswordToInputField);

    }
    public void clickOnLoginButton(){
        driver.findElement(LoginButton).click();

    }
    public String getTextErrorMassage1(){
       return driver.findElement(errorMessage1).getText();

    }

}
