package stepsDefinitions;

import Base.BaseTest;
import cucumber.TestContext;
import cucumber.api.java.en.Given;
import dataProvider.ConfigFileReader;
import manages.FileReaderManager;
import manages.PageObjectManager;
import org.openqa.selenium.By;

public class LoginSteps extends BaseTest{
    public LoginSteps(TestContext context) {
        super(context);
    }

    @Given("^Login with username \"([^\"]*)\" and pass \"([^\"]*)\"$")
    public void LoginSteps(String userName, String password) throws Exception{
        testContext.getPageObjectManager().getObLogin().Login();
//        PageObjectManager pageObjectManager = new PageObjectManager(ConfigFileReader.driver);
//        pageObjectManager.getObLogin().Login();
//        ConfigFileReader.driver.findElement(By.id("com.globedr.app:id/login_edit_username")).sendKeys("chinh");
    }
}
