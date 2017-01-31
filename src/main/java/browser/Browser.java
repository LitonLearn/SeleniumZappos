package browser;


import hp.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class Browser {

   public static WebDriver driver=null;

    public static Browser openBrowser(){
        System.setProperty("webdriver.gecko.driver","src\\resource\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://www.zappos.com");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
       return PageFactory.initElements(driver, Browser.class);
    }

    public HomePage goToHomePage(){
        return PageFactory.initElements(driver,HomePage.class);
    }
}
