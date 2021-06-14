package pages;

import locators.PagesLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

public class ShoppingPage {

    WebDriver driver;
    WebDriverWait wait;
    PagesLocators pagesLocators;

    public ShoppingPage(WebDriver driver) {
        this.driver = driver;
        pagesLocators = new PagesLocators(driver);
        PageFactory.initElements(driver, pagesLocators);
        wait = new WebDriverWait(driver, 20);
    }

    public void selectLoginbutton(String login) {
        pagesLocators.getLogbutton().click();
    }

    public void selectLogin(String email) {
        pagesLocators.getEmail().sendKeys("racapol816@revutap.com");
    }

    public void selectPassword(String password) {
        pagesLocators.getPassword().sendKeys("awupeut7Oof");
    }

    public void selectButton(String submit) {
        pagesLocators.getButton().click();
    }
    public void selectLogobutton(String logo) {
        pagesLocators.getLogobutton().click();
    }
    public void selectSweater(String sweater){
        pagesLocators.getSweater().click();
    }
    public void selectSize(String size) {
        pagesLocators.getSize().click();

        Select dropdown = new Select (driver.findElement(By.id("group_1")));
        dropdown.selectByVisibleText("M");
    }
    public void selectQuantity(String Quantity) throws InterruptedException {
        for (int i =0; i<=3; i++)
        pagesLocators.getQuantity().click();
        Thread.sleep(2000);
    }
    public void selectAddcart(String Addcart) {
        pagesLocators.getAddcart().click();
    }
    public void selectCheckoutPop(String Checkout) {
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("body.lang-en.country-gb.currency-eur.layout-full-width.page-product.tax-display-enabled.product-id-1.product-hummingbird-printed-t-shirt.product-id-category-4.product-id-manufacturer-1.product-id-supplier-0.product-available-for-order.modal-open:nth-child(2) div.modal.fade.in:nth-child(11) div.modal-dialog div.modal-content div.modal-body div.row div.col-md-7 div.cart-content div.cart-content-btn:nth-child(5) > a.btn.btn-primary:nth-child(2)")));
        pagesLocators.getCheckoutPop().click();
    }
    public void selectCheckoutbutton(String Checkoutbutton) {
        pagesLocators.getCheckoutproceed().click();
    }
    public void selectcontinuebutton (String continuebutton) {
        pagesLocators.getContinuebutton().click();
    }
    public void selectshippingbutton (String shippingbutton) {
        pagesLocators.getShippingbutton().click();
    }
    public void selectPayment (String payment) {
        pagesLocators.getPayment().click();
    }
    public void  selectAgreebutton (String agreebutton) {
        pagesLocators.getAgreeButton().click();
    }
    public void selectOrderbutton (String orderbutton) {
        pagesLocators.getOrderButton().click();
    }
    //public void screenshot(String screenshot){
       //File scrfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       // File.copyFile(file, new File "")
    }
