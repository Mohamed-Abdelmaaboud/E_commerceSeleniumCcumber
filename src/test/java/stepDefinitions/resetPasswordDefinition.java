package stepDefinitions;

import io.cucumber.java.Before;
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
import pages.ResetPassword;

public class resetPasswordDefinition {
    //private HomePage homePage;
    private ResetPassword setNewPassword;
    WebDriver driver;
    @BeforeClass
    public void openPage(){
        //homePage = new HomePage();
        //homePage.openHomePage();
        System.setProperty("webdriver.chrome.driver", "chromedriver_linux64 (1)/chromedriver");
        driver = new ChromeDriver();
    }

    @Given("user is on reset password page")
    public void user_is_on_reset_password_page(){
        setNewPassword = new ResetPassword(driver);
        setNewPassword.openResetPasswordPage();

    }
    @When("user enter a valid email address")
    public void user_enter_a_valid_email_address(){
    setNewPassword.newPassword();

    }
    @Then("an email with instructions  is sent to the user")
    public void an_email_with_instructions_is_sent_to_the_user(){
        String expectedMessage = driver.findElement(By.className("result")).getText();
        Assert.assertEquals(expectedMessage,"Email with instructions has been sent to you.");

    }
    @AfterClass
    public void closePage(){
        driver.close();
    }

}



