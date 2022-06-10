package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.FilterWithColor;


public class FilterWithColorDefinition{
    WebDriver driver;

    private FilterWithColor filterWithColor;


    @BeforeClass
    public void openPage(){

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver_linux64 (1)/chromedriver");
        driver = new ChromeDriver();
    }

    @Given("user choose shoes color")
    public void user_choose_shoes_color(){
        filterWithColor = new FilterWithColor(driver);
        filterWithColor.SelectShoesColor();
    }
    @When("user click on chosen  color")
    public void user_click_on_chosen_color(){
        filterWithColor.clickShoesColor();
    }
    @Then("the color is chosen")
    public void the_color_is_chosen(){
        String expectedResult = driver.getCurrentUrl();
        Assert.assertEquals(expectedResult,"http://demowebshop.tricentis.com/blue-and-green-sneaker");
    }

}



