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

    public void market (){
        driver.findElement(By.xpath())
    }

}
