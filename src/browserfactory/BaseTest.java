package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {

    public static WebDriver driver;

    public static String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    public void openBrowser(String baseUrl){
        driver = new ChromeDriver();
        // Launch  the Url
        driver.get(baseUrl);
        // Maximise window
        driver.manage().window().maximize();
        //Implicit timeout
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    public void closeBrowser(){driver.close();}
}
