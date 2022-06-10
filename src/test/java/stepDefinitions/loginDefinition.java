package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.LoginPage;


public class loginDefinition {
    private WebDriver driver;

    private LoginPage loginPage;


    @Before
    public void openPage(){

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver_linux64 (1)/chromedriver");
        driver = new ChromeDriver();
        System.out.println("open browser");
    }
    @Given("user is on login page")
    public void user_is_on_login_page(){
       loginPage = new LoginPage(driver);
        loginPage.openLoginPage();

    }
    @When("user enter a valid credentials")
    public void user_enter_a_valid_credentials(){

        loginPage.Login();
    }
    @Then("user will be logged Successfully")
    public void user_will_be_logged_Successfully(){
        String expectedResult = driver.getCurrentUrl();
        Assert.assertEquals(expectedResult,"https://demowebshop.tricentis.com");
    }

   @After
    public void closePage(){
         driver.quit();
       System.out.println("close browser");
}

}
