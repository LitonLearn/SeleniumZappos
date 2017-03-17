package macys;

import browser.MacyBrowser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Shuvashish on 3/16/2017.
 */
public class HomePage {

    @FindBy(how= How.LINK_TEXT, using = "MEN") private WebElement menLink;

    public MensClothingPage clickMensLink(){
        wait(3);
        menLink.click();
        return PageFactory.initElements(MacyBrowser.driver,MensClothingPage.class);

    }

    private void wait(int sec){

        try {
            Thread.sleep(sec*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
