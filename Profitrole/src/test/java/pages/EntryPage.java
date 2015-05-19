package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

/**
 * Created by v.dmitrieva on 19.05.15.
 */
public class EntryPage extends PageObject {

    @FindBy(xpath = "//a[@href='/login']")
    WebElement entry;

    @FindBy(id = "j_username")
    WebElement entryLogin;

    @FindBy(id = "j_password")
    WebElement entryPassword;

    @FindBy(xpath = "//button[@class='btn']")
    WebElement entryButton;

    @FindBy(xpath = "//div[@class='alert alert-success']")
    WebElement registrationSuccessful;

    @FindBy(xpath = "//a[@href='/j_spring_security_logout']")
    WebElement exit;

    @FindBy(xpath = "//a[@href='/profile']")
    WebElement profile;

    @FindBy(id = "datepicker")
    WebElement fieldDatepicker;

    @FindBy(xpath = "//button[@class='btn']")
    WebElement profileButton;

    @FindBy(xpath = "//option[@value='Франция']")
    WebElement country;

    @FindBy(id = "changePassword")
    WebElement fieldChangePassword;

    @FindBy(id = "confirmPassword")
    WebElement fieldConfirmPassword;

    public void get_main_page(String url) {
        getDriver().get(url);
    }

    public void entry(){
        entry.click();
    }

    public void entryLogin(String enter_login){
        entryLogin.sendKeys(enter_login);
    }

    public void entryPassword(String enter_password){
        entryPassword.sendKeys(enter_password);
    }

    public void entryButton(){
        entryButton.click();
    }

    public void profile(){
        profile.click();
    }

    public void fieldChangePassword(String enter_new_password){
        fieldChangePassword.sendKeys(enter_new_password);
    }

    public void fieldConfirmPassword(String confirmPassword){
        fieldConfirmPassword.sendKeys(confirmPassword);
    }

    public void fieldDatepicker(String datepicker){
        fieldDatepicker.sendKeys(datepicker);
    }

    public void fieldDatepickerClean(){
        fieldDatepicker.clear();
    }

    public void country(){
        country.click();
    }

}
