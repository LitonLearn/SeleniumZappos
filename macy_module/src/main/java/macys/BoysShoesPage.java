package macys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

/**
 * Created by Shuvashish on 3/23/2017.
 */
public class BoysShoesPage {
    @FindBy(how = How.XPATH, using = ".//*[@id='GENDER']/div[2]/ul/li/a/span[2]")private List<WebElement> gederElements;

    public void verifyGender(){

        String[] gender ={"Boys","Girls","Unisexs"};

        for(WebElement element:gederElements){

        System.out.println(element.getText());
        }

    }
}
