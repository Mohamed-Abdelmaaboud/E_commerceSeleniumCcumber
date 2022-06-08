package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToWishList {
    private WebDriver driver;
    private By AddTWishListButton =By.id("add-to-wishlist-button-28");

    public AddToWishList(WebDriver driver){

        this.driver = driver;
    }
    public void addProductToWishList(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver_linux64 (1)/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/blue-and-green-sneaker");
        driver.manage().window().maximize();
    }

    public void clickAddToWIshList(){

        driver.findElement(AddTWishListButton).click();
    }

}
