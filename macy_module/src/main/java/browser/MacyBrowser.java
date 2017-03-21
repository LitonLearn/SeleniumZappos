package browser;

import macys.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by Shuvashish on 3/16/2017.
 */
public class MacyBrowser {

   public static WebDriver driver=null;
    public static HomePage openBrowser(String browser){
        selectBrowser(browser);
        driver.navigate().to("https://www.macys.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return PageFactory.initElements(driver,HomePage.class);
    }

    private static void selectBrowser(String browser){
        if (browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver","src\\resource\\geckodriver.exe");
            driver = new FirefoxDriver();
        } else if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","src\\resource\\chromedriver.exe");
            driver = new ChromeDriver();

        }
    }
}
