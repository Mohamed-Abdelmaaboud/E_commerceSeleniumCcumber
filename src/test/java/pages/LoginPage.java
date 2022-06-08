package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

    WebDriver driver;
    By email = By.id("Email");
    By password = By.id("Password");
    By loginButton = By.className("login-button");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void openLoginPage(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver_linux64 (1)/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/login");
    }

    public void Login(){
        driver.findElement(email).sendKeys("mohamed.hassan@Example.com");
        driver.findElement(password).sendKeys("12345!");
        driver.findElement(loginButton).click();



    }
}

