package mens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class MensJeans {

    @FindBy(how = How.XPATH, using = ".//*[@id='naviCenter']/h4[1]") private WebElement clothingSize;

    public void verifyClothingSizePresent(){
        boolean isPresent= clothingSize.isDisplayed();
        Assert.assertTrue(isPresent,"Clothing size is not displayed");
    }
}
