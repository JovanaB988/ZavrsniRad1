package Pages;

import io.netty.handler.codec.compression.Bzip2Decoder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Inventory {
    public WebDriver driver;
    public By addToCardBackPack = By.id("add-to-cart-sauce-labs-backpack");
    public By shoppingBasket = By.xpath("//span[@class='shopping_cart_badge']");
    public By sauceLabsBackpack = By.xpath("//*[text()=Sauce Labs Backpack");
    public By addToCardBikeLight = By.id("add-to-cart-sauce-labs-bike-light");
    public By sauceLabsBikeLight = By.xpath("//*[text()=Sauce Labs Bike Light");
    public By numberOneItem = By.xpath("//*[text()='1']");
    public By numberTwoItem = By.xpath("//*[text()='2']");
    public By twitter = By.xpath("//*[text()=\"Twitter\"]");
    public By facebook = By.xpath("//*[text()=\"Facebook\"]");
    public By linkedIn = By.xpath("//*[text()=\"LinkedIn\"]");



    public Inventory(WebDriver driver){
        this.driver=driver;

    }
    public void addBackPackButton(){
        driver.findElement(addToCardBackPack).click();
    }
    public void clickOnShoppingBasket(){
        driver.findElement(shoppingBasket).click();
    }
    public void clickOnBackpack(){
        driver.findElement(sauceLabsBackpack).click();
    }
    public void addBikeLightButton(){
        driver.findElement(addToCardBikeLight).click();
    }
    public void clickOnBikeLight(){
        driver.findElement(sauceLabsBikeLight).click();
    }
    public String getTextNumberOneItem(){
        return driver.findElement(numberOneItem).getText();
    }
    public String getTextNumberTwoItem(){
        return driver.findElement(numberTwoItem).getText();
    }
    public void clickTwitter(){
        driver.findElement(twitter).click();
    }
    public void clickFacebook(){
        driver.findElement(facebook).click();
    }
    public void clickLinkedIn(){
        driver.findElement(linkedIn).click();
    }



}
