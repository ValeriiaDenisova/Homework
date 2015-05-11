import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by v.dmitrieva on 21.04.15.
 */
public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver){
      this.driver = driver;
    }

    public RezultPage search(String text) throws InterruptedException {
        driver.findElement(By.xpath(".//*[@id='text']")).sendKeys(text);
        driver.findElement(By.cssSelector(".button.suggest2-form__button")).click();

        return new RezultPage(driver);
    }

    public void market (String text){
        driver.findElement(By.xpath(".//*[@id='tab-market']")).click();
        driver.findElement(By.id("header-search")).sendKeys(text);
        driver.findElement(By.cssSelector("button[class^='button button_size_m button_side_right']")).click();
    }

}
