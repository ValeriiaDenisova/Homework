package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.SearchPage;

import static com.thoughtworks.selenium.SeleneseTestBase.assertTrue;

/**
 * Created by v.dmitrieva on 19.05.15.
 */
public class SearchStep extends ScenarioSteps {

    SearchPage searchPage;

    @Step
    public void get_main_page(String url) {
        searchPage.get_main_page(url);
        assertTrue(searchPage.containsText("Добро пожаловать на сайт"));
    }

    @Step
    public void enter_borsh_in_search_field(String search_word) {
        searchPage.searchField(search_word);
        assertTrue(searchPage.containsText("Борщ"));
    }
}
