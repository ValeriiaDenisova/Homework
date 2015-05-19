package features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.EntryStep;

/**
 * Created by v.dmitrieva on 19.05.15.
 */

@RunWith(SerenityRunner.class)
public class EntryStory {
    @Managed
    WebDriver webDriver;

    @ManagedPages
    Pages pages;

    @Steps
    EntryStep entryStep;

    @Test
    public void entry() {
        entryStep.get_main_page("http://gioia-profiterole.rhcloud.com/");
        entryStep.click_on_entry_link();
        entryStep.enter_login_on_the_entry_page("MyLogin");
        entryStep.enter_password_on_the_entry_page("123456");
        entryStep.click_on_entry_button();
    }

    @Test
    public void change_profile() {
        entryStep.get_main_page("http://gioia-profiterole.rhcloud.com/");
        entryStep.click_on_entry_link();
        entryStep.enter_login_on_the_entry_page("MyLogin");
        entryStep.enter_password_on_the_entry_page("123456");
        entryStep.click_on_entry_button();
        entryStep.click_on_profile_link();
        entryStep.click_on_profile_button();
        entryStep.enter_new_password("123456");
        entryStep.enter_new_confirmPassword("123456");
        entryStep.enter_datepicker("02.05.1992");
        entryStep.select_country_France();
        entryStep.click_on_entry_button();
    }
}
