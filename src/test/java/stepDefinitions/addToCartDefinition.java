package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AddToCart;
import pages.LoginPage;
import pages.SearchPage;
//import test.pages.AddToCart;
//import pages.HomePage;
//import test.pages.LoginPage;
//import test.pages.SearchPage;

public class addToCartDefinition {
   private AddToCart addToCart;
    private WebDriver driver;
    //private HomePage homePage;
    private LoginPage loginPage;
    private SearchPage searchPage;

    @BeforeClass
    public void openPage() {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver_linux64 (1)/chromedriver");
        driver = new ChromeDriver();


    }

    @Given("user is on found product page")
    public void user_is_on_found_product_page(){
        addToCart = new AddToCart(driver);
       addToCart.searchProduct();
    }
    @When("user click on add to cart button")
    public void user_click_on_add_to_cart_button(){

      addToCart.addProductToCart();

    }
    @Then("product will be added")
    public void product_will_be_added(){
        String resultMessage = driver.findElement(By
                        .xpath("//*[@id='bar-notification']//*[text()='The product has been added to your ']"))
                        .getText();
        Assert.assertEquals(resultMessage,"The product has been added to your shopping cart");
    }
    @AfterClass
    public void closePage(){
        driver.close();
    }

}


