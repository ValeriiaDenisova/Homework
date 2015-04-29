package com.valeriia;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends PageObject {
    //private WebDriver driver;
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


   /*public HomePage (WebDriver driver){
        super(driver);
        //this.driver = driver;
    }*/

    public void addManInDataBase(String firstName, String lastName) {
        fieldFirstName.sendKeys(firstName);
        fieldLastName.sendKeys(lastName);
        radioButtonMale.click();
        checkMusic.click();
        buttonAdd.click();
        /*driver.findElement(By.id("FirstName")).sendKeys(firstName);
        driver.findElement(By.id("LastName")).sendKeys(lastName);
        driver.findElement(By.xpath("//input[@value='male']")).click();
        driver.findElement(By.xpath(".//*[@id='Category']/option[2]")).click();
        driver.findElement(By.id("Add")).click();*/
    }

    public void addWomanInDataBase(String firstName, String lastName) {
        fieldFirstName.sendKeys(firstName);
        fieldLastName.sendKeys(lastName);
        radioButtonFemale.click();
        checkMovie.click();
        buttonAdd.click();
        /*driver.findElement(By.id("FirstName")).sendKeys(firstName);
        driver.findElement(By.id("LastName")).sendKeys(lastName);
        driver.findElement(By.xpath("//input[@value='female']")).click();
        driver.findElement(By.xpath(".//*[@id='Category']/option[3]")).click();
        driver.findElement(By.id("Add")).click();*/
    }

    public void deleteFirstPerson(){
        radioButtonOfFirstPersonInDB.click();
        buttonDelete.click();
        //driver.findElement(By.xpath(".//*[@id='VIPs']//tr[2]/*/input")).click();
        //driver.findElement(By.id("Delete")).click();
    }

    public void clearDataBase(){
        buttonClear.click();
        //driver.findElement(By.id("Clear")).click();
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
