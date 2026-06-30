package pages;

import Utility.GWD;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HelperFunctions {

    public void sendKeys(WebElement element, String string) {
        waitVisible(element);
        element.sendKeys(string);
    }
    public void sendKeys(WebElement element, String string, Keys keys) {
        waitVisible(element);
        element.sendKeys(string,keys);
    }

    public void clickElement(WebElement element){
        waitVisible(element);
        GWD.js.executeScript("arguments[0].scrollIntoView(false)", element);
        GWD.js.executeScript("window.scrollTo(0, 500)", element);
        element.click();
    }
    public void waitVisible(WebElement element){
        GWD.wait.until(ExpectedConditions.visibilityOf(element));
    }
}
