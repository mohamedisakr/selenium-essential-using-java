import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium-Webdriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("1555 Park Blvd, Palo Alto, CA");
//        Thread.sleep(1000);
        WebDriverWait webDriverWait = new WebDriverWait(driver,10);

        WebElement autocompleteResult =  webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.className("pac-item")));
        // driver.findElement();
        autocompleteResult.click();

        driver.quit();
    }
}
