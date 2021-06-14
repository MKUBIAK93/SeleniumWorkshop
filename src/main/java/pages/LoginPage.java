package pages;

import locators.PagesLocators;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;
    PagesLocators pagesLocators;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        pagesLocators = new PagesLocators(driver);
        PageFactory.initElements(driver, pagesLocators);
        wait = new WebDriverWait(driver, 20);
    }
    public void checkAddress(String Dane){
        int listAddressSize = pagesLocators.getListAddress().size();
        String newAddress = pagesLocators.getListAddress().get(listAddressSize-1).getText();
        Assert.assertEquals(Dane, newAddress);
    }


}