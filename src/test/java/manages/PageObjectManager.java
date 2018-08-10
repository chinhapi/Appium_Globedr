package manages;

import PageObject.ObLogin;
import org.openqa.selenium.WebDriver;

public class PageObjectManager {
    WebDriver driver;
    private ObLogin obLogin;
    public PageObjectManager(WebDriver driver){
        this.driver = driver;
    }
    public ObLogin getObLogin(){
        return (obLogin == null) ? new ObLogin(driver): obLogin;
    }
}
