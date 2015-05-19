package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by v.dmitrieva on 19.05.15.
 */
public class CreateMenuPage extends PageObject {

    @FindBy(xpath = "//a[contains(text(),'Создать меню')]")
    WebElement createMenu;

    @FindBy(xpath = "//a[@href='/menu']")
    WebElement createMenuForDay;

    @FindBy(xpath = "//a[@href='/menuForWeek']")
    WebElement createMenuForWeek;

    @FindBy(xpath = "//button[@value='#breakfast']")
    WebElement breakfast;

    @FindBy(xpath = "//img[@alt='Украинская']")
    WebElement ukraineKitchen;

    @FindBy(xpath = "//img[@alt='Японская']")
    WebElement japaneseKitchen;

    @FindBy(xpath = "//img[@alt='Французская']")
    WebElement frenchKitchen;

    @FindBy(xpath = ".//*[@id='cuisine']/div[4]/div[2]/span/img")
    WebElement firstMealSnacks;

    @FindBy(xpath = ".//*[@id='cuisine']/div[5]/div[2]/span/img")
    WebElement firstMealSecond;

    @FindBy(xpath = ".//*[@id='cuisine']/div[15]/div[2]/span/img")
    WebElement strawberryMousse;

    @FindBy(xpath = "//input[@value='+']")
    WebElement plus;

    @FindBy(id = "3")
    WebElement second;

    @FindBy(xpath = "//a[contains(text(),'Десерты')]")
    WebElement dessert;

    @FindBy(xpath = "//button[contains(text(),'Обед')]")
    WebElement dinner;

    @FindBy(xpath = "//button[contains(text(),'Ужин')]")
    WebElement supper;

    @FindBy(id = "breakfast")
    WebElement youBreakfast;

    @FindBy(id = "dinner")
    WebElement youDinner;

    @FindBy(id = "Tu_supper")
    WebElement youSupperOnTuesday;

    @FindBy(xpath = ".//*[@id='dinner']/div[2]/button")
    WebElement dinnerButtonReady;

    @FindBy(xpath = ".//*[@id='breakfast']/div/button")
    WebElement breakfastButtonReady;

    @FindBy(xpath = ".//*[@id='Tu_supper']/div/button")
    WebElement supperButtonReady;


    @FindBy(xpath = "//button[@ value='Tu']")
    WebElement tuesday;

    public void get_main_page(String url) {
        getDriver().get(url);
    }

    public void createMenu(){
        createMenu.click();
    }

    public void createMenuForDay(){
        createMenuForDay.click();
    }

    public void breakfast(){
        breakfast.click();
    }

    public void ukraineKitchen(){
        ukraineKitchen.click();
    }

    public void dragAndDrop() {
        Actions actions = new Actions(getDriver());
        actions.dragAndDrop(firstMealSnacks, youBreakfast).build().perform();
    }

    public void dragAndDropDinner() {
        Actions actions = new Actions(getDriver());
        actions.dragAndDrop(firstMealSecond, youDinner).build().perform();
    }

    public void clickOnBreakfactButtonReady() {
        breakfastButtonReady.click();
    }

    public void clickOnDinnerButtonReady() {
        dinnerButtonReady.click();
    }

    public void plus() {
        plus.click();
    }

    public void dinner() {
        dinner.click();
    }

    public void japaneseKitchen() {
        japaneseKitchen.click();
    }

    public void second() {
        second.click();
    }

    public void createMenuForWeek(){
        createMenuForWeek.click();
    }

    public void tuesday(){
        tuesday.click();
    }

    public void supper(){
        supper.click();
    }

    public void dessert(){
        dessert.click();
    }

    public void frenchKitchen() {
        frenchKitchen.click();
    }

    public void dragAndDropStrawberryMousse() {
        Actions actions = new Actions(getDriver());
        actions.dragAndDrop(strawberryMousse, youSupperOnTuesday).build().perform();
    }

    public void clickOnSupperButtonReady() {
        supperButtonReady.click();
    }

}

