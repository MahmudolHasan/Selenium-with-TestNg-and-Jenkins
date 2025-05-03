package tests;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.LoginPage;

public class TestLoginPage extends BaseTest{
    LoginPage loginPage;

    @BeforeMethod
    public void setup(){
        initialization();
        loginPage = new LoginPage();
    }

    @Parameters({"username","password"})
    @Test
    public void loginWithValidCred(String username, String password) {
        //String username = prop.getProperty("userName");
        //String password = prop.getProperty("password");
        //System.out.println(username + " " +
    //    String username =prop.getProperty("userName");
    //    String password =prop.getProperty("password");
        String title = loginPage.getTitle();
        loginPage.setUserName(username);
        loginPage.setPassword(password);
        loginPage.clcikOnLoginBtn();
        String newTitle = loginPage.getTitle();
        Assert.assertEquals(title, newTitle);
    }

}
