package com.valeriia;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import static com.gargoylesoftware.htmlunit.WebAssert.assertElementPresent;
import static com.thoughtworks.selenium.SeleneseTestBase.assertTrue;

/**
 * Created by v.dmitrieva on 07.05.15.
 */
public class HomePage extends PageObject {

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
    }

    public void entry(String login, String password) {
        entry.click();
        entryLogin.sendKeys(login);
        entryPassword.sendKeys(password);
        entryButton.click();
        assertTrue(containsText("Добро пожаловать на сайт"));
        exit.click();
    }

    public void changeProfile(String login, String password, String changePassword, String confirmPassword,  String datepicker) {
        entry.click();
        entryLogin.sendKeys(login);
        entryPassword.sendKeys(password);
        entryButton.click();
        assertTrue(containsText("Добро пожаловать на сайт"));
        profile.click();
        profileButton.click();
        fieldChangePassword.sendKeys(changePassword);
        fieldConfirmPassword.sendKeys(confirmPassword);
        fieldDatepicker.sendKeys(datepicker);
        country.click();
        entryButton.click();
    }
}
