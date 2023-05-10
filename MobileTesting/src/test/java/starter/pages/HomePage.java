package starter.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import starter.pageObject.BasePageObject;

public class HomePage extends BasePageObject {

    private By loginButton(){
        return MobileBy.xpath(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");
    }
    @Step
    public boolean validateOnHomePage() {
        return waitUntillVisible(loginButton()).isDisplayed();
    }
    @Step
    public void clickLoginButton(){
        onClick(loginButton());
    }


}