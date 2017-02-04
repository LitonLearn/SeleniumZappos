package hptest;

import browser.Browser;
import mens.MensJeans;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by Shuvashish on 1/21/2017.
 */
public class HomePageTest {

    @Test
    public  void  firstTest(){

        Browser
                .openBrowser()
                .goToHomePage()
                .clickOnMensLink()
                .clickFromClothing("Jeans");
        PageFactory.initElements(Browser.driver, MensJeans.class)
        .verifyClothingSizePresent();
    }
    @Test
    public void secondTest(){

    }

}
