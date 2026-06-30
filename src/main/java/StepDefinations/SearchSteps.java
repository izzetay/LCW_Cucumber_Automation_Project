package StepDefinations;

import io.cucumber.java.PendingException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pages.Navbar;
import pages.SearchPage;
import Utility.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SearchSteps extends GWD {

    private static final Logger logger = LogManager.getLogger(MainPageSteps.class);
    SearchPage sp = new SearchPage();
    Navbar nb = new Navbar();

    @Then("Click to a product in search page and navigate to product page")
    public void aa() {
        sp.clickElement(sp.firstItem);
    }

    @When("Enter \"Kolsuz Tişört\" in search input and press enter")
    public void ac() {
        nb.sendKeys(nb.searchInput, "Kolsuz Tişört", Keys.ENTER);
    }

    @When("Enter \"ko\" in search input and user shouldn't see the autocomplete box")
    public void vv() {
        nb.sendKeys(nb.searchInput, "ko");
    }

    @When("Enter {string} in search input")
    public void enterInSearchInput(String arg0) {
        nb.clickElement(nb.searchInput);
        nb.sendKeys(nb.searchInput, arg0);
    }

    @When("Enter {string} in search input and search")
    public void enterInSearchInputAndSearch(String arg0) {
        nb.clickElement(nb.searchInput);
        nb.sendKeys(nb.searchInput, arg0);
        nb.sendKeys(nb.searchInput, arg0, Keys.ENTER);
    }

    @And("User must see the search page with {string} header")
    public void userMustSeeTheSearchPageWithHeader(String arg0) {
        Assert.assertTrue(sp.header.getText().contains(arg0));
    }


    @Then("User must see the no found page with {string}")
    public void userMustSeeTheNoFoundPageWith(String arg0) {
        Assert.assertTrue(sp.notFoundText.getText().contains(arg0));
    }

    @Then("User must see {string} in products 10 at least")
    public void userMustSeeInProductsAtLeast(String arg0) {
        int i = 0;
        for (WebElement element : sp.PRODUCT_NAMES){
            if (element.getText().toLowerCase().contains(arg0)){
                i++;
            }
            if (i == 10){
                break;
            }
        }

        if(!(i == 10)){
            Assert.fail();
        }
    }

    @Then("User shouldn't see the autocomplete box")
    public void userShouldnTSeeTheAutocompleteBox() {
        if (!nb.trendAramalarText.isDisplayed()) {
            Assert.fail();
        }
    }

    @And("User should see the autocomplete box")
    public void userShouldSeeTheAutocompleteBox() {
        if (!nb.onerilenAramalarText.isDisplayed()) {
            Assert.fail();
        }
    }

    @And("Click to close button in input")
    public void clickToCloseButtonInInput() {
        nb.clickElement(nb.inputCloseButton);
    }

    @Then("Inputs area must be clear")
    public void inputsAreaMustBeClear() {
        Assert.assertTrue(nb.searchInput.getAttribute("value").isEmpty());
    }

    @Then("User must see {string} in products brands 10 at least")
    public void userMustSeeInProductsBrandsAtLeast(String arg0) {
        int i = 0;
        for (WebElement element : sp.brandingNames){
            if (element.getText().toLowerCase().contains(arg0.toLowerCase())){
                i++;
            }
            if (i == 10){
                break;
            }
        }

        if(!(i == 10)){
            Assert.fail();
        }
    }

    @Then("Product size must be same with search page info")
    public void productSizeMustBeSameWithSearchPageInfo() {
        logger.info("Sayfadaki ürün sayısı alınıyor.");

        try {
            Assert.assertTrue(sp.PRODUCT_NAMES.size() == Integer.parseInt(sp.PRODUCT_COUNT_INFO.getText()));
            logger.info("Sayfadaki ürün sayısı doğrulandı.");
        } catch (AssertionError e){
            logger.warn(e.getMessage());
            throw e;
        }

    }
}