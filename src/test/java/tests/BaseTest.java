package tests;

import Base.Base;
import org.testng.annotations.AfterMethod;

public class BaseTest extends Base {
    @AfterMethod
    public void quiteBrowser(){
        getDriver().quit();
    }
}
