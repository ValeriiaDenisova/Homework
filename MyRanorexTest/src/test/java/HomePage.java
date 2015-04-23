import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by v.dmitrieva on 23.04.15.
 */
public class HomePage {
    private WebDriver driver;

    public HomePage (WebDriver driver){
        this.driver = driver;
    }

    public void addManInDataBase(String firstName, String lastName) {
        driver.findElement(By.id("FirstName")).sendKeys(firstName);
        driver.findElement(By.id("LastName")).sendKeys(lastName);
        driver.findElement(By.xpath("//input[@value='male']")).click();
        driver.findElement(By.xpath(".//*[@id='Category']/option[2]")).click();
        driver.findElement(By.id("Add")).click();
    }

    public void addWomanInDataBase(String firstName, String lastName) {
        driver.findElement(By.id("FirstName")).sendKeys(firstName);
        driver.findElement(By.id("LastName")).sendKeys(lastName);
        driver.findElement(By.xpath("//input[@value='female']")).click();
        driver.findElement(By.xpath(".//*[@id='Category']/option[3]")).click();
        driver.findElement(By.id("Add")).click();
    }
}
