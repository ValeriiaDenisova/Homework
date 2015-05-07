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
    WebElement login;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "confirmPassword")
    WebElement confirmPassword;

    @FindBy(id = "email")
    WebElement email;

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



}
