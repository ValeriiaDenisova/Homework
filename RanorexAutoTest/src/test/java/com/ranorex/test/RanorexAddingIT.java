package com.ranorex.test;

import com.ranorex.pages.RanorexMainPage;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.openqa.selenium.support.PageFactory.initElements;

/**
 * Created by User on 18.04.2015.
 */
public class RanorexAddingIT {

    @BeforeClass
    public static void initPathese(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\ranorextest\\drivers\\chromedriver.exe");
    }

    @Test
    public  void userCanAddPersonToRanorex(){
        System.out.println("HAHAHA " + System.getProperty("webdriver.chrome.driver"));
        //WebDriver a = new FirefoxDriver();
        //WebDriver a = new HtmlUnitDriver();
        WebDriver webDriver = new ChromeDriver();
        RanorexMainPage ranorexMainPage = initElements(webDriver, RanorexMainPage.class);
        webDriver.get("");

        ranorexMainPage.enterQueryString("Test");
        ranorexMainPage.search();

        webDriver.quit();
    }
}
