package com.valeriia;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

/**
 * Created by v.dmitrieva on 07.05.15.
 */
@RunWith(SerenityRunner.class)
public class ProfitroleTest {
    @Managed
    private WebDriver driver;

    @Steps
    public EndUserSteps endUser;

}
