package stepsDefinitions;

import Base.BaseTest;
import PageObject.ObLogin;
import cucumber.TestContext;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import dataProvider.ConfigFileReader;
import manages.FileReaderManager;
import manages.PageObjectManager;
import org.openqa.selenium.By;

public class LoginSteps extends BaseTest{
    private ObLogin login;
    public LoginSteps(TestContext context) {
        super(context);
    }

    @Given("^Login with username \"([^\"]*)\" and pass \"([^\"]*)\"$")
    public void LoginSteps(String userName, String password) throws Exception{
        testContext.getPageObjectManager().getObLogin().Login();
    }

    @And("^If Intro show message, I close Intro Screen to Home Page$")
    public void ifIntroShowMessageICloseIntroScreenToHomePage(){
       try{
            testContext.getPageObjectManager().getObLogin().SkipIntro();
       }catch (Exception e){
           System.out.println(e);
           System.out.println("Not Found Screen Intro");
       }
    }

    @Given("^Open App Globedr And Check Languge$")
    public void openAppGlobedrAndCheckLanguge() throws Throwable {
        int lang  = testContext.getPageObjectManager().getObLogin().getLang();
        if(lang == 0){

        }
    }
}
