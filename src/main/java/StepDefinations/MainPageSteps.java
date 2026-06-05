package StepDefinations;

import PAGES.MainPage;
import Utility.GWD;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;

public class MainPageSteps {

    MainPage mp = new MainPage();

    @Given("User navigate to main page")
    public void userNavigateToMainPage() {
        GWD.getDriver().get("https://www.lcwaikiki.com");
    }

    @Given("User navigates to website")
    public void userNavigateToWebsite(){
        GWD.getDriver().get("https://www.lcwaikiki.com");
        mp.clickElement(mp.cookiesAcceptButton);
        mp.clickElement(mp.closeNotificationButton);
    }

}
