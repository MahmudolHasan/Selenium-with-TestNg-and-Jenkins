<<<<<<< HEAD
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
=======
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
>>>>>>> e6dc38c714501eb2d4a0638cbd5beaef153dc2f0
