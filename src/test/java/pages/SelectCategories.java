package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectCategories {
 private WebDriver driver;
 By computerCategorie = By.linkText("Computers");
 By desktopSubcategorie = By.linkText("Desktop");

    public SelectCategories(WebDriver driver) {
        this.driver = driver;
    }

    public void openProductCategorie(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver_linux64 (1)/chromedriver");
        driver = new ChromeDriver();

     driver.findElement(computerCategorie).click();
     driver.findElement(desktopSubcategorie).click();


 }

}
