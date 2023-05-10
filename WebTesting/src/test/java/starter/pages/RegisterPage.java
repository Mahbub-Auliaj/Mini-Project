package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegisterPage extends PageObject {
    private By fullnameField() {
        return By.cssSelector(".v-form > div:nth-of-type(1) [type='text']");
    }
    private By emailField() {
        return By.cssSelector(".v-form > div:nth-of-type(2) [type='text']");
    }
    private By passwordField() {
        return By.cssSelector("div:nth-of-type(3) [type='text']");
    }

    private By registerButton() {
        return By.cssSelector(".v-btn--is-elevated");
    }

    @Step
    public boolean validateOnRegisterPage() {
        return $(registerButton()).isDisplayed();
    }

    @Step
    public void inputUserName(String username) {
        $(fullnameField()).type(username);
    }

    @Step
    public void inputEmail(String email) {
        $(emailField()).type(email);
    }
    @Step
    public void inputPassword(String password) {
        $(passwordField()).type(password);
    }

    @Step
    public void clickRegisterutton() {
        $(registerButton()).click();
    }
}
