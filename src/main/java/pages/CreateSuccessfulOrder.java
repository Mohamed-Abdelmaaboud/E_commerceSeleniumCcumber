package pages;

import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;

public class CreateSuccessfulOrder {
    private WebDriver driver;
    private LoginPage loginPage;
    private SearchPage searchPage;
    private AddToCart addToCart;
    private By shoppingCart = By.xpath("//a[@href='/cart']/span[1]]");
    private By checkTermOfService=By.id("termsofservice");
    private By checkoutButton = By.className("checkout-button");
    private By billingFirstName=By.id("BillingNewAddress_FirstName");
    private By billingLastName=By.id("BillingNewAddress_LastName");
    private By billingEmail=By.id("BillingNewAddress_Email");
    private By billingCountry=By.id("BillingNewAddress_CountryId");
    private By billingCity=By.id("BillingNewAddress_City");
    private By billingAddress1=By.id("BillingNewAddress_Address1");
    private By billingFirstZipPostalCode=By.id("BillingNewAddress_ZipPostalCode");
    private By billingPhoneNumber=By.id("BillingNewAddress_PhoneNumber");
    private By continueButton = By.className("new-address-next-step-button");
    private By pickUpInStore = By.id("PickUpInStore");
    private By paymentMethod = By.id("paymentmethod_0");
    private By confirmOrderButton = By.className("confirm-order-next-step-button");
   private By successMessage =By.xpath("//*[@class ='title']//*[text()='Your order has been successfully processed!']");

    public CreateSuccessfulOrder(WebDriver driver) {
        this.driver = driver;
    }


    public void openShoppingCart(){
        System.setProperty("webdriver.chrome.driver", "chromedriver_linux64 (1)/chromedriver");
        driver = new ChromeDriver();
      // driver.get("http://demowebshop.tricentis.com/onepagecheckout");
       loginPage = new LoginPage(driver);
       loginPage.openLoginPage();
       loginPage.Login();
       driver.findElement(shoppingCart).click();
        //searchPage = new SearchPage(driver);
        //searchPage.openSearchPage();
        //searchPage.SearchProduct("Blue and green sneaker");
        //addToCart = new AddToCart(driver);
        //addToCart.searchProduct();
        //addToCart.addProductToCart();





    }
    public void clickCheckout(){
        driver.findElement(checkTermOfService).click();
        driver.findElement(checkoutButton).click();
    }
    public void fillOutBillingAddress(){
        driver.findElement(billingFirstName).sendKeys();
        driver.findElement(billingLastName).sendKeys();
        driver.findElement(billingEmail).sendKeys();

        Select selectCountry = new Select(driver.findElement(billingCountry));
        selectCountry.selectByVisibleText("Egypt");

        driver.findElement(billingCity).sendKeys();
        driver.findElement(billingAddress1).sendKeys();
        driver.findElement(billingFirstZipPostalCode).sendKeys();
        driver.findElement(billingPhoneNumber).sendKeys();
        driver.findElement(continueButton).click();

    }
    public void selectShippingAddress(){
        driver.findElement(pickUpInStore).click();
        driver.findElement(continueButton).click();

    }
    public void choosePaymentMethod(){
        driver.findElement(paymentMethod).click();
        driver.findElement(continueButton).click();
    }
    public void paymentInformation(){
        driver.findElement(continueButton).click();
    }
    public void ConfirmOrder(){
       driver.findElement(confirmOrderButton).click();
    }
}
////input[@value='Go to cart']