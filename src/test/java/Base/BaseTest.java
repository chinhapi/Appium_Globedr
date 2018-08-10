package Base;

import cucumber.TestContext;
import manages.FileReaderManager;

public class BaseTest {
    public TestContext testContext;
    public BaseTest(TestContext context){
        testContext = context;
    }
}
// FileReaderManager.getInstance().getCofigFileReader().getConfigProperties();
//         try{
//         FileReaderManager.getInstance().getCofigFileReader().ConnectMobile();
//         }catch (Exception e){
//         System.out.println(e);
//         }
