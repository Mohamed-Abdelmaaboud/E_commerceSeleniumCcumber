package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchPage {
    private  WebDriver driver;
    private LoginPage loginPage;
   // private By search = By.xpath("//*[contains(@name,'q')]");
   private By search = By.xpath("//input[@name='q']");
    private   By searchButton = By.className("search-box-button");

    public SearchPage(WebDriver driver) {

        this.driver = driver;
    }
  public void openSearchPage(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver_linux64 (1)/chromedriver");
        driver = new ChromeDriver();
     // loginPage = new LoginPage(driver);
      //loginPage.openLoginPage();
     // loginPage.Login();
       driver.get("http://demowebshop.tricentis.com/");
       driver.manage().window().maximize();
  }

    public void SearchProduct(String product){
        driver.findElement(search).sendKeys(product);
        driver.findElement(searchButton).click();


    }
}
