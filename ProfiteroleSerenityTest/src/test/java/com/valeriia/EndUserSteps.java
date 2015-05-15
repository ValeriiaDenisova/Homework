package com.valeriia;

import junit.framework.Assert;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.reports.adaptors.specflow.ScenarioStep;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static com.gargoylesoftware.htmlunit.WebAssert.assertElementPresent;
import static com.thoughtworks.selenium.SeleneseTestBase.assertTrue;
import static com.thoughtworks.selenium.SeleneseTestNgHelper.assertEquals;

/**
 * Created by v.dmitrieva on 07.05.15.
 */
public class EndUserSteps extends ScenarioSteps {
    WebDriver driver;

    public HomePage getPage()
    {
        return  getPages().currentPageAt(HomePage.class);
    }

    @Step
    public void get_main_page(String url) {
        getPage().get_main_page(url);
        assertTrue(getPage().containsText("Добро пожаловать на сайт"));
    }

    @Step
    public void click_on_registration_link() {
        getPage().registration.click();
    }

    @Step
    public void enter_login(String login) {
        getPage().fieldLogin.sendKeys(login);
    }

    @Step
    public void enter_password(String password) {
        getPage().fieldPassword.sendKeys(password);
    }

    @Step
    public void enter_confirmPassword(String confirmPassword) {
        getPage().fieldConfirmPassword.sendKeys(confirmPassword);
    }

    @Step
    public void enter_email(String email) {
        getPage().fieldEmail.sendKeys(email);
    }

    @Step
    public void click_i_am_agree() {
        getPage().iAmAgree.click();
    }

    @Step
    public void click_button_sign_up() {
        getPage().signUp.click();
        assertTrue(getPage().containsText("Пользователь с таким логином уже существует."));
    }

    @Step
    public void click_on_entry_link() {
        getPage().entry.click();
    }

    @Step
    public void enter_login_on_the_entry_page(String enter_login) {
        getPage().entryLogin.sendKeys(enter_login);
    }

    @Step
    public void enter_password_on_the_entry_page(String enter_password) {
        getPage().entryPassword.sendKeys(enter_password);
    }

    @Step
    public void click_on_entry_button() {
        getPage().entryButton.click();
    }

    @Step
    public void click_on_profile_link() {
        getPage().profile.click();
    }

    @Step
    public void click_on_profile_button() {
        getPage().entryButton.click();
    }

    @Step
    public void enter_new_password(String enter_new_password) {
        getPage().fieldChangePassword.sendKeys(enter_new_password);
    }

    @Step
    public void enter_new_confirmPassword(String enter_new_confirmPassword) {
        getPage().fieldConfirmPassword.sendKeys(enter_new_confirmPassword);
    }

    @Step
    public void enter_datepicker(String datepicker) {
        getPage().fieldDatepicker.sendKeys(datepicker);
    }

    @Step
    public void select_country_France() {
        getPage().country.click();
    }

    @Step
    public void click_on_create_menu() {
        getPage().createMenu.click();
    }

    @Step
    public void click_on_create_menu_for_day() {
        getPage().createMenuForDay.click();
    }

    @Step
    public void click_on_breacfast() {
        getPage().breakfast.click();
    }

    @Step
    public void click_on_ukraine_kitchen() {
        getPage().ukraineKitchen.click();
    }

    @Step
    public void drag_and_drop_first_meal_snacks_on_you_breakfast_field() {
        Actions actions = new Actions(driver);
        actions.dragAndDrop(getPage().firstMealSnacks, getPage().youBreakfast).build().perform();
    }


    @Step
    public void enter_borsh_in_search_field(String search_word) {
        getPage().searchField.sendKeys(search_word);
        assertTrue(getPage().containsText("Борщ"));
    }

/*    @Step
    public void viewJapaneseRecipe() {
        getPage().viewJapaneseRecipe();
        assertTrue(getPage().containsText("Пирожки с луком"));
    }*/

    @Step
    public void click_on_recipe() {
        getPage().recipe.click();
    }

    @Step
    public void click_on_all_recipe() {
        getPage().allRecipe.click();
    }

    @Step
    public void click_on_japanese_food() {
        getPage().japaneseFood.click();
    }

    @Step
    public void click_on_snacks() {
        getPage().snacks.click();
    }

    @Step
    public void click_on_patties_with_onions() {
        getPage().pattiesWithOnions.click();
        assertTrue(getPage().containsText("Пирожки с луком"));
    }
}
