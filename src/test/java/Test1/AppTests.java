package Test1;
import Pages.LoginPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import Pages.Inventory;


 public class AppTests extends BaseClass {

    LoginPage login = new LoginPage(driver);
    Inventory inventory = new Inventory(driver);
    BaseClass baseClass = new BaseClass();


    @Before
    public void setUp() throws Exception {
        driver.get("https://www.saucedemo.com/");
        baseClass.login();

    }
    @Test
    public void aplikacijeFaceBook(){
        inventory.clickFacebook();
        String expectUrl = "https://www.facebook.com/saucelabs";
        String actualUrl = driver.getCurrentUrl();
        driver.close();

    }
    @Test
    public void aplikacijaTwitter(){
        inventory.clickTwitter();
        String expectUrl = "https://twitter.com/i/flow/login?redirect_after_login=%2Fsaucelabs";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertTrue("You are on a wrong page",expectUrl.equals(actualUrl));
        driver.close();
    }
    @Test
    public void aplikacijaLinkedIn(){
        inventory.clickLinkedIn();
        String expectUrl= "https://www.linkedin.com/authwall?trk=bf&trkInfo=AQGmZKQvelaOKwAAAYlTl-mg3tDjPe05RBwwPgPNBpohjt8EjXMNRycfhzR67BHHf_Nr6oNYp8dIS3j5I1kXqpsclVEZlXcLAji_j648xHlcGrbftByNfgeUAmd4Ya5sYCjHcgc=&original_referer=&sessionRedirect=https%3A%2F%2Fwww.linkedin.com%2Fcompany%2Fsauce-labs%2F";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertTrue("You are on a wrong page",expectUrl.equals(actualUrl));
        driver.close();
    }


}
