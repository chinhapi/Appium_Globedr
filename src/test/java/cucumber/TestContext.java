package cucumber;

import manages.FileReaderManager;
import manages.PageObjectManager;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class TestContext {
    private FileReaderManager fileReaderManager;
    private PageObjectManager pageObjectManager;
    public TestContext(){
        fileReaderManager = new FileReaderManager();
        fileReaderManager.getCofigFileReader().getConfigProperties();
        try{
            pageObjectManager = new PageObjectManager(fileReaderManager.getCofigFileReader().getDriver());
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public FileReaderManager getFileReaderManager(){
        return fileReaderManager;
    }
    public PageObjectManager getPageObjectManager(){
        return pageObjectManager;
    }
}
