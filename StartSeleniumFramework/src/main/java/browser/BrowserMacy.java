package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by Shuvashish on 3/12/2017.
 */
public class BrowserMacy {

   public  static WebDriver driver=null;

    public static BrowserMacy startBrowser(){
        System.setProperty("webdriver.chrome.driver","E:\\DevTools\\Selenium\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://www.macys.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return PageFactory.initElements(driver, BrowserMacy.class);
    }

    public HomePageMacys goToHomePage(){
       return PageFactory.initElements(driver, HomePageMacys.class);

    }


}
