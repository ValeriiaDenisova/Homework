package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

/**
 * Created by v.dmitrieva on 19.05.15.
 */
public class SearchPage extends PageObject {

    @FindBy(xpath = "//input[@class='search-query']")
    WebElement searchField;

    public void get_main_page(String url) {
        getDriver().get(url);
    }

    public void searchField(String search_word){
        searchField.sendKeys(search_word);
    }
}
