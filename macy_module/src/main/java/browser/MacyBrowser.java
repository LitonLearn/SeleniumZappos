package browser;

import macys.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by Shuvashish on 3/16/2017.
 */
public class MacyBrowser {

   public static WebDriver driver=null;
    public static HomePage openBrowser(){
        System.setProperty("webdriver.chrome.driver","E:\\DevTools\\Selenium\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://www.macys.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return PageFactory.initElements(driver,HomePage.class);
    }
}
