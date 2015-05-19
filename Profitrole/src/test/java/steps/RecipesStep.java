package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.RecipesPage;

import static com.thoughtworks.selenium.SeleneseTestBase.assertTrue;

/**
 * Created by v.dmitrieva on 19.05.15.
 */
public class RecipesStep extends ScenarioSteps {

    RecipesPage recipesPage;

    @Step
    public void get_main_page(String url) {
        recipesPage.get_main_page(url);
        assertTrue(recipesPage.containsText("Добро пожаловать на сайт"));
    }

    @Step
    public void click_on_recipe() {
        recipesPage.recipe();
    }

    @Step
    public void click_on_all_recipe() {
        recipesPage.allRecipe();
    }

    @Step
    public void click_on_japanese_food() {
        recipesPage.japaneseFood();
    }

    @Step
    public void click_on_snacks() {
        recipesPage.snacks();
    }

    @Step
    public void click_on_patties_with_onions() {
        recipesPage.pattiesWithOnions();
        assertTrue(recipesPage.containsText("Пирожки с луком"));
    }
}
