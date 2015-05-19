package features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.RegistrationStep;

/**
 * Created by Valeriia on 18.05.2015.
 */

@RunWith(SerenityRunner.class)
public class RegistrationStory {
    @Managed
    WebDriver webDriver;

    @ManagedPages
    Pages pages;

    @Steps
    RegistrationStep registrationStep;

    @Test
    public void registration_new_person_with_filling_all_the_mandatory_fields() {
        registrationStep.get_main_page("http://gioia-profiterole.rhcloud.com/");
        registrationStep.click_on_registration_link();
        registrationStep.enter_login("MyLogin");
        registrationStep.enter_password("123456");
        registrationStep.enter_confirmPassword("123456");
        registrationStep.enter_email("dmytrievavi@gmail.com");
        registrationStep.click_i_am_agree();
        registrationStep.click_button_sign_up();
        registrationStep.should_see_text_user_already_exists("Пользователь с таким логином уже существует.");
    }

    @Test
    public void registration_new_person_withOut_password_and_confirm_password(){
        registrationStep.get_main_page("http://gioia-profiterole.rhcloud.com/");
        registrationStep.click_on_registration_link();
        registrationStep.enter_login("MyLogin");
        registrationStep.enter_email("dmytrievavi@gmail.com");
        registrationStep.click_i_am_agree();
        registrationStep.click_button_sign_up();
        registrationStep.should_see_text_user_already_exists("Пользователь с таким логином уже существует.");
        registrationStep.should_see_text_Password_Error("Длина пароля должна быть от 6 до 35 символов.");
    }
}
