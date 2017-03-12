import browser.BrowserMacy;
import org.testng.annotations.Test;

/**
 * Created by Shuvashish on 3/12/2017.
 */
public class MacysMensJeans {

    @Test
    public void firstTest(){
        BrowserMacy.startBrowser().goToHomePage().clickMensLInk();
    }


}
