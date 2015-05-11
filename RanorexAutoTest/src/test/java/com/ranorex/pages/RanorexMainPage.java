package com.ranorex.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by User on 18.04.2015.
 */
public class RanorexMainPage {
    private WebDriver driver;

    public RanorexMainPage(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(id = "searchInput")
    WebElement searchInput;

    public void open(){
        driver.get("//http:google.com");
    }

    public void enterQueryString(String query){
        searchInput.sendKeys(query);
    }

    public void search(){
        searchInput.submit();
    }

}
