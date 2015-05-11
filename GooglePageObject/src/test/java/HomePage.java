import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Валерия on 17.04.2015.
 */
public class HomePage {
    private WebDriver driver;

    public HomePage(FirefoxDriver driver) {
        this.driver = driver;
    }

    public RezultPage search(String text) {
        driver.findElement(By.id("lst-ib")).sendKeys(text);
        return new RezultPage(driver);
    }
}
