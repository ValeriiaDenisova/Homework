package features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.CreateMenuStep;

/**
 * Created by v.dmitrieva on 19.05.15.
 */
@RunWith(SerenityRunner.class)
public class CreateMenuStory {
    @Managed
    WebDriver webDriver;

    @ManagedPages
    Pages pages;

    @Steps
    CreateMenuStep createMenuStep;

    @Test
    public void create_menu_for_breakfast_with_ukrainian_kitchen() {
        createMenuStep.get_main_page("http://gioia-profiterole.rhcloud.com/");
        createMenuStep.click_on_create_menu();
        createMenuStep.click_on_create_menu_for_day();
        createMenuStep.click_on_breakfast();
        createMenuStep.click_on_ukraine_kitchen();
        createMenuStep.drag_and_drop_first_meal_snacks_on_you_breakfast_field();
        createMenuStep.add_the_same_meal();
        createMenuStep.click_on_breakfast_button_ready();
    }

    @Test
    public void create_menu_for_dinner_with_japanese_kitchen() {
        createMenuStep.get_main_page("http://gioia-profiterole.rhcloud.com/");
        createMenuStep.click_on_create_menu();
        createMenuStep.click_on_create_menu_for_day();
        createMenuStep.click_on_dinner();
        createMenuStep.click_on_japanese_kitchen();
        createMenuStep.click_on_second_meal();
        createMenuStep.drag_and_drop_second_meal_on_you_breakfast_field();
        createMenuStep.click_on_dinner_button_ready();
    }

    @Test
    public void create_menu_on_tuesday_for_supper_with_french_kitchen() {
        createMenuStep.get_main_page("http://gioia-profiterole.rhcloud.com/");
        createMenuStep.click_on_create_menu();
        createMenuStep.click_on_create_menu_for_the_week();
        createMenuStep.click_on_tuesday();
        createMenuStep.click_on_supper();
        createMenuStep.click_on_french_kitchen();
        createMenuStep.click_on_dessert();
        createMenuStep.drag_and_drop_strawberry_mousse();
        createMenuStep.click_on_supper_button_ready();
    }
}
