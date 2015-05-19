package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

/**
 * Created by Valeriia on 18.05.2015.
 */
public class RegistrationPage extends PageObject {

    @FindBy(xpath = "//a[@href='/registration']")
    WebElement registration;

    @FindBy(id = "login")
    WebElement fieldLogin;

    @FindBy(id = "password")
    WebElement fieldPassword;

    @FindBy(id = "confirmPassword")
    WebElement fieldConfirmPassword;

    @FindBy(id = "email")
    WebElement fieldEmail;

    @FindBy(id = "datepicker")
    WebElement fieldDatepicker;

    @FindBy(id = "maleOrFemale1")
    WebElement maleOrFemale1;

    @FindBy(id = "maleOrFemale0")
    WebElement maleOrFemale0;

    @FindBy(id = "iAmAgree")
    WebElement iAmAgree;

    @FindBy(xpath = "//button[@class='btn']")
    WebElement signUp;

    @FindBy(id = "loginError")
    WebElement loginError;

    @FindBy(id = "passwordError")
    WebElement passwordError;

    public void get_main_page(String url) {
        getDriver().get(url);
    }

    public void registration(){
        registration.click();
    }

    public void fieldLogin(String login){
        fieldLogin.sendKeys(login);
    }

    public void fieldPassword(String password){
        fieldPassword.sendKeys(password);
    }

    public void fieldConfirmPassword(String confirmPassword){
        fieldConfirmPassword.sendKeys(confirmPassword);
    }

    public void fieldEmail(String email){
        fieldEmail.sendKeys(email);
    }

    public void iAmAgree(){
        iAmAgree.click();
    }

    public void signUp(){
        signUp.click();
    }

    public String getMessageUserAlreadyExists() {
        return loginError.getText();
    }

}
