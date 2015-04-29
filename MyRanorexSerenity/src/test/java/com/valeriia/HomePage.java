package com.valeriia;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by v.dmitrieva on 23.04.15.
 */
public class HomePage extends PageObject {
    private WebDriver driver;
    @FindBy(id = "FirstName")
    WebDriver firstName;

    @FindBy(id = "LastName")
    WebDriver lastName;

    @FindBy(xpath = "//input[@value='male']")
    WebDriver male;

    @FindBy(xpath = "//input[@value='female']")
    WebDriver female;

    @FindBy(xpath = ".//*[@id='Category']/option[2]")
    WebDriver checkMusic;

    @FindBy(xpath = ".//*[@id='Category']/option[3]")
    WebDriver checkMovie;

    @FindBy(id = "Add")
    WebDriver buttonAdd;

    @FindBy(id = "Delete")
    WebDriver buttonDelete;

    @FindBy(id = "Clear")
    WebDriver buttonClear;

    @FindBy(id = "count")
    WebDriver count;

    @FindBy(xpath = ".//*[@id='VIPs']/tbody/tr[2]/td[2]")
    WebDriver radioButtonOfFirstPersonInDB;


    public HomePage (WebDriver driver){
        this.driver = driver;
    }

    public void addManInDataBase(String firstName, String lastName) {
        driver.findElement(By.id("FirstName")).sendKeys(firstName);
        driver.findElement(By.id("LastName")).sendKeys(lastName);
        driver.findElement(By.xpath("//input[@value='male']")).click();
        driver.findElement(By.xpath(".//*[@id='Category']/option[2]")).click();
        driver.findElement(By.id("Add")).click();
    }

    public void addWomanInDataBase(String firstName, String lastName) {
        driver.findElement(By.id("FirstName")).sendKeys(firstName);
        driver.findElement(By.id("LastName")).sendKeys(lastName);
        driver.findElement(By.xpath("//input[@value='female']")).click();
        driver.findElement(By.xpath(".//*[@id='Category']/option[3]")).click();
        driver.findElement(By.id("Add")).click();
    }

    public void deleteFirstPerson(){
        driver.findElement(By.xpath(".//*[@id='VIPs']//tr[2]/*/input")).click();
        driver.findElement(By.id("Delete")).click();
    }

    public void clearDataBase(){
        driver.findElement(By.id("Clear")).click();
    }

    public String vipCount() {
        String text = driver.findElement(By.id("count")).getText();
        return text;
    }

    public String checkPerson() {
        String text = driver.findElement(By.xpath(".//*[@id='VIPs']/tbody/tr[2]/td[2]")).getText();
        return text;
    }
}
