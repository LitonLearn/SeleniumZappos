package hp;


import browser.Browser;
import mens.MensFashion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(how= How.XPATH, using = ".//*[@id='nav']/li[7]/a") private WebElement mensLink;

    WebDriver driver = Browser.driver;

    public MensFashion clickOnMensLink(){

        mensLink.click();
        return PageFactory.initElements(driver,MensFashion.class);

    }
}
