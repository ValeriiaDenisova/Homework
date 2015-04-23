import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.openqa.selenium.support.PageFactory.initElements;

/**
 * Created by v.dmitrieva on 23.04.15.
 */
public class RanorexTest {
    private WebDriver driver;

    @BeforeClass
    public static void initPathese(){
        System.setProperty("webdriver.chrome.driver", "E:\\Git\\Homework\\MyRanorexTest\\src\\test\\drivers\\chromedriver.exe");
    }

    @Before
    public void setUp(){
        //driver = new FirefoxDriver();
        driver = new ChromeDriver();
    }

    @Test
    public void addPersonInDataBase () throws InterruptedException {
        driver.get("http://www.ranorex.com/web-testing-examples/vip/");
        HomePage home = initElements(driver, HomePage.class);
        home.addManInDataBase("Ivanov", "Ivan");
        Thread.sleep(2000);
        home.addWomanInDataBase("Kykyshkina", "Valiia");
        Thread.sleep(2000);
    }


}
