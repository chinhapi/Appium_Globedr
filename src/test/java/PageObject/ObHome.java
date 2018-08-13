package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ObHome {
    public ObHome(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "com.globedr.app:id/img_records")
    WebElement iconHealth;
}
