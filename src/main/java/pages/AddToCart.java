package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {
    private WebDriver driver;
   // private LoginPage loginPage;
    private SearchPage searchPage;
    //private   By addToCartButton = By.xpath("//input[@value='Add to cart']");
    private By addToCartButton = By.id("add-to-cart-button-28");

    public AddToCart(WebDriver driver) {
        this.driver = driver;
    }
    public void searchProduct(){
        System.setProperty("webdriver.chrome.driver", "chromedriver_linux64 (1)/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/blue-and-green-sneaker");
        driver.manage().window().maximize();
        /*searchPage = new SearchPage(driver);
        searchPage.openSearchPage();
        searchPage.SearchProduct("Blue and green sneaker");*/
    }

    public void addProductToCart(){
        driver.findElement(addToCartButton).click();
        //loginPage = new LoginPage(driver);
        //loginPage.Login();
        //searchPage = new SearchPage(driver);
       // searchPage.openSearchPage();

    }
}

