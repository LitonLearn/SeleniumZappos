package mens;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;

import java.util.List;

public class MensFashion {

   @FindBy(how = How.XPATH, using = "html/body/div[3]/div[12]/div[1]/div[2]/div/a") private List<WebElement> clothing;

    public void clickFromClothing(final String type){

        /*lambda
        clothing.stream()
                .filter(s->s.getText().contains(type)).findFirst().get().click();*/
        for(WebElement element : clothing){
            if(element.getText().contains(type))
                element.click();
        }

    }

}
