package com.valeriia;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.reports.adaptors.specflow.ScenarioStep;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.WebDriver;

import static com.thoughtworks.selenium.SeleneseTestNgHelper.assertEquals;

/**
 * Created by v.dmitrieva on 29.04.15.
 */
public class EndUserSteps extends ScenarioSteps {

    public HomePage getPage()
    {
        return  getPages().currentPageAt(HomePage.class);
    }

    @Step
    public void getMain(String url) {
        getPage().getMainPage(url);
    }

    @Step
    public void addManInDataBase() {
        getPage().addManInDataBase("Ivanov", "Ivan");
        assertEquals(getPage().checkPerson(), "Ivanov");
    }

    @Step
    public void addWomanInDataBase() {
        getPage().addWomanInDataBase("Kykyshkina", "Valiia");
    }

    @Step
    public void deleteFirstPerson() {
        getPage().deleteFirstPerson();
    }

    @Step
    public void clearDataBase() {
        getPage().clearDataBase();
        assertEquals(getPage().vipCount(), "VIP count: 0");
    }
}
