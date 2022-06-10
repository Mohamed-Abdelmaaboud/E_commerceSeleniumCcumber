package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FilterWithColor {
    private WebDriver driver;

    private By selectColor = By.id("product_attribute_28_1_11_29");

    public FilterWithColor(WebDriver driver) {

        this.driver = driver;
    }


    public void SelectShoesColor(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver_linux64 (1)/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/blue-and-green-sneaker");
        driver.manage().window().maximize();
    }
    public void clickShoesColor(){
        driver.findElement(selectColor).click();
    }

}
