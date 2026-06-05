package StepDefinations;

public class LoginSteps {
    @io.cucumber.java.en.Given("^user navigates to mainpage$")
    public void userNavigatesToMainpage() {
        System.out.println("Anasayfaya giris yapildi");
    }

    @io.cucumber.java.en.Then("^user clicks to login button$")
    public void userClicksToLoginButton() {
        System.out.println("Kullanici giris butonuna tikladi");
    }

    @io.cucumber.java.en.When("^user redirect to login page and user enters valid credentials$")
    public void userRedirectToLoginPageAndUserEntersValidCredentials() {
        System.out.println("Kullanici giris sayfasina gitti ve dogru bilgileri girdi");
    }

    @io.cucumber.java.en.Then("^user is able to login successfully$")
    public void userBeAbleToLoginSuccessfully() {
        System.out.println("Kullanici basarili bi sekilde giris yapti");
    }
}
