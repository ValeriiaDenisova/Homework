import com.opera.core.systems.OperaDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


import static org.openqa.selenium.support.PageFactory.initElements;
import static org.testng.Assert.assertEquals;

/**
 * Created by v.dmitrieva on 23.04.15.
 */
public class RanorexTest {
    private WebDriver driver;

    @BeforeClass
    public static void initPathese() {
        System.setProperty("webdriver.chrome.driver", "E:\\Git\\Homework\\MyRanorexTest\\src\\test\\drivers\\chromedriver.exe");
        System.setProperty("webdriver.ie.driver", "E:\\Git\\Homework\\MyRanorexTest\\src\\test\\drivers\\IEDriverServer.exe");

    }

    @Before
    public void setUp(){
        //driver = new FirefoxDriver();
        driver = new ChromeDriver();
        //driver = new InternetExplorerDriver();
        //driver = new HtmlUnitDriver();
    }

    @Test
    public void addPersonInDataBase () throws InterruptedException {
        driver.get("http://www.ranorex.com/web-testing-examples/vip/");
        HomePage home = initElements(driver, HomePage.class);
        home.addManInDataBase("Ivanov", "Ivan");
        assertEquals(home.checkPerson(), "Ivanov");
        Thread.sleep(1000);
        home.addWomanInDataBase("Kykyshkina", "Valiia");
        Thread.sleep(1000);

    }

    @Test
    public void deletePersonFromDabaBase() throws InterruptedException {
        driver.get("http://www.ranorex.com/web-testing-examples/vip/");
        HomePage home = initElements(driver, HomePage.class);
        home.addManInDataBase("Ivanov", "Ivan");
        Thread.sleep(1000);
        home.addWomanInDataBase("Kykyshkina", "Valiia");
        Thread.sleep(1000);
        home.deleteFirstPerson();
        Thread.sleep(1000);
        home.clearDataBase();
        home.vipCount();
        assertEquals(home.vipCount(), "VIP count: 0");
        Thread.sleep(1000);
    }

    @After
    public void exit(){
        driver.close();
    }




}
