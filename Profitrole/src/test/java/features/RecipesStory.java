package features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.RecipesStep;

/**
 * Created by v.dmitrieva on 19.05.15.
 */

@RunWith(SerenityRunner.class)
public class RecipesStory {
    @Managed
    WebDriver webDriver;

    @ManagedPages
    Pages pages;

    @Steps
    RecipesStep recipesStep;

    @Test
    public void view_Japanese_recipe() {
        recipesStep.get_main_page("http://gioia-profiterole.rhcloud.com/");
        recipesStep.click_on_recipe();
        recipesStep.click_on_all_recipe();
        recipesStep.click_on_japanese_food();
        recipesStep.click_on_snacks();
        recipesStep.click_on_patties_with_onions();
    }
}
