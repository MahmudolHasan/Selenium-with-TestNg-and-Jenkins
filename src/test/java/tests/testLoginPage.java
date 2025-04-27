package tests;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;

public class testLoginPage extends BaseTest{
    LoginPage loginPage;

    @BeforeMethod
    public void setup(){
        initialization();
        loginPage = new LoginPage();
    }

    @Test
    public void loginWithValidCred(){
        String userName =prop.getProperty("userName");
        String password =prop.getProperty("password");
        String title = loginPage.getTitle();
        loginPage.setUserName(userName);
        loginPage.setPassword(password);
        loginPage.clcikOnLoginBtn();
        String newTitle = loginPage.getTitle();
        Assert.assertEquals(title, newTitle);
    }

}
