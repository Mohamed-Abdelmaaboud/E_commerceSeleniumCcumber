package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

public class AddToCompareListDefinition {
//private HomePage homePage;
//private LoginPage loginPage;
//private SearchPage searchPage;
private AddToCompareList addToCompareList;
private WebDriver driver;

    @BeforeClass
    public void openPage() {

        //homePage = new HomePage();
        //homePage.openHomePage();
        System.setProperty("webdriver.chrome.driver", "chromedriver_linux64 (1)/chromedriver");
        driver = new ChromeDriver();
       // loginPage=new LoginPage(driver);
       // loginPage.Login();
    }
    @Given("logged user want to add a product to compare list")
    public void logged_user_want_to_add_a_product_to_compare_list(){
   addToCompareList=new AddToCompareList(driver);
   addToCompareList.addProductToCompareList();
    }
    @When("logged user click on add to compare list")
    public void logged_user_click_on_add_to_compare_list(){
        addToCompareList.clickAddToCompareList();
    }

    @Then("product will be added to compare list")
    public void product_will_be_added_to_compare_list(){
        String resultMessage = driver.getCurrentUrl();
        Assert.assertEquals(resultMessage,"http://demowebshop.tricentis.com/compareproducts");
    }

}


