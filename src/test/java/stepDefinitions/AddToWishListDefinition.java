package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AddToWishList;
import pages.LoginPage;
import pages.SearchPage;


public class AddToWishListDefinition {
private AddToWishList addToWishList;
private WebDriver driver;

    @BeforeClass
    public void openPage() {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver_linux64 (1)/chromedriver");
        driver = new ChromeDriver();
    }
    @Given("logged user found a product")
    public void logged_user_found_a_product(){
        addToWishList = new AddToWishList(driver);
        addToWishList.addProductToWishList();
    }
    @When("logged user click on add to wish list")
    public void logged_user_click_on_add_to_wish_list(){

        addToWishList.clickAddToWIshList();
    }

    @Then("product will be added to wish list")
    public void product_will_be_added_to_wish_list(){
        String resultMessage = driver.findElement(By
                        .xpath("//*[@id='bar-notification']//*[text()='The product has been added to your ']"))
                .getText();
        Assert.assertEquals(resultMessage,"The product has been added to your wishlist");
    }

}


