package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CartPage extends PageObject {
    private By buttonBayar(){
        return By.id("button-bayar");
    }
    @Step
    public void validateOnCartPage() {
        $(buttonBayar()).isDisplayed();
    }

    @Step
    public void clickBayar(){
        $(buttonBayar()).click();
    }
}
