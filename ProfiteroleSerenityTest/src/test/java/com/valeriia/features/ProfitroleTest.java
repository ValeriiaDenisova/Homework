package com.valeriia.features;

import com.valeriia.steps.EndUserSteps;
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
import org.openqa.selenium.firefox.FirefoxDriver;

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
        driver = new FirefoxDriver();
        //driver = new InternetExplorerDriver();
        //driver = new ChromeDriver();
    }

    @Test
    public void registration_new_person_with_filling_all_the_mandatory_fields() {
        endUser.get_main_page("http://gioia-profiterole.rhcloud.com/");
        endUser.click_on_registration_link();
        endUser.enter_login("MyLogin");
        endUser.enter_password("123456");
        endUser.enter_confirmPassword("123456");
        endUser.enter_email("dmytrievavi@gmail.com");
        endUser.click_i_am_agree();
        endUser.click_button_sign_up();

       // endUser.should_see_text("Пользователь с таким логином уже существует.");
    }

    @Test
    public void registration_new_person_withOut_password_and_confirm_password(){
        endUser.get_main_page("http://gioia-profiterole.rhcloud.com/");
        endUser.click_on_registration_link();
        endUser.enter_login("MyLogin");
        endUser.enter_email("dmytrievavi@gmail.com");
        endUser.click_i_am_agree();
        endUser.click_button_sign_up();
    }

    @Test
    public void entry() {
        endUser.get_main_page("http://gioia-profiterole.rhcloud.com/");
        endUser.click_on_entry_link();
        endUser.enter_login_on_the_entry_page("MyLogin");
        endUser.enter_password_on_the_entry_page("123456");
        endUser.click_on_entry_button();
    }

    @Test
    public void change_profile() {
        endUser.get_main_page("http://gioia-profiterole.rhcloud.com/");
        endUser.click_on_entry_link();
        endUser.enter_login_on_the_entry_page("MyLogin");
        endUser.enter_password_on_the_entry_page("123456");
        endUser.click_on_entry_button();
        endUser.click_on_profile_link();
        endUser.click_on_profile_button();
        endUser.enter_new_password("123456");
        endUser.enter_new_confirmPassword("123456");
        endUser.enter_datepicker("02.05.1992");
        endUser.select_country_France();
        endUser.click_on_entry_button();
    }

    @Test
    public void create_menu_for_breakfast_with_ukrainian_kitchen() {
        endUser.get_main_page("http://gioia-profiterole.rhcloud.com/");
        endUser.click_on_create_menu();
        endUser.click_on_create_menu_for_day();
        endUser.click_on_breakfast();
        endUser.click_on_ukraine_kitchen();
        endUser.drag_and_drop_first_meal_snacks_on_you_breakfast_field();
    }

    @Test
    public void search_borsh() {
        endUser.get_main_page("http://gioia-profiterole.rhcloud.com/");
        endUser.enter_borsh_in_search_field("Борщ"+ "\n");
    }

    @Test
    public void viewJapaneseRecipe() {
        endUser.get_main_page("http://gioia-profiterole.rhcloud.com/");
        endUser.click_on_recipe();
        endUser.click_on_all_recipe();
        endUser.click_on_japanese_food();
        endUser.click_on_snacks();
        endUser.click_on_patties_with_onions();
    }

    @After
    public void exit(){
        driver.close();
        driver.quit();
    }

}
