package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.CreateMenuPage;

import static com.thoughtworks.selenium.SeleneseTestBase.assertTrue;

/**
 * Created by v.dmitrieva on 19.05.15.
 */
public class CreateMenuStep extends ScenarioSteps {

    CreateMenuPage createMenuPage;

    @Step
    public void get_main_page(String url) {
        createMenuPage.get_main_page(url);
        assertTrue(createMenuPage.containsText("Добро пожаловать на сайт"));
    }

    @Step
    public void click_on_create_menu() {
        createMenuPage.createMenu();
    }

    @Step
    public void click_on_create_menu_for_day() {
        createMenuPage.createMenuForDay();
    }

    @Step
    public void click_on_breakfast() {
        createMenuPage.breakfast();
    }

    @Step
    public void click_on_ukraine_kitchen() {
        createMenuPage.ukraineKitchen();
    }

    @Step
    public void drag_and_drop_first_meal_snacks_on_you_breakfast_field() {
        createMenuPage.dragAndDrop();
    }

    @Step
    public void add_the_same_meal() {
        createMenuPage.plus();
    }

    @Step
    public void click_on_breakfast_button_ready() {
        createMenuPage.clickOnBreakfactButtonReady();
    }

    @Step
    public void click_on_dinner_button_ready() {
        createMenuPage.clickOnDinnerButtonReady();
    }

    @Step
    public void click_on_dinner() {
        createMenuPage.dinner();
    }

    @Step
    public void click_on_japanese_kitchen() {
        createMenuPage.japaneseKitchen();
    }

    @Step
    public void click_on_second_meal() {
        createMenuPage.second();
    }

    @Step
    public void drag_and_drop_second_meal_on_you_breakfast_field() {
        createMenuPage.dragAndDropDinner();
    }
}
