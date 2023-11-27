package Test1;

import Pages.LoginPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import Pages.CheckoutPage;
import Pages.CheckoutSecondPage;
import Pages.CheckoutComplete;
import Pages.Inventory;
import Pages.CardPage;

import javax.swing.*;

public class ProductsShoppingTests extends BaseClass {
    LoginPage login = new LoginPage(driver);
    Inventory inventory = new Inventory(driver);
    CardPage card = new CardPage(driver);
    CheckoutPage checkout = new CheckoutPage(driver);
    CheckoutSecondPage checkoutSecond = new CheckoutSecondPage(driver);
    CheckoutComplete checkoutComplete = new CheckoutComplete(driver);

    BaseClass baseClass = new BaseClass();


    @Before
    public void setUp() throws Exception {
        driver.get("https://www.saucedemo.com/");
        baseClass.login();

    }
    @Test
    public void uspesnaKupovina(){
        inventory.addBackPackButton();
        inventory.clickOnShoppingBasket();
        card.clickCheckoutButton();
        checkout.enterFirstName("Jovana");
        checkout.enterLastName("Bulatovic");
        checkout.enterPostCode("11000");
        checkout.clickContinueB();
        checkoutSecond.clickFinishButton();
        String expectedUrl = "https://www.saucedemo.com/checkout-complete.html";
        String actualUrl = driver.getCurrentUrl();
        String expectedMessage = "Thank you for your order!";
        String actualMessage = checkoutComplete.getTextCompleteMessage();
        System.out.println(actualMessage);
        Assert.assertTrue("Something's wrong with your order",expectedMessage.equals(actualMessage));

    }


    @Test
    public void dodavanjeProizvoda(){
        inventory.addBackPackButton();
        inventory.getTextNumberOneItem();
        String expectedNumber = "1";
        String actualNumber = inventory.getTextNumberOneItem();
        Assert.assertTrue("7",expectedNumber.equals(actualNumber));
        System.out.println(actualNumber);



    }
    @Test
    public void uklanjanjeProizvoda(){
        inventory.addBackPackButton();
        inventory.addBikeLightButton();
        inventory.getTextNumberTwoItem();
        String expectedNumber = "2";
        String actualNumber = inventory.getTextNumberTwoItem();
        Assert.assertTrue("7",expectedNumber.equals(actualNumber));
        System.out.println(actualNumber);
        inventory.clickOnShoppingBasket();
        card.clickRemoveButton();
        card.getNumberBasket();
        String expectedNumber1 = "1";
        String actualNumber1 = card.getNumberBasket();
        Assert.assertTrue("8",expectedNumber1.equals(actualNumber1));
        System.out.println(actualNumber1);
    }









    }









