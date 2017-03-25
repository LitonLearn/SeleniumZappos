import browser.MacyBrowser;
import org.testng.annotations.Test;

/**
 * Created by Shuvashish on 3/16/2017.
 */
public class MacyTest {

    @Test
    public void sartTest(){

        MacyBrowser.openBrowser("firefox").clickMensLink().verifyTitle();
    }
}
