package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ObGrowchart {
    public ObGrowchart(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//android.widget.TextView[contains(text(),'')]")
}
