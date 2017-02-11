package browser;


import hp.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Browser {

 public static WebDriver driver = null;

    public static HomePage openBrowser(){
        getDriver("browser");
        driver.manage().window().maximize();
        driver.navigate().to(findProperty("url"));
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
       return PageFactory.initElements(driver, HomePage.class);
    }

    private static String findProperty(String pName){
        try {
            InputStream in = new FileInputStream("src\\resource\\browser.properties");
            Properties properties=new Properties();
            properties.load(in);
            return properties.getProperty(pName);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    private static void getDriver(String bName){
        switch (findProperty(bName)){
            case "firefox":
                System.setProperty("webdriver.gecko.driver","src\\resource\\geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            case "IE":
                System.setProperty("webdriver.ie.driver","src\\resource\\MicrosoftWebDriver.exe");
                driver= new InternetExplorerDriver();
                break;
            case "chrome":
                driver= new ChromeDriver();
                break;
        }
    }




}
