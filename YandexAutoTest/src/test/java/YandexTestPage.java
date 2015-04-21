import org.openqa.selenium.WebDriver;

/**
 * Created by v.dmitrieva on 21.04.15.
 */
public class YandexTestPage {
    private WebDriver driver;

    public YandexTestPage(WebDriver driver){
        this.driver = driver;
    }

    public void open(){
        driver.get("http://yandex.ua");
    }

    public void testSearch(){
        HomePage home = new HomePage();
    }


}
