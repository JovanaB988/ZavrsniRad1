package Pages;
import  org.openqa.selenium.By;
import  org.openqa.selenium.WebDriver;
import  org.openqa.selenium.firefox.FirefoxDriver;
public class CheckoutComplete {
    public WebDriver driver;

    public By backHomeButton = By.id("back-to-products");
    public By completeMessage = By.xpath("//*[text()=\"Thank you for your order!\"]");


    public CheckoutComplete(WebDriver driver){
        this.driver=driver;
    }
    public void clickBackHomeButton(){
        driver.findElement(backHomeButton).click();
    }
    public String getTextCompleteMessage(){
        return driver.findElement(completeMessage).getText();

    }


}
