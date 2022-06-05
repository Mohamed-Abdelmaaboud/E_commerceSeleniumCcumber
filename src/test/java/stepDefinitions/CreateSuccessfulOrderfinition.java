package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

public class CreateSuccessfulOrderfinition {
    private AddToCart addToCart;
    private WebDriver driver;
    //private HomePage homePage;
    private LoginPage loginPage;
    CreateSuccessfulOrder createSuccessfulOrder;
    private SearchPage searchPage;

    @BeforeClass
    public void openPage() {

       // homePage = new HomePage();
       // homePage.openHomePage();
        System.setProperty("webdriver.chrome.driver", "chromedriver_linux64 (1)/chromedriver");
        driver = new ChromeDriver();
        /*loginPage = new LoginPage(driver);
        loginPage.openLoginPage();
        loginPage.Login();
        searchPage = new SearchPage(driver);
        searchPage.SearchProduct("Blue and green sneaker");
        addToCart = new AddToCart(driver);
        addToCart.addProductToCart();*/

    }

    @Given("user go to shopping cart")
    public void user_go_to_shopping_cart(){
     createSuccessfulOrder = new CreateSuccessfulOrder(driver);
     createSuccessfulOrder.openShoppingCart();
    }
    @When("user click on checkout ")
    public void user_click_on_checkout(){
      createSuccessfulOrder.clickCheckout();
    }
    @And(" And filling out billing address")
    public void filling_out_billing_address(){
        createSuccessfulOrder.fillOutBillingAddress();
    }
    @And("choose the address")
    public void choose_the_address(){
        createSuccessfulOrder.selectShippingAddress();
    }
    @And("choose the payment method")
    public void choose_the_payment_method(){
        createSuccessfulOrder.choosePaymentMethod();
        createSuccessfulOrder.paymentInformation();
    }
    @And ("confirm order")
    public void confirm_order(){
        createSuccessfulOrder.ConfirmOrder();
    }
    @Then("the product is ordered successfully")
    public void the_product_is_ordered_successfully(){
        String resultMessage = driver.findElement(By
                        .xpath("//div[@class='title']")).getText();

        Assert.assertEquals(resultMessage,"Your order has been successfully processed!");
    }
    @AfterClass
    public void closePage(){
        driver.close();
    }

}






