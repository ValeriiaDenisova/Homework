package com.valeriia.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by v.dmitrieva on 07.05.15.
 */
public class HomePage extends PageObject {

 //   WebDriver driver;

    /* public HomePage(WebDriver driver, WebDriver driver1) {
        super(driver);
    }
*/
    @FindBy(xpath = "//a[@href='/registration']")
    WebElement registration;

    @FindBy(id = "login")
    WebElement fieldLogin;

    @FindBy(id = "password")
    WebElement fieldPassword;

    @FindBy(id = "confirmPassword")
    WebElement fieldConfirmPassword;

    @FindBy(id = "email")
    WebElement fieldEmail;

    @FindBy(id = "datepicker")
    WebElement fieldDatepicker;

    @FindBy(id = "maleOrFemale1")
    WebElement maleOrFemale1;

    @FindBy(id = "maleOrFemale0")
    WebElement maleOrFemale0;

    @FindBy(id = "iAmAgree")
    WebElement iAmAgree;

    @FindBy(css = "a[target='_blank']")
    WebElement refIAmAgree;

    @FindBy(xpath = "//button[@class='btn']")
    WebElement signUp;

    @FindBy(id = "passwordError")
    WebElement textPasswordError;

    @FindBy(xpath = "//a[@href='/login']")
    WebElement entry;

    @FindBy(id = "j_username")
    WebElement entryLogin;

    @FindBy(id = "j_password")
    WebElement entryPassword;

    @FindBy(xpath = "//button[@class='btn']")
    WebElement entryButton;

    @FindBy(xpath = "//div[@class='alert alert-success']")
    WebElement registrationSuccessful;

    @FindBy(xpath = "//a[@href='/j_spring_security_logout']")
    WebElement exit;

    @FindBy(xpath = "//a[@href='/profile']")
    WebElement profile;

    @FindBy(xpath = "//button[@class='btn']")
    WebElement profileButton;

    @FindBy(xpath = "//option[@value='Франция']")
    WebElement country;

    @FindBy(id = "changePassword")
    WebElement fieldChangePassword;

    @FindBy(xpath = "//a[contains(text(),'Создать меню')]")
    WebElement createMenu;

    @FindBy(xpath = "//a[@href='/menu']")
    WebElement createMenuForDay;

    @FindBy(xpath = "//button[@value='#breakfast']")
    WebElement breakfast;

    @FindBy(xpath = "//img[@alt='Украинская']")
    WebElement ukraineKitchen;

    @FindBy(xpath = "//img[@alt='Японская']")
    WebElement chineseKitchen;

    @FindBy(xpath = ".//*[@id='cuisine']/div[4]/div[2]/span/img")
    WebElement firstMealSnacks;

    @FindBy(xpath = ".//*[@id='cuisine']/div[5]/div[2]/span/img")
    WebElement firstMealSecond;

    @FindBy(xpath = "//input[@value='+']")
    WebElement plus;

    @FindBy(id = "3")
    WebElement second;

    @FindBy(xpath = "//button[contains(text(),'Обед')]")
    WebElement dinner;

    @FindBy(xpath = "//a[contains(text(),'Ужин')]")
    WebElement supper;

    @FindBy(id = "breakfast")
    WebElement youBreakfast;

    @FindBy(id = "dinner")
    WebElement youDinner;

    @FindBy(xpath = "//input[@class='search-query']")
    WebElement searchField;

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

    @FindBy(xpath = "//area[@alt='Логотип']")
    WebElement mainPicture;

    @FindBy(xpath = ".//*[@id='dinner']/div[2]/button")
    WebElement dinnerButtonReady;

    @FindBy(xpath = ".//*[@id='breakfast']/div/button")
    WebElement breakfastButtonReady;


    public void get_main_page(String url) {
        getDriver().get(url);
    }

    public void registration(){
        registration.click();
    }

    public void fieldLogin(String login){
        fieldLogin.sendKeys(login);
    }

    public void fieldPassword(String password){
        fieldPassword.sendKeys(password);
    }

    public void fieldConfirmPassword(String confirmPassword){
        fieldConfirmPassword.sendKeys(confirmPassword);
    }

    public void fieldEmail(String email){
        fieldEmail.sendKeys(email);
    }

    public void iAmAgree(){
        iAmAgree.click();
    }

    public void signUp(){
        signUp.click();
    }

    public void entry(){
        entry.click();
    }

    public void entryLogin(String enter_login){
        entryLogin.sendKeys(enter_login);
    }

    public void entryPassword(String enter_password){
        entryPassword.sendKeys(enter_password);
    }

    public void entryButton(){
        entryButton.click();
    }

    public void profile(){
        profile.click();
    }

    public void fieldChangePassword(String enter_new_password){
        fieldChangePassword.sendKeys(enter_new_password);
    }

    public void fieldDatepicker(String datepicker){
        fieldDatepicker.sendKeys(datepicker);
    }

    public void country(){
        country.click();
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

    public void clickOnBreakfactButtonReady() {
        breakfastButtonReady.click();
    }

    public void clickOnDinnerButtonReady() {
        dinnerButtonReady.click();
    }

    public void searchField(String search_word){
        searchField.sendKeys(search_word);
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

    public void mainPicture() {
        mainPicture.click();
    }

    public void plus() {
        plus.click();
    }

    public void dinner() {
        dinner.click();
    }

    public void chineseKitchen() {
        chineseKitchen.click();
    }

    public void second() {
        second.click();
    }

    public void dragAndDropDinner() {
        Actions actions = new Actions(getDriver());
        actions.dragAndDrop(firstMealSecond, youDinner).build().perform();
    }
}
