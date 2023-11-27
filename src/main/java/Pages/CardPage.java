package Pages;
import  org.openqa.selenium.By;
import  org.openqa.selenium.WebDriver;
import  org.openqa.selenium.firefox.FirefoxDriver;
public class CardPage {

    public WebDriver driver;

    public By checkoutButton = By.id("checkout");
    public By removeButton = By.id("remove-sauce-labs-backpack");
    public By continueButton = By.id("continue-shopping");
    public By removeText = By.xpath("//*[text()='Remove']");
    public By basketItem = By.xpath("//*[text()='1']");


    public CardPage(WebDriver driver){
        this.driver=driver;
    }
    public void clickCheckoutButton(){
        driver.findElement(checkoutButton).click();
    }
    public void clickRemoveButton(){
        driver.findElement(removeButton).click();
    }
    public void clickContinueButton(){
        driver.findElement(continueButton).click();
    }

    public String getTextRemove(){
      return driver.findElement(removeText).getText();

    }
    public String getNumberBasket(){
        return driver.findElement(basketItem).getText();

    }



}
