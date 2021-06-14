package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PagesLocators {
    private WebDriver driver;

    @FindBy(name = "email")
    private WebElement email;

    public WebElement getEmail() {
        return email;
    }

    public void setEmail(WebElement email) {
        this.email = email;
    }

    @FindBy(name = "password")
    private WebElement password;

    public WebElement getPassword() {
        return password;
    }

    public void setPassword(WebElement password) {
        this.password = password;
    }

    @FindBy(id = "submit-login")
    private WebElement button;

    public WebElement getButton() {
        return button;
    }

    public void setButton(WebElement button) {
        this.button = button;
    }

    @FindBy(id = "address-link")
    private WebElement address;

    public WebElement getAddress() {
        return address;
    }

    public void setAddress(WebElement address) {
        this.address = address;
    }

    @FindBy(id = "addresses-link")
    private WebElement Addresses;

    public WebElement getAddresses() {
        return Addresses;
    }

    public void setAddresses(WebElement addresses) {
        Addresses = addresses;
    }

    @FindBy(name = "alias")
    private WebElement Alias;

    public WebElement getAlias() {
        return Alias;
    }

    public void setAlias(WebElement alias) {
        Alias = alias;
    }

    @FindBy(name = "address1")
    private WebElement Address1;

    public WebElement getAddress1() {
        return Address1;
    }

    public void setAddress1(WebElement address1) {
        Address1 = address1;
    }

    @FindBy(name = "city")
    private WebElement City;

    public WebElement getCity() {
        return City;
    }

    public void setCity(WebElement city) {
        City = city;
    }

    @FindBy(name = "postcode")
    private WebElement Postcode;

    public WebElement getPostcode() {
        return Postcode;
    }

    public void setPostcode(WebElement postcode) {
        Postcode = postcode;
    }

    @FindBy(name = "id_country")
    private WebElement country;

    public WebElement getCountry() {
        return country;
    }

    public void setCountry(WebElement country) {
        this.country = country;
    }

    @FindBy(id = "_desktop_user_info")
    private WebElement Logbutton;

    public WebElement getLogbutton() {
        return Logbutton;
    }

    public void setLogbutton(WebElement logbutton) {
        Logbutton = logbutton;
    }

    @FindBy(id = "_desktop_logo")
    private WebElement Logobutton;

    public WebElement getLogobutton() {
        return Logobutton;
    }

    public void setLogobutton(WebElement logobutton) {
        Logobutton = logobutton;
    }

    @FindBy(xpath = "//body/main[1]/section[1]/div[1]/div[1]/section[1]/section[1]/section[1]/div[1]/article[1]/div[1]/div[1]")
    private WebElement Sweater;


    public WebElement getSweater() {
        return Sweater;
    }

    public void setSweater(WebElement sweater) {
        Sweater = sweater;
    }

    @FindBy(id = "group_1")
    private WebElement Size;

    public WebElement getSize() {
        return Size;
    }

    public void setSize(WebElement size) {
        Size = size;
    }

    @FindBy(xpath = "//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[1]/div/span[3]/button[1]")
    private WebElement Quantity;

    public WebElement getQuantity() {
        return Quantity;
    }

    public void setQuantity(WebElement quantity) {
        Quantity = quantity;
    }

    @FindBy(xpath = "//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button")
    private WebElement Addcart;

    public WebElement getAddcart() {
        return Addcart;
    }

    public void setAddcart(WebElement addcart) {
        Addcart = addcart;
    }

    @FindBy(xpath = "//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a")
    private WebElement checkoutPop;


    public WebElement getCheckoutPop() {
        return checkoutPop;
    }

    public void setCheckoutPop(WebElement checkoutPop) {
        this.checkoutPop = checkoutPop;
    }

    @FindBy(xpath = "//*[@id=\"main\"]/div/div[2]/div[1]/div[2]/div/a")
    private WebElement checkoutproceed;

    public WebElement getCheckoutproceed() {
        return checkoutproceed;
    }

    public void setCheckoutproceed(WebElement checkoutproceed) {
        this.checkoutproceed = checkoutproceed;
    }

    @FindBy(xpath = "//*[@id=\"checkoutPop-addresses-step\"]/div/div/form/div[2]/button")
    private WebElement continuebutton;

    public WebElement getContinuebutton() {
        return continuebutton;
    }

    public void setContinuebutton(WebElement continuebutton) {
        this.continuebutton = continuebutton;
    }

    @FindBy(xpath = "//*[@id=\"js-delivery\"]/button")
    private WebElement shippingbutton;

    public WebElement getShippingbutton() {
        return shippingbutton;
    }

    public void setShippingbutton(WebElement shippingbutton) {
        this.shippingbutton = shippingbutton;
    }

    @FindBy(xpath = "//*[@id=\"payment-option-1\"]")
    private WebElement payment;

    public WebElement getPayment() {
        return payment;
    }

    public void setPayment(WebElement payment) {
        this.payment = payment;
    }

    @FindBy(xpath = "//*[@id=\"payment-confirmation\"]/div[1]/button")
    private WebElement orderButton;

    public WebElement getOrderButton() {
        return orderButton;
    }

    public void setOrderButton(WebElement orderButton) {
        this.orderButton = orderButton;
    }

    @FindBy(xpath = "//*[@id=\"conditions_to_approve[terms-and-conditions]\"]")
    private WebElement agreeButton;

    public WebElement getAgreeButton() {
        return agreeButton;
    }

    public void setAgreeButton(WebElement agreeButton) {
        this.agreeButton = agreeButton;
    }
    @FindBy(name = "phone")
    private WebElement Phone;

    public WebElement getPhone() {
        return Phone;
    }

    public void setPhone(WebElement phone) {
        Phone = phone;
    }
    @FindBy(xpath = "//*[@id='content']//button")
    private WebElement saveButton;

    public WebElement getSaveButton() {
        return saveButton;
    }

    public void setSaveButton(WebElement saveButton) {
        this.saveButton = saveButton;
    }
    @FindBy(xpath = "//*[@id=\"address-12951\"]/div[2]/a[1]")
    private WebElement updateButton;

    public WebElement getUpdateButton() {
        return updateButton;
    }

    public void setUpdateButton(WebElement updateButton) {
        this.updateButton = updateButton;
    }
    @FindBy(xpath = "//section[@id='content']//article/div[@class='address-body']")
    private List<WebElement> listAddress;

    public List<WebElement> getListAddress() {
        return listAddress;
    }

    public void setListAddress(List<WebElement> listAddress) {
        this.listAddress = listAddress;
    }
    public PagesLocators(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(name = "firstname")
    private WebElement firstName;

    public WebElement getFirstName() {
        return firstName;
    }

    public void setFirstName(WebElement firstName) {
        this.firstName = firstName;
    }
    @FindBy(name = "lastname")
    private WebElement lastName;

    public WebElement getLastName() {
        return lastName;
    }

    public void setLastName(WebElement lastName) {
        this.lastName = lastName;
    }

    @FindBy(xpath = "//*[@class='addresses-footer']//a")
    private WebElement newaddressButton;

    public WebElement getNewaddressButton() {
        return newaddressButton;
    }

    public void setNewaddressButton(WebElement newaddressButton) {
        this.newaddressButton = newaddressButton;
    }
}