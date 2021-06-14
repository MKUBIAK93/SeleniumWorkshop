package Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import locators.PagesLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import pages.LoginPage;

public class CreateNewAddressSteps {
    WebDriver driver;
    PagesLocators pagesLocators;
    LoginPage loginPage;
    String DaneString;



    @Given("^Uzytkownik jest na stronie formularza$")
    public void uzytkownikJestNaStronieFormularza() {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://prod-kurs.coderslab.pl/index.php?controller=authentication&back=my-account");

        pagesLocators = new PagesLocators(driver);
        pagesLocators.getEmail().click();
        pagesLocators.getEmail().clear();
        pagesLocators.getEmail().sendKeys("racapol816@revutap.com");
        pagesLocators.getPassword().click();
        pagesLocators.getPassword().clear();
        pagesLocators.getPassword().sendKeys("awupeut7Oof");
        pagesLocators.getButton().click();
    }



    @And("^Uzytkownik istnieje w bazie danych$")
    public void uzytkownikIstniejeWBazieDanych() {
        pagesLocators.getAddresses().click();
        pagesLocators.getNewaddressButton().click();
    }

    @When("^Uzytkownik wprowadza my \"([^\"]*)\" w rubryce alias$")
    public void uzytkownikWprowadzaMyWRubryceAlias(String alias) {
        pagesLocators.getAlias().click();
        pagesLocators.getAlias().clear();
        pagesLocators.getAlias().sendKeys(alias);
    }

    @And("^Uzytkownik wprowadza my \"([^\"]*)\" w rubyce address$")
    public void uzytkownikWprowadzaMyWRubyceAddress(String address) {
        pagesLocators.getAddress1().click();
        pagesLocators.getAddress1().clear();
        pagesLocators.getAddress1().sendKeys(address);
        DaneString = address;
        DaneString += address;
    }

    @And("^Uzytkownik wprowadza my \"([^\"]*)\" w rubryce city$")
    public void uzytkownikWprowadzaMyWRubryceCity(String city) {
        pagesLocators.getCity().click();
        pagesLocators.getCity().clear();
        pagesLocators.getCity().sendKeys(city);
    }

    @And("^Uzytkownik wprowadza my \"([^\"]*)\" w rubryce zip/postalcode$")
    public void uzytkownikWprowadzaMyWRubryceZipPostalcode(String zip) {
        pagesLocators.getPostcode().click();
        pagesLocators.getPostcode().clear();
        pagesLocators.getPostcode().sendKeys(zip);
    }

    @And("^Uzytkownik wprowadza my \"([^\"]*)\" w rubryce Counrty$")
    public void uzytkownikWprowadzaMyWRubryceCounrty(String country) {
        pagesLocators.getCountry().click();
        Select selectCountry = new Select(pagesLocators.getCountry());
        selectCountry.selectByVisibleText(country);


    }

    @And("^Uztkownik wprowadza my \"([^\"]*)\" w rybryce Phone$")
    public void uztkownikWprowadzaMyWRybrycePhone(String phone) {
        pagesLocators.getPhone().click();
        pagesLocators.getPostcode().clear();
        pagesLocators.getPostcode().sendKeys(phone);

    }

    @And("^Uzytkownik klika przycisk save$")
    public void uzytkownikKlikaPrzyciskSave() {
        pagesLocators.getSaveButton().click();
    }

    @And("^Uzytkownik kilka przycisk Update$")
    public void uzytkownikKilkaPrzyciskUpdate() {
        pagesLocators.getUpdateButton().click();
    }

    @And("^Sprawdza poprawnosc poprawność zapisanego adresu$")
    public void sprawdzaPoprawnoscPoprawnośćZapisanegoAdresu() {
        loginPage.checkAddress(DaneString);
    }

    @Then("^Zamyka strone$")
    public void zamykaStrone() {
        driver.close();
    }
}
