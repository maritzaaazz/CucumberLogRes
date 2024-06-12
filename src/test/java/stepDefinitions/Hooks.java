//package stepDefinitions;
//
//import org.junit.After;
//import org.junit.Before;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class Hooks {
//    private static WebDriver driver;
//
//    @Before
//    public void setUp(){
//        if (driver == null){
//            // Pastikan path WebDriver diatur dengan benar
//            System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
//            driver = new ChromeDriver();
//            driver.manage().window().maximize();
//        }
//    }
//
//    @After
//    public void tearDown(){
//        if (driver != null){
//            driver.quit();
//            driver = null;
//        }
//    }
//
//    public static WebDriver getDriver(){
//        return driver;
//    }
//}
