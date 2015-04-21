import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.openqa.selenium.support.PageFactory.initElements;

/**
 * Created by v.dmitrieva on 21.04.15.
 */
public class YandexTestPage {
    private WebDriver driver;

    @BeforeClass
    public static void initPathese(){
        System.setProperty("webdriver.chrome.driver", "E:\\Git\\Homework\\YandexAutoTest\\chromedriver.exe");
    }

    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        //driver = new ChromeDriver();
        //driver = new HtmlUnitDriver();
        driver.get("http://yandex.ua");
    }

    @Test
    public void yandexSearchTest(){
        HomePage home = initElements(driver, HomePage.class);
        //driver.get("http://yandex.ua");
        home.search("war and peace");
    }

    /*@Test
    public void testMarketSearch(){

    }*/

    @After
    public void tearDown(){
        driver.quit();
    }


}
