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
//import pages.HomePage;
import pages.LoginPage;
import pages.SearchPage;

public class searchDefinition {
    //private LoginPage loginPage;
    private SearchPage searchPage;
    //private HomePage homePage;
    private WebDriver driver ;
    @BeforeClass
    public void openPage(){
        //homePage = new HomePage();
        //homePage.openHomePage();
        System.setProperty("webdriver.chrome.driver", "chromedriver_linux64 (1)/chromedriver");
       driver=new ChromeDriver();

    }
    @Given("user is logged in")
    public void user_is_logged_in() {
       //loginPage=new LoginPage(driver);
      //  loginPage.openLoginPage();
       // loginPage.Login();
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



   /* @AfterClass
    public void closePage(){
        driver.close();
    }*/

}

