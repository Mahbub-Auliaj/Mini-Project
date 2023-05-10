package starter.pageObject;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.alta.driver.AndroidDriverPool;
import test.alta.driver.DriverPool;

public class BasePageObject {
    public DriverPool driver = new DriverPool();
    public AndroidDriverPool androidDriverPool = new AndroidDriverPool();

    public AndroidDriver getDriver(){
        if(this.driver.getAndroidDriver() == null){
            this.driver.setAndroidDriver(AndroidDriverPool.create());
        }
        return this.driver.getAndroidDriver();
    }
    public WebDriverWait onWait(){
        return new WebDriverWait(getDriver(),15);
    }
    public AndroidElement waitUntilClickable(By by){
        return (AndroidElement) onWait().until(ExpectedConditions.elementToBeClickable(by));
    }
    public void onClick(By by){
        waitUntilClickable(by).click();
    }
    public AndroidElement waitUntillPresence(By by){
        return (AndroidElement) onWait().until(ExpectedConditions.presenceOfElementLocated(by));
    }
    public AndroidElement waitUntillVisible(By by){
        return (AndroidElement) onWait().until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    public void onType(By by,CharSequence... keysToSend){
        waitUntillPresence(by).sendKeys(keysToSend);
    }
    public void clear(By by){
        waitUntillPresence(by).clear();
    }
}
