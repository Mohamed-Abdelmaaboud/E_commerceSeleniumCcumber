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
//import pages.HomePage;
import pages.RegisterPage;
//import test.pages.RegisterPage;

public class registerDefinition {
   private WebDriver driver;
   //private HomePage homePage;
   private RegisterPage registerPage;
@BeforeClass
public void openPage(){
    //homePage = new HomePage();
    //homePage.openHomePage();
    System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver_linux64 (1)/chromedriver");
    driver = new ChromeDriver();
}

    @Given("user open the register page")
    public void user_open_the_register_Page(){

        registerPage = new RegisterPage(driver);
        registerPage.openRegisterPage();

    }
    @When("user enter a valid email and a valid password")
    public void user_enter_a_valid_email_and_a_valid_password(){
        registerPage.register();
    }

    @Then("user will be registered successfully")
    public void user_will_be_registered_successfully(){
        String result = driver.findElement(By.className("result")).getText();
        Assert.assertEquals(result,"Your registration completed");

        //driver.findElement(By.className("button-1 register-continue-button")).click();
    }

@AfterClass
    public void closePage(){
    driver.close();
}
}
