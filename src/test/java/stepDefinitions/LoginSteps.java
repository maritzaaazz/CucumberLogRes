package stepDefinitions;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.HomePage;
import org.example.pages.LoginPage;
import org.junit.After;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {
    WebDriver driver;
    LoginPage loginPage;


    void setUpChromeDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Given("User is on the login page")
    public void navigateToLoginPage(){
        setUpChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
    }

    @When("User submit valid credentials")
    public void submitValidCredentials() throws InterruptedException{
        LoginPage login = new LoginPage(driver);
        login.enterUsername("student");
        login.enterPassword("Password123");
        login.clickLogin();
    }

    @Then("User should be redirected to the dashboard")
    public void loginSuccessful() throws InterruptedException{
        HomePage home = new HomePage(driver);
        home.getTextProducts();
        String expectedUrl = "https://practicetestautomation.com/logged-in-successfully/";
        Assertions.assertEquals(home.getActualUrl(), expectedUrl);
    }

    @After
    public void closeBrowser(){
        driver.quit();
    }
}
