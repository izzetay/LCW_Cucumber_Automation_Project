package PAGES;

import Utility.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Navbar extends HelperFunctions {



    public Navbar(){
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(id = "search-form__input-field__search-input")
    public WebElement seachInput;
    public WebElement searchInput;

    @FindBy(css = ".advanced-search")
    public WebElement suggestionBox;

    @FindBy(xpath = "//div[text()=\"Trend Aramalar\"]")
    public WebElement trendAramalarText;

    @FindBy(xpath = "//div[text()=\"Önerilen Aramalar\"]")
    public WebElement onerilenAramalarText;

    @FindBy(className = "search-bar-close-icon")
    public WebElement inputCloseButton;
}
