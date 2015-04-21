import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Валерия on 17.04.2015.
 */
public class RezultPage {
    private WebDriver driver;

    public RezultPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getFirstLink() {
        return driver.findElement(By.xpath(".//*[@id='rso']//a[1]")).getText();
    }
}
