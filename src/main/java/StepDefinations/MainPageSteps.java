package StepDefinations;

import io.cucumber.java.PendingException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pages.MainPage;
import Utility.GWD;
import io.cucumber.java.en.Given;

public class MainPageSteps {

    static int i;
    MainPage mp = new MainPage();
    private static final Logger logger = LogManager.getLogger(MainPageSteps.class);


    @Given("User navigate to main page")
    public void userNavigateToMainPage() {
        logger.info("Kullanıcı anasayfaya yönlendirildi.");
        GWD.getDriver().get("https://www.lcwaikiki.com");
        logger.info("Kullanıcı anasayfaya geldi.");    }

    @Given("User navigates to website")
    public void userNavigateToWebsite() {
        logger.info("Kullanıcı anasayfaya yönlendirildi.");
        GWD.getDriver().get("https://www.lcwaikiki.com");
        logger.info("Kullanıcı anasayfaya geldi.");

        if (i != 1) {
            mp.clickElement(mp.COOKIES_ACCEPT_BUTTON);
            logger.info("Kullanıcı notificationsları kapattı.");
            mp.clickElement(mp.CLOSE_NOTIFICATION_BUTTON);
            logger.info("Kullanıcı cookileri kabul etti.");
            i++;
        }
    }
}
