package PageObject;

import dataProvider.ConfigFileReader;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ObLogin {
    public ObLogin(WebDriver driver){
        PageFactory.initElements(ConfigFileReader.driver, this);
    }

    @FindBy(id = "com.globedr.app:id/login_edit_username")
    public WebElement txtUsername;

    @FindBy(id = "com.globedr.app:id/login_edit_password")
    public WebElement txtPass;

    @FindBy(id = "com.globedr.app:id/login_button_login")
    public WebElement btnLogin;

    @FindBy(id = "com.globedr.app:id/btn_skip")
    public WebElement btn_skip;

    public void Login(){
        txtUsername.clear();
        txtUsername.sendKeys("chinh");
        txtPass.sendKeys("123");
        btnLogin.click();
    }

    public void SkipIntro(){
        btn_skip.click();
    }

    public int getLang(){
        return (btnLogin.getText().equals("Login"))?0:1;
    }
}
