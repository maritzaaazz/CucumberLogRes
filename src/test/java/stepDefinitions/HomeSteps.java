//package stepDefinitions;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.example.pages.HomePage;
//import org.example.pages.LoginPage;
//import org.junit.Assert;
//import org.junit.jupiter.api.Assertions;
//import org.openqa.selenium.WebDriver;
//
//public class HomeSteps {
//    WebDriver driver;
//    HomePage homePage;
//
//    public HomeSteps(){
//        this.driver = Hooks.getDriver(); // Mendapatkan instance WebDriver dari Hooks
//        this.homePage = new HomePage(driver);
//
//    }
//
//
//    @Then("User should be redirected to the dashboard")
//    public void user_should_be_redirected_to_the_dashboard() throws
//            InterruptedException {
//        //verify if the homepage contains text Products
//        homePage.getTextProducts();
//        //verify the current URL
//        String expectedUrl = "https://practicetestautomation.com/logged-in-successfully/";
//        Assertions.assertEquals(homePage.getActualUrl(), expectedUrl);
//    }
//
//}
