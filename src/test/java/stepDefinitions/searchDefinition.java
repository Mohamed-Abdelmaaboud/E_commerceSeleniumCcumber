package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.SearchPage;


public class searchDefinition {

    private SearchPage searchPage;
  ;
    private WebDriver driver ;
    @BeforeClass
    public void openPage(){

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver_linux64 (1)/chromedriver");
       driver=new ChromeDriver();

    }
    @Given("user is logged in")
    public void user_is_logged_in() {
        searchPage=new SearchPage(driver);
        searchPage.openSearchPage();

    }
    @When("user enter a product in search field and click on search button")
    public void user_enter_a_product_in_search_field_and_click_on_search_button(){

        searchPage.SearchProduct("14.1-inch Laptop");

    }
    @Then("search product will appear")
    public void search_product_will_appear(){
        String productUrl = "http://demowebshop.tricentis.com/141-inch-laptop";
        Assert.assertEquals(productUrl,driver.getCurrentUrl());
    }




}

