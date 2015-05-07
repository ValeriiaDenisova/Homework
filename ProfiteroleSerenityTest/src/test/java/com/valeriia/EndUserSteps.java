package com.valeriia;

import junit.framework.Assert;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.reports.adaptors.specflow.ScenarioStep;
import net.thucydides.core.steps.ScenarioSteps;

import java.util.List;

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
        Assert.IsTrue(getPage().IsTextPresent("Bugs Catcher"));
        assertEquals(getPage().title, "Добро пожаловать на сайт");
    }
    
    @Step
    public void registrationNewPersonWithFillingAllTheMandatoryFields() {
        getPage().registrationNewPersonWithFillingAllTheMandatoryFields("MyLogin", "1234", "1234", "dmytrievavi@gmail.com");
    }

}
