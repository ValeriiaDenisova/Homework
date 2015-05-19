package features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.SearchStep;

/**
 * Created by v.dmitrieva on 19.05.15.
 */

@RunWith(SerenityRunner.class)
public class SearchStory {
    @Managed
    WebDriver webDriver;

    @ManagedPages
    Pages pages;

    @Steps
    SearchStep searchStep;

    @Test
    public void search_borsh() {
        searchStep.get_main_page("http://gioia-profiterole.rhcloud.com/");
        searchStep.enter_borsh_in_search_field("Борщ" + "\n");
    }
}
