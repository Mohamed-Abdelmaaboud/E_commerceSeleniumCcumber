package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCompareList {
    private WebDriver driver;
    private By addToCompareButton = By.className("add-to-compare-list-button");


    public AddToCompareList(WebDriver driver){

        this.driver = driver;
    }
    public void addProductToCompareList(){
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver_linux64 (1)/chromedriver");
            driver = new ChromeDriver();
            driver.get("http://demowebshop.tricentis.com/blue-and-green-sneaker");
            driver.manage().window().maximize();
        }
        public void clickAddToCompareList(){

        driver.findElement(addToCompareButton).click();
    }
}
