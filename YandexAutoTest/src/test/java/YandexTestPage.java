import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by v.dmitrieva on 21.04.15.
 */
public class YandexTestPage {
    private WebDriver driver;

    @Before
    public void setUp(){
        driver = new FirefoxDriver();
        driver.get("http://yandex.ua");
    }

    @Test
    public void testSearch(){
        HomePage home = new HomePage(driver);
        RezultPage rezult = home.search("war and peace");
    }


}
