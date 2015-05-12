package com.valeriia;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Created by v.dmitrieva on 07.05.15.
 */
@RunWith(SerenityRunner.class)
public class ProfitroleTest {
    @Managed
    private WebDriver driver;

    @ManagedPages(defaultUrl = "http://gioia-profiterole.rhcloud.com/")
    public Pages pages;

    @Steps
    public EndUserSteps endUser;

    @BeforeClass
    public static void initPathese() {
        System.setProperty("webdriver.chrome.driver", "E:\\Git\\Homework\\ProfiteroleSerenityTest\\src\\test\\drivers\\chromedriver.exe");
        System.setProperty("webdriver.ie.driver", "E:\\Git\\Homework\\ProfiteroleSerenityTest\\src\\test\\drivers\\IEDriverServer.exe");
    }

    @Before
    public void setUp() {
        //driver = new FirefoxDriver();
        //driver = new InternetExplorerDriver();
        driver = new ChromeDriver();
    }

    @Test
    public void registrationNewPersonTest() {
        endUser.getMain("http://gioia-profiterole.rhcloud.com/");
        endUser.registrationNewPersonWithFillingAllTheMandatoryFields();

    }

    @Test
    public void registrationNewPersonWithOutPasswordAndConfirmPasswordTest(){
        endUser.getMain("http://gioia-profiterole.rhcloud.com/");
        endUser.registrationNewPersonWithOutPasswordAndConfirmPassword();
    }

    @Test
    public void entry() {
        endUser.getMain("http://gioia-profiterole.rhcloud.com/");
        endUser.entry();
    }

    @Test
    public void changeProfile() {
        endUser.getMain("http://gioia-profiterole.rhcloud.com/");
        endUser.entry();
        endUser.changeProfile();
    }

    @Test
    public void createMenuForBreakfastWithUkrainianKitchen() {
        endUser.getMain("http://gioia-profiterole.rhcloud.com/");
        endUser.createBreakfastForDay();


    }

    @After
    public void exit(){
        driver.close();
    }

}
