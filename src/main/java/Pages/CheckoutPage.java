package Pages;
import  org.openqa.selenium.By;
import  org.openqa.selenium.WebDriver;
import  org.openqa.selenium.firefox.FirefoxDriver;
public class CheckoutPage {
    public WebDriver driver;


    public By continueB = By.id("continue");
    public By firstNameInputField = By.id("first-name");
    public By lastNameInputField = By.id("last-name");
    public By postCodeInputField = By.id("postal-code");

    public CheckoutPage(WebDriver driver){
        this.driver=driver;
    }

    public void enterFirstName(String textToEnterToFirstNameInputField){
        driver.findElement(firstNameInputField).sendKeys(textToEnterToFirstNameInputField);
    }
    public void enterLastName(String textToEnterToLastNameInputField){
        driver.findElement(lastNameInputField).sendKeys(textToEnterToLastNameInputField);
    }
    public void enterPostCode(String textToEnterToPostCodeInputField){
        driver.findElement(postCodeInputField).sendKeys(textToEnterToPostCodeInputField);
    }
    public void clickContinueB(){
        driver.findElement(continueB).click();
    }


}
