package macys;

import browser.MacyBrowser;
import org.testng.Assert;

/**
 * Created by Shuvashish on 3/16/2017.
 */
public class MensClothingPage {

    public void verifyTitle(){
       String titlte= MacyBrowser.driver.getTitle();
        Assert.assertTrue(titlte.contains("Mens Clothing"));
    }
}
