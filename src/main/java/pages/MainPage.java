package pages;

import Utility.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends HelperFunctions {
    public MainPage(){
        PageFactory.initElements(GWD.getDriver(),this);
    }
    @FindBy(id = "cookieseal-banner-accept")
    public WebElement COOKIES_ACCEPT_BUTTON;

    @FindBy(className = "ins-web-opt-in-reminder-close-button")
    public WebElement CLOSE_NOTIFICATION_BUTTON;
}
