package com.valeriia;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

/**
 * Created by v.dmitrieva on 07.05.15.
 */
public class HomePage extends PageObject {

    @FindBy(accessibilityId = "/registration")
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
    WebElement datepicker;

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
    WebElement passwordError;

    @FindBy(xpath = "//h2")
    WebElement title;

    public void getMainPage(String url) {
        getDriver().get(url);
    }

    public void registrationNewPersonWithFillingAllTheMandatoryFields(String login, String password, String confirmPassword, String email) {
        fieldLogin.sendKeys(login);
        fieldPassword.sendKeys(password);
        fieldConfirmPassword.sendKeys(confirmPassword);
        fieldEmail.sendKeys(email);
        iAmAgree.click();
        signUp.click();
    }

    public void registrationNewPersonWithOutPasswordAndConfirmPassword(String login, String email) {
        fieldLogin.sendKeys(login);
        fieldEmail.sendKeys(email);
        iAmAgree.click();
        signUp.click();
    }

}
