package starter.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;

import org.openqa.selenium.By;
import starter.pageObject.BasePageObject;

public class LoginPage extends BasePageObject {
    private By usernameField() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
    }

    private By passwordField() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
    }

    private By loginButtonButton() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Login\"]");
    }

    @Step
    public boolean validateOnLoginPage() {
        return waitUntillVisible(loginButtonButton()).isDisplayed();
    }
    @Step
    public void inputUserName(String username) {
        onType(usernameField(),username);
    }
    @Step
    public void inputPassword(String password) {
        onType(passwordField(),password);
    }
    @Step
    public void clickSigninButton() {
        onClick(loginButtonButton());
    }

}