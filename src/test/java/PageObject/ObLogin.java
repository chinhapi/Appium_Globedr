package PageObject;

import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ObLogin {
    public ObLogin(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "com.globedr.app:id/login_edit_username")
    public AndroidElement txtUsername;

    @FindBy(id = "com.globedr.app:id/login_edit_password")
    public AndroidElement txtPass;

    @FindBy(id = "com.globedr.app:id/login_button_login")
    public AndroidElement btnLogin;

    public void Login(){
        txtUsername.clear();
        txtUsername.sendKeys("chinh");
        txtPass.sendKeys("123");
        btnLogin.click();
    }
}
