package Pages;
import  org.openqa.selenium.By;
import  org.openqa.selenium.WebDriver;

public class CheckoutSecondPage {
    public WebDriver driver;


    public By finishButton = By.id("finish");


    public CheckoutSecondPage(WebDriver driver){
        this.driver=driver;
    }

    public void clickFinishButton(){
        driver.findElement(finishButton).click();
    }

    double itemOne = 29.99;
    double itemTwo = 9.99;
    double tax = 3.2;





}
