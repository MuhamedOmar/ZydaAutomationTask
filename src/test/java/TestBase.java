import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;
    String baseURL = "http://automationpractice.com/index.php";

    @BeforeClass
    @Parameters({"browser"})
    public void startDriver(@Optional("chrome") String browserName){

        if (browserName.equalsIgnoreCase("Chrome")) {

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        }else if (browserName.equalsIgnoreCase("firefox")) {

            WebDriverManager.chromedriver().setup();
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.get(baseURL);
        try {
            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        }catch (Exception e){
            System.out.println("page didn't load");
        }

    }

    @AfterClass
    public void exitDriver(){
        driver.quit();
    }
}
