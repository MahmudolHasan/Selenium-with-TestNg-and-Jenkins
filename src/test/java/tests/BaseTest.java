package tests;

import Base.Base;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

public class BaseTest extends Base {
    @AfterMethod
    public void quiteBrowser(){
        getDriver().quit();
    }
}
