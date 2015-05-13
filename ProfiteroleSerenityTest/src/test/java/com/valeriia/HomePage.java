package com.valeriia;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static com.gargoylesoftware.htmlunit.WebAssert.assertElementPresent;
import static com.thoughtworks.selenium.SeleneseTestBase.assertTrue;

/**
 * Created by v.dmitrieva on 07.05.15.
 */
public class HomePage extends PageObject {
    WebDriver driver;

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

    @FindBy(xpath = "html/body/div[1]/div[1]/div/div/ul[1]/li[1]/a")
    WebElement createMenu;

    @FindBy(xpath = "//a[@href='/menu']")
    WebElement createMenuForDay;

    @FindBy(xpath = "//button[@value='#breakfast']")
    WebElement breakfast;

    @FindBy(xpath = "//*[@id='cuisine']/div[1]")
    WebElement ukraineKitchen;

    @FindBy(xpath = "//*[@id='cuisine']/div[4]/div[2]")
    WebElement firstMealSnacks;

    @FindBy(id = "breakfast")
    WebElement youBreakfast;

    public void getMainPage(String url) {
        getDriver().get(url);
    }

    public void registrationNewPersonWithFillingAllTheMandatoryFields(String login, String password, String confirmPassword, String email) {
        registration.click();
        fieldLogin.sendKeys(login);
        fieldPassword.sendKeys(password);
        fieldConfirmPassword.sendKeys(confirmPassword);
        fieldEmail.sendKeys(email);
        iAmAgree.click();
        signUp.click();
    }

    public void registrationNewPersonWithOutPasswordAndConfirmPassword(String login, String email) {
        registration.click();
        fieldLogin.sendKeys(login);
        fieldEmail.sendKeys(email);
        iAmAgree.click();
        signUp.click();
        //assertTrue(textPasswordError);
    }

    public void entry(String login, String password) {
        entry.click();
        entryLogin.sendKeys(login);
        entryPassword.sendKeys(password);
        entryButton.click();
        assertTrue(containsText("Добро пожаловать на сайт"));
    }

    public void changeProfile(String changePassword, String confirmPassword,  String datepicker) {
        profile.click();
        profileButton.click();
        fieldChangePassword.sendKeys(changePassword);
        fieldConfirmPassword.sendKeys(confirmPassword);
        fieldDatepicker.sendKeys(datepicker);
        country.click();
        entryButton.click();
    }

    public void createBreakfastForDay() {
        createMenu.click();
        createMenuForDay.click();
        breakfast.click();
        ukraineKitchen.click();
        //WebElement firstMealSnacks = getDriver().findElement(By.xpath("//*[@id='cuisine']/div[4]/div[2]"));
        //WebElement youBreakfast = getDriver().findElement(By.id("breakfast"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(firstMealSnacks, youBreakfast);
    }
}
