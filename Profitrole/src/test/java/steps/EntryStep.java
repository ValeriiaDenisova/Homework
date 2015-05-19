package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.EntryPage;

import static com.thoughtworks.selenium.SeleneseTestBase.assertTrue;

/**
 * Created by v.dmitrieva on 19.05.15.
 */
public class EntryStep extends ScenarioSteps {

    EntryPage entryPage;

    @Step
    public void get_main_page(String url) {
        entryPage.get_main_page(url);
        assertTrue(entryPage.containsText("Добро пожаловать на сайт"));
    }

    @Step
    public void click_on_entry_link() {
        entryPage.entry();
    }

    @Step
    public void enter_login_on_the_entry_page(String enter_login) {
        entryPage.entryLogin(enter_login);
    }

    @Step
    public void enter_password_on_the_entry_page(String enter_password) {
        entryPage.entryPassword(enter_password);
    }

    @Step
    public void click_on_entry_button() {
        entryPage.entryButton();
    }

    @Step
    public void click_on_profile_link() {
        entryPage.profile();
    }

    @Step
    public void click_on_profile_button() {
        entryPage.entryButton();
    }

    @Step
    public void enter_new_password(String enter_new_password) {
        entryPage.fieldChangePassword(enter_new_password);
    }

    @Step
    public void enter_new_confirmPassword(String enter_new_confirmPassword) {
        entryPage.fieldConfirmPassword(enter_new_confirmPassword);
    }

    @Step
    public void enter_datepicker(String datepicker) {
        entryPage.fieldDatepickerClean();
        entryPage.fieldDatepicker(datepicker);
    }

    @Step
    public void select_country_France() {
        entryPage.country();
    }



}
