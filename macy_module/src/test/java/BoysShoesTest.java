import browser.MacyBrowser;
import org.testng.annotations.Test;

/**
 * Created by Shuvashish on 3/23/2017.
 */
public class BoysShoesTest {

    @Test
    public void verifyGender(){
        MacyBrowser.openBrowser("chrome").clickOnShoesInKids().verifyGender();
    }
}
