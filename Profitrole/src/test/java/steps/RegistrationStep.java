package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.RegistrationPage;

import static com.thoughtworks.selenium.SeleneseTestBase.assertTrue;
import static com.thoughtworks.selenium.SeleneseTestNgHelper.assertEquals;

/**
 * Created by Valeriia on 18.05.2015.
 */
public class RegistrationStep extends ScenarioSteps {

    RegistrationPage registrationPage;

    @Step
    public void get_main_page(String url) {
        registrationPage.get_main_page(url);
        assertTrue(registrationPage.containsText("Добро пожаловать на сайт"));
    }

    @Step
    public void click_on_registration_link() {
        registrationPage.registration();
    }

    @Step
    public void enter_login(String login) {
        registrationPage.fieldLogin(login);
    }

    @Step
    public void enter_password(String password) {
        registrationPage.fieldPassword(password);
    }

    @Step
    public void enter_confirmPassword(String confirmPassword) {
        registrationPage.fieldConfirmPassword(confirmPassword);
    }

    @Step
    public void enter_email(String email) {
        registrationPage.fieldEmail(email);
    }

    @Step
    public void click_i_am_agree() {
        registrationPage.iAmAgree();
    }

    @Step
    public void click_button_sign_up() {
        registrationPage.signUp();
    }

    @Step
    public void should_see_text_user_already_exists(String message) {
        assertEquals(message, registrationPage.getMessageUserAlreadyExists());
    }

    @Step
    public void should_see_text_Password_Error(String message) {
        assertTrue(registrationPage.containsText(message));
    }

}
