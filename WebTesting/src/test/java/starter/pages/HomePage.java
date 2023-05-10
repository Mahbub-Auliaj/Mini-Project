package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePage extends PageObject {

    private By loginButton(){
        return By.cssSelector(".v-toolbar__content > button:nth-of-type(2)");
    }

    private By title(){
        return By.cssSelector("h3");
    }
    private By detailButton(){
        return By.cssSelector(".align-stretch > div:nth-of-type(1) button:nth-of-type(1)");
    }
    private By buyButton(){
        return By.cssSelector(".align-stretch > div:nth-of-type(1) button:nth-of-type(2)");
    }
    private By cartButton(){
        return By.cssSelector(".v-toolbar__content > button:nth-of-type(1)");
    }
    private By accountButton(){
        return By.xpath("//div[@class='v-toolbar__content']/button[2]");
    }
    private By logout(){
        return By.cssSelector(".v-list > div:nth-of-type(2)");
    }

    @Step
    public void openPage() {
        open();
    }

    @Step
    public void validateOnHomePage() {
        $(title()).isDisplayed();
    }

    @Step
    public void clickLogin(){
        $(loginButton()).click();
    }
    @Step
    public void clickBuy(){
        $(buyButton()).click();
    }
    @Step
    public void clickCart(){
        $(cartButton()).click();
    }
    @Step
    public void clickDetail(){
        $(detailButton()).click();
    }
    @Step
    public void clickAccount(){
        $(accountButton()).click();
    }
    @Step
    public void clickLogout(){
        $(logout()).click();
    }
}