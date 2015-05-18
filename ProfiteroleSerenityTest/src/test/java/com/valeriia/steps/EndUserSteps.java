package com.valeriia.steps;

import com.valeriia.pages.HomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static com.thoughtworks.selenium.SeleneseTestBase.assertTrue;

/**
 * Created by v.dmitrieva on 07.05.15.
 */
public class EndUserSteps extends ScenarioSteps {

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
        getPage().registration();
    }

    @Step
    public void enter_login(String login) {
        getPage().fieldLogin(login);
    }

    @Step
    public void enter_password(String password) {
        getPage().fieldPassword(password);
    }

    @Step
    public void enter_confirmPassword(String confirmPassword) {
        getPage().fieldConfirmPassword(confirmPassword);
    }

    @Step
    public void enter_email(String email) {
        getPage().fieldEmail(email);
    }

    @Step
    public void click_i_am_agree() {
        getPage().iAmAgree();
    }

    @Step
    public void click_button_sign_up() {
        getPage().signUp();
        assertTrue(getPage().containsText("Пользователь с таким логином уже существует."));
    }

    @Step
    public void click_on_entry_link() {
        getPage().entry();
    }

    @Step
    public void enter_login_on_the_entry_page(String enter_login) {
        getPage().entryLogin(enter_login);
    }

    @Step
    public void enter_password_on_the_entry_page(String enter_password) {
        getPage().entryPassword(enter_password);
    }

    @Step
    public void click_on_entry_button() {
        getPage().entryButton();
    }

    @Step
    public void click_on_profile_link() {
        getPage().profile();
    }

    @Step
    public void click_on_profile_button() {
        getPage().entryButton();
    }

    @Step
    public void enter_new_password(String enter_new_password) {
        getPage().fieldChangePassword(enter_new_password);
    }

    @Step
    public void enter_new_confirmPassword(String enter_new_confirmPassword) {
        getPage().fieldConfirmPassword(enter_new_confirmPassword);
    }

    @Step
    public void enter_datepicker(String datepicker) {
        getPage().fieldDatepicker(datepicker);
    }

    @Step
    public void select_country_France() {
        getPage().country();
    }

    @Step
    public void click_on_create_menu() {
        getPage().createMenu();
    }

    @Step
    public void click_on_create_menu_for_day() {
        getPage().createMenuForDay();
    }

    @Step
    public void click_on_breakfast() {
        getPage().breakfast();
    }

    @Step
    public void click_on_ukraine_kitchen() {
        getPage().ukraineKitchen();
    }

    @Step
    public void drag_and_drop_first_meal_snacks_on_you_breakfast_field() {
        getPage().dragAndDrop();
    }

    @Step
    public void add_the_same_meal() {
        getPage().plus();
    }

    @Step
    public void click_on_breakfast_button_ready() {
        getPage().clickOnBreakfactButtonReady();
    }

    @Step
    public void click_on_dinner_button_ready() {
        getPage().clickOnDinnerButtonReady();
    }

    @Step
    public void click_on_dinner() {
        getPage().dinner();
    }

    @Step
    public void click_on_chinese_kitchen() {
        getPage().chineseKitchen();
    }

    @Step
    public void click_on_second_meal() {
        getPage().second();
    }

    @Step
    public void drag_and_drop_second_meal_on_you_breakfast_field() {
        getPage().dragAndDropDinner();
    }

    @Step
    public void enter_borsh_in_search_field(String search_word) {
        getPage().searchField(search_word);
        assertTrue(getPage().containsText("Борщ"));
    }

    @Step
    public void click_on_recipe() {
        getPage().recipe();
    }

    @Step
    public void click_on_all_recipe() {
        getPage().allRecipe();
    }

    @Step
    public void click_on_japanese_food() {
        getPage().japaneseFood();
    }

    @Step
    public void click_on_snacks() {
        getPage().snacks();
    }

    @Step
    public void click_on_patties_with_onions() {
        getPage().pattiesWithOnions();
        assertTrue(getPage().containsText("Пирожки с луком"));
    }

    @Step
    public void click_the_main_picture() {
        getPage().mainPicture();
        assertTrue(getPage().containsText("Добро пожаловать на сайт"));
    }
}
