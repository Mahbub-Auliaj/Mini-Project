package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    private By usernameField() {
        return By.cssSelector(".v-form > div:nth-of-type(1) [type='text']");
    }

    private By passwordField() {
        return By.cssSelector(".v-form > div:nth-of-type(2) [type='text']");
    }
    private By register(){
        return By.cssSelector("a");
    }

    private By loginButtonButton() {
        return By.cssSelector(".v-btn--is-elevated");
    }

    @Step
    public boolean validateOnLoginPage() {
        return $(loginButtonButton()).isDisplayed();
    }
    @Step
    public void inputUserName(String username) {
        $(usernameField()).type(username);
    }
    @Step
    public void inputPassword(String password) {
        $(passwordField()).type(password);
    }
    @Step
    public void clickSigninButton() {
        $(loginButtonButton()).click();
    }
    @Step
    public void clickRegister() {
        $(register()).click();
    }
}