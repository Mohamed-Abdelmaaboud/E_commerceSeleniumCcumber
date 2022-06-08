package stepDefinitions;

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
import pages.SelectCategories;
//import test.pages.LoginPage;
//import test.pages.SelectCategories;

public class SelectCategorieDefinition  {

    private WebDriver driver;
    private LoginPage loginPage;
    //private HomePage homePage;
    private SelectCategories selectCategories;

    @Before
    public void openPage(){
        //homePage = new HomePage();
        //homePage.openHomePage();
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver_linux64 (1)/chromedriver");
        driver = new ChromeDriver();
    }

    @Given("user  log in  the website")
    public void user_log_in_the_website(){
        loginPage = new LoginPage(driver);
        loginPage.Login();
    }
    @When("user click on any product Categorie and subcategorie")
    public void user_click_on_any_product_Categorie_and_subcategorie(){
        selectCategories = new SelectCategories(driver);
        selectCategories.openProductCategorie();

    }
    @Then("the product categorie and sub categorie is opened")
    public void the_product_categorie_and_sub_categorie_is_opened(){
        String expectedResult = driver.getCurrentUrl();
        Assert.assertEquals("http://demowebshop.tricentis.com/desktops",expectedResult);
    }


    @AfterClass
    public void closePage(){
        driver.close();
    }
}
