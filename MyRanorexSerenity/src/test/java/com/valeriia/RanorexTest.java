package com.valeriia;

import com.thoughtworks.selenium.SeleneseTestNgHelper;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.runner.RunWith;

import static com.thoughtworks.selenium.SeleneseTestNgHelper.assertEquals;
import static org.openqa.selenium.support.PageFactory.initElements;


/**
 * Created by v.dmitrieva on 23.04.15.
 */
@RunWith(SerenityRunner.class)
public class RanorexTest {

    @Managed
    private WebDriver driver;

    @ManagedPages(defaultUrl = "http://www.ranorex.com/web-testing-examples/vip/")
    public Pages pages;

    @Steps
    public EndUserSteps endUser;

    @BeforeClass
    public static void initPathese() {
        System.setProperty("webdriver.chrome.driver", "E:\\Git\\Homework\\MyRanorexSerenity\\src\\test\\drivers\\chromedriver.exe");
        System.setProperty("webdriver.ie.driver", "E:\\Git\\Homework\\MyRanorexSerenity\\src\\test\\drivers\\IEDriverServer.exe");

    }

    @Before
    public void setUp(){
        driver = new FirefoxDriver();
        //driver = new ChromeDriver();
        //driver = new InternetExplorerDriver();
        //driver = new HtmlUnitDriver();
    }

    @Test
    public void addPersonInDataBase () throws InterruptedException {
        endUser.getMain("http://www.ranorex.com/web-testing-examples/vip/");
        endUser.addManInDataBase();
        Thread.sleep(1000);
        endUser.addWomanInDataBase();
        Thread.sleep(1000);

    }

    @Test
    public void deletePersonFromDabaBase() throws InterruptedException {
        endUser.getMain("http://www.ranorex.com/web-testing-examples/vip/");
        endUser.addManInDataBase();
        Thread.sleep(1000);
        endUser.addWomanInDataBase();
        Thread.sleep(1000);
        endUser.deleteFirstPerson();
        Thread.sleep(1000);
        endUser.clearDataBase();
        endUser.vipCount();
        Thread.sleep(1000);
    }

    @After
    public void exit(){
        driver.close();
    }

}
