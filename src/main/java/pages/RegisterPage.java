package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterPage {

   private WebDriver driver;
    By Male = By.id("gender-male");
    By FirstName = By.id("FirstName");
    By LastName = By.id("LastName");
    By Email = By.id("Email");
    By Password = By.id("Password");
    By ConfirmPassword = By.id("ConfirmPassword");
    By RegisterButton = By.id("register-button");

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openRegisterPage() {
        System.setProperty("webdriver.chrome.driver", "chromedriver_linux64 (1)/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/register");
    }

    public void register() {
        driver.findElement(Male).click();
        driver.findElement(FirstName).sendKeys("mohamed");
        driver.findElement(LastName).sendKeys("hassan");
        driver.findElement(Email).sendKeys("mohamed.hassan@Example.com");
        driver.findElement(Password).sendKeys("12345!");
        driver.findElement(ConfirmPassword).sendKeys("12345!");
        driver.findElement(RegisterButton).click();



    }



    //private void idElement(String id){
        //driver.findElement(By.id(id));
    //}
}
