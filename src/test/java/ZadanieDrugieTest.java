import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ShoppingPage;

public class ZadanieDrugieTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://prod-kurs.coderslab.pl/index.php");
    }


    @Test
    public void testyZakupy() throws InterruptedException {
        ShoppingPage shoppingPage = new ShoppingPage(driver);
        shoppingPage.selectLoginbutton("login");
        shoppingPage.selectLogin("email");
        shoppingPage.selectPassword("password");
        shoppingPage.selectButton("submit-login");
        shoppingPage.selectLogobutton("logo");
        shoppingPage.selectSweater("sweater");
        shoppingPage.selectSize("size");
        shoppingPage.selectQuantity("quantity");
        shoppingPage.selectAddcart("addcart");
        shoppingPage.selectCheckoutPop("checkout");
        shoppingPage.selectCheckoutbutton("checkoutbutton");
        shoppingPage.selectcontinuebutton("continuebutton");
        shoppingPage.selectshippingbutton("shippingbutton");
        shoppingPage.selectPayment("payment");
        shoppingPage.selectAgreebutton("agreebutton");
        shoppingPage.selectOrderbutton("orderbutton");

    }


    //@After
    //public void tearDown() {driver.quit();}
}