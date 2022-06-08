package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResetPassword {
    WebDriver driver;
    By recoveryEmail = By.id("Email");
    By recoveryButton = By.className("password-recovery-button");

    public ResetPassword(WebDriver driver) {
        this.driver = driver;
    }
    public void openResetPasswordPage(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver_linux64 (1)/chromedriver");
        driver = new ChromeDriver();
        driver.navigate().to("http://demowebshop.tricentis.com/passwordrecovery");
    }

    public void newPassword(){
        driver.findElement(recoveryEmail).sendKeys("mohamed.hussein@example.com");
        driver.findElement(recoveryButton).click();

    }

}
