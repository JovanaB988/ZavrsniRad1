package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class DashBoard {

    public WebDriver driver;

    public By addToCard = By.id("add-to-cart-sauce-labs-backpack");

    public By SwagLabLink = By.xpath("//*[text()='Add to card']");

    public DashBoard(WebDriver driver){
        this.driver=driver;
    }
    public void clickOnSwagLabLink(){
        driver.findElement(SwagLabLink).isDisplayed();

    }
}
