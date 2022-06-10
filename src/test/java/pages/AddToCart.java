package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {
    private WebDriver driver;


    private By addToCartButton = By.id("add-to-cart-button-28");

    public AddToCart(WebDriver driver) {
        this.driver = driver;
    }
    public void searchProduct(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver_linux64 (1)/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/blue-and-green-sneaker");
        driver.manage().window().maximize();

    }

    public void addProductToCart(){
        driver.findElement(addToCartButton).click();


    }
}

