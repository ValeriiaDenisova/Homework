package com.valeriia;

import junit.framework.Assert;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.reports.adaptors.specflow.ScenarioStep;
import net.thucydides.core.steps.ScenarioSteps;

import java.util.List;

import static com.gargoylesoftware.htmlunit.WebAssert.assertElementPresent;
import static com.thoughtworks.selenium.SeleneseTestBase.assertTrue;
import static com.thoughtworks.selenium.SeleneseTestNgHelper.assertEquals;

/**
 * Created by v.dmitrieva on 07.05.15.
 */
public class EndUserSteps extends ScenarioSteps {

    public HomePage getPage()
    {
        return  getPages().currentPageAt(HomePage.class);
    }

    @Step
    public void getMain(String url) {
        getPage().getMainPage(url);
        assertTrue(getPage().containsText("Добро пожаловать на сайт"));
    }
    
    @Step
    public void registrationNewPersonWithFillingAllTheMandatoryFields() {
        getPage().registrationNewPersonWithFillingAllTheMandatoryFields("MyLogin", "123456", "123456", "dmytrievavi@gmail.com");
    }

    @Step
    public void registrationNewPersonWithOutPasswordAndConfirmPassword(){
        getPage().registrationNewPersonWithOutPasswordAndConfirmPassword("MyLogin", "dmytrievavi@gmail.com");
        //assertTrue(getPage().textPasswordError);
    }

    @Step
    public void entry() {
        getPage().entry("MyLogin", "123456");
        //assertTrue(getPage().containsText("Добро пожаловать на сайт"));
    }

    @Step
    public void changeProfile() {
        getPage().changeProfile("123456", "123456", "02.05.2015");
    }

    @Step
    public void createBreakfastForDay() {
        getPage().createBreakfastForDay();
    }

    @Step
    public void search() {
        getPage().search("Борщ");
        assertTrue(getPage().containsText("Борщ"));
    }

}
