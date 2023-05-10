package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DetailPage extends PageObject {
    private By detail(){
        return By.cssSelector(".v-card__text");
    }
    private By home(){
        return By.cssSelector("h3");
    }

    @Step
    public void validateOndetailPage() {
        $(detail()).isDisplayed();
    }
    @Step
    public void clickHome() {
        $(home()).click();
    }

}
