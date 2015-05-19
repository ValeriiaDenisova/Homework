package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

/**
 * Created by v.dmitrieva on 19.05.15.
 */
public class RecipesPage extends PageObject {

    @FindBy(xpath = "//a[contains(text(),'Рецепты')]")
    WebElement recipe;

    @FindBy(xpath = "//a[contains(text(),'Все рецепты')]")
    WebElement allRecipe;

    @FindBy(xpath = "//img[@alt='Японская']")
    WebElement japaneseFood;

    @FindBy(xpath = "//a[contains(text(),'Закуски')]")
    WebElement snacks;

    @FindBy(xpath = "//div[contains(text(),'Пирожки с луком')]")
    WebElement pattiesWithOnions;

    public void get_main_page(String url) {
        getDriver().get(url);
    }

    public void recipe(){
        recipe.click();
    }

    public void allRecipe(){
        allRecipe.click();
    }

    public void japaneseFood(){
        japaneseFood.click();
    }

    public void snacks(){
        snacks.click();
    }

    public void pattiesWithOnions() {
        pattiesWithOnions.click();
    }
}
