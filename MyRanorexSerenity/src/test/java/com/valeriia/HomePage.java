package com.valeriia;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends PageObject {

    @FindBy(id = "FirstName")
    WebElement fieldFirstName;

    @FindBy(id = "LastName")
    WebElement fieldLastName;

    @FindBy(xpath = "//input[@value='male']")
    WebElement radioButtonMale;

    @FindBy(xpath = "//input[@value='female']")
    WebElement radioButtonFemale;

    @FindBy(xpath = ".//*[@id='Category']/option[2]")
    WebElement checkMusic;

    @FindBy(xpath = ".//*[@id='Category']/option[3]")
    WebElement checkMovie;

    @FindBy(id = "Add")
    WebElement buttonAdd;

    @FindBy(id = "Delete")
    WebElement buttonDelete;

    @FindBy(id = "Clear")
    WebElement buttonClear;

    @FindBy(id = "count")
    WebElement count;

    @FindBy(xpath = ".//*[@id='VIPs']//tr[2]/*/input")
    WebElement radioButtonOfFirstPersonInDB;

    @FindBy(xpath = ".//*[@id='VIPs']/tbody/tr[2]/td[2]")
    WebElement firstPersonInDB;

    public void getMainPage(String url) {
        getDriver().get(url);
    }

    public void addManInDataBase(String firstName, String lastName) {
        fieldFirstName.sendKeys(firstName);
        fieldLastName.sendKeys(lastName);
        radioButtonMale.click();
        checkMusic.click();
        buttonAdd.click();
    }

    public void addWomanInDataBase(String firstName, String lastName) {
        fieldFirstName.sendKeys(firstName);
        fieldLastName.sendKeys(lastName);
        radioButtonFemale.click();
        checkMovie.click();
        buttonAdd.click();
    }

    public void deleteFirstPerson(){
        radioButtonOfFirstPersonInDB.click();
        buttonDelete.click();
    }

    public void clearDataBase() {
        buttonClear.click();
    }

    public String vipCount() {
        String text = count.getText();
        return text;
    }

    public String checkPerson() {
        String text = firstPersonInDB.getText();
        return text;
    }
}
