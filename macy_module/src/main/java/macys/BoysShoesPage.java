package macys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shuvashish on 3/23/2017.
 */
public class BoysShoesPage {
    @FindBy(how = How.XPATH, using = ".//*[@id='GENDER']/div[2]/ul/li/a/span[2]")private List<WebElement> gederElements;

    public void verifyGender(){

        String[] gender ={"Boys","Girls","Unisexs","Male"};

       List<String> genderOptions = new ArrayList<String>();
                boolean ispresent=false;

        for(WebElement element:gederElements){
            if(element.getText().equals("Boys")) {
                ispresent = true;
                break;
            }
        }



        for (WebElement element:gederElements){
            genderOptions.add(element.getText());
        }

        for(String name:genderOptions){
            System.out.println("***"+ name);
        }

        ispresent=genderOptions.contains("Boys");
        //ispresent= genderOptions.containsAll(gender);





    }
}
