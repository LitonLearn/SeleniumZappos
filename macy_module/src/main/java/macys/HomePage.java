package macys;

import browser.MacyBrowser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Shuvashish on 3/16/2017.
 */
public class HomePage {

    @FindBy(how= How.LINK_TEXT, using = "MEN") private WebElement menLink;
    @FindBy(how= How.LINK_TEXT, using = "KIDS") private  WebElement kidsLink;
    @FindBy(how = How.CSS, using = "a[href='/shop/kids-clothes/kids-shoes/Gender" +
            "/Boys?id=48561&cm_sp=us_hdr-_-kids-_-shoes_COL2']") private WebElement kidsBoysShoes;


    public MensClothingPage clickMensLink(){
        wait(3);
        menLink.click();
        return PageFactory.initElements(MacyBrowser.driver,MensClothingPage.class);

    }

    public BoysShoesPage clickOnShoesInKids(){
        Actions action = new Actions(MacyBrowser.driver);
        action.moveToElement(kidsLink).build().perform();
        kidsBoysShoes.click();

        return  PageFactory.initElements(MacyBrowser.driver, BoysShoesPage.class);
    }

    private void wait(int sec){

        try {
            Thread.sleep(sec*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
