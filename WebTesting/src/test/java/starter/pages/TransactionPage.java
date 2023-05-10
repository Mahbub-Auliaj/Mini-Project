package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class TransactionPage extends PageObject {
    private By transaction(){
        return By.cssSelector("h1");
    }
    private By home(){
        return By.cssSelector("h3");
    }
    @Step
    public void validateOnHomePage() {
        $(transaction()).isDisplayed();
    }
    @Step
    public void clickHome() {
        $(home()).click();
    }

}
